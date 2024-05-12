package ru.xpendence.tdd.repository

import ru.xpendence.tdd.domain.Process

interface ProcessRepository {
    fun save(process: Process): Process
}