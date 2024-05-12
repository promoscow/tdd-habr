package ru.xpendence.tdd.domain

import ru.xpendence.tdd.domain.type.ProcessState
import java.time.OffsetDateTime
import java.util.UUID

data class Process(
    val id: UUID? = null,
    val state: ProcessState,
    val createdAt: OffsetDateTime? = null,
    val updatedAt: OffsetDateTime? = null,
    val processVersions: List<ProcessVersion>? = null
)
