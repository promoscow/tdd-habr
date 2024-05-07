package ru.xpendence.tdd.service

import ru.xpendence.tdd.domain.Process
import java.util.UUID

interface ProcessService {

    fun save(process: Process): Process

    fun update(process: Process)

    fun get(id: UUID): Process

    fun delete(id: UUID)
}