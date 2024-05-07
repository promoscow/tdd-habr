package ru.xpendence.tdd.domain

import java.util.UUID

data class Node<T>(
    val id: UUID? = null,
    val name: String,
    val processVersionId: String,
    val metadata: T? = null
)
