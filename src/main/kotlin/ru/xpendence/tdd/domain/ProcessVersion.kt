package ru.xpendence.tdd.domain

import java.time.OffsetDateTime
import java.util.UUID

data class ProcessVersion(
    val id: UUID? = null,
    val processId: UUID,
    val name: String? = null,
    val createdAt: OffsetDateTime? = null,
    val updatedAt: OffsetDateTime? = null,
    val version: String? = null,
    val businessFamily: String? = null,
    val ownerRole: String? = null,
    val active: Boolean? = null
)
