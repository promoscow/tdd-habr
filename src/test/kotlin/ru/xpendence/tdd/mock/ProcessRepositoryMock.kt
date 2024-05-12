package ru.xpendence.tdd.mock

import org.springframework.stereotype.Component
import ru.xpendence.tdd.domain.Process
import ru.xpendence.tdd.repository.ProcessRepository
import java.time.OffsetDateTime
import java.util.UUID

@Component
class ProcessRepositoryMock(
    private val processMockStorage: MutableMap<UUID, Process>
) : ProcessRepository {

    override fun save(process: Process): Process =
        process
            .copy(
                id = UUID.randomUUID(),
                createdAt = OffsetDateTime.now()
            )
            .also { processMockStorage[it.id!!] = it }

    override fun delete(id: UUID) {
        processMockStorage.remove(id)
    }

    override fun update(process: Process) {
        process
            .copy(updatedAt = OffsetDateTime.now())
            .also { processMockStorage[it.id!!] = it }
    }

    override fun find(id: UUID): Process? = processMockStorage[id]
}