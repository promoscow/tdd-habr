package ru.xpendence.tdd.generator

import org.springframework.stereotype.Component
import ru.xpendence.tdd.domain.Process
import ru.xpendence.tdd.domain.type.ProcessState

@Component
class ProcessGenerator {

    fun generate(): Process = Process(
        state = ProcessState.ACTIVE
    )
}