package ru.xpendence.tdd.service.impl

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import ru.xpendence.tdd.CommonContext
import ru.xpendence.tdd.service.ProcessService

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
}