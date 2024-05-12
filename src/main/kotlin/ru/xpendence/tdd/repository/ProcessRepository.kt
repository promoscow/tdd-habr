package ru.xpendence.tdd.repository

import ru.xpendence.tdd.domain.Process
import java.util.UUID

interface ProcessRepository {
    fun save(process: Process): Process
    fun find(id: UUID): Process?
    fun update(process: Process)
}