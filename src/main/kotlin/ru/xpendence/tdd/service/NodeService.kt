package ru.xpendence.tdd.service

import ru.xpendence.tdd.domain.Node
import java.util.UUID

interface NodeService {

    fun save(node: Node<out Any>): Node<out Any>

    fun update(node: Node<out Any>)

    fun get(id: UUID): Node<out Any>

    fun delete(id: UUID)
}