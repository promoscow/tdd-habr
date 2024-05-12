package ru.xpendence.tdd.service.impl

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import ru.xpendence.tdd.CommonContext
import ru.xpendence.tdd.domain.type.ProcessState
import ru.xpendence.tdd.service.ProcessService
import java.util.UUID

class ProcessServiceTest : CommonContext() {

    @Autowired
    private lateinit var service: ProcessService

    @Test
    fun save() {
        //prepare
        val process = processGenerator.generate()
        //when
        service.save(process)
            .also { saved ->
                //then
                assertNotNull(saved.id)
                assertNotNull(saved.createdAt)
                assertEquals(process.state, saved.state)
            }
    }

    @Test
    fun get() {
        //prepare
        val process = processGenerator.generate().let { service.save(it) }
        //when
        service.get(process.id!!)
            .also {
                //then
                assertNotNull(it)
                assertEquals(process.id, it.id)
            }
    }

    @Test
    fun get_notFound() {
        //prepare
        val process = processGenerator.generate().let { service.save(it) }
        val randomId = UUID.randomUUID()
        assertNotEquals(process.id, randomId)
        //when
        //then
        assertThrows(IllegalStateException::class.java) { service.get(randomId) }
    }

    @Test
    fun update() {
        //prepare
        val process = processGenerator.generate().let { service.save(it) }
        val state = ProcessState.SUSPENDED
        val toUpdate = process.copy(state = state)
        assertNotEquals(process.state, toUpdate.state)
        //when
        service.update(toUpdate)
        //then
        service.get(toUpdate.id!!)
            .also { updated ->
                assertEquals(toUpdate.state, updated.state)
                assertNotNull(updated.updatedAt)
            }
    }
}