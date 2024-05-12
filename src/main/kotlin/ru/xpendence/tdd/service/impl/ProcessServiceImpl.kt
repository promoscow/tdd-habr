package ru.xpendence.tdd.service.impl

import org.springframework.stereotype.Service
import ru.xpendence.tdd.domain.Process
import ru.xpendence.tdd.repository.ProcessRepository
import ru.xpendence.tdd.service.ProcessService
import java.util.UUID

@Service
class ProcessServiceImpl(
    private val repository: ProcessRepository
) : ProcessService {

    override fun save(process: Process): Process = repository.save(process)

    override fun update(process: Process) {
        TODO("Not yet implemented")
    }

    override fun get(id: UUID): Process = repository.find(id)
        ?: throw IllegalStateException("Process not found by id: $id")

    override fun delete(id: UUID) {
        TODO("Not yet implemented")
    }
}