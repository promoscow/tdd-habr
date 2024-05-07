package ru.xpendence.tdd.service

import ru.xpendence.tdd.domain.ProcessVersion
import java.util.UUID

interface ProcessVersionService {

    fun save(processVersion: ProcessVersion): ProcessVersion

    fun update(processVersion: ProcessVersion)

    fun get(id: UUID): ProcessVersion

    fun delete(id: UUID)
}