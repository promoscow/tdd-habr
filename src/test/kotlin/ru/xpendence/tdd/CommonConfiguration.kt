package ru.xpendence.tdd

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.xpendence.tdd.domain.Process
import java.util.UUID

@Configuration
class CommonConfiguration {

    @Bean
    fun processStorageMock(): MutableMap<UUID, Process> = mutableMapOf()
}