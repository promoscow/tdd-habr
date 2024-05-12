package ru.xpendence.tdd

import org.junit.jupiter.api.AfterEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.xpendence.tdd.domain.Process
import ru.xpendence.tdd.generator.ProcessGenerator
import java.util.UUID

@SpringBootTest
abstract class CommonContext {

    @Autowired
    protected lateinit var processGenerator: ProcessGenerator

    @Autowired
    private lateinit var processStorageMock: MutableMap<UUID, Process>

    @AfterEach
    fun cleanUp() {
        processStorageMock.clear()
    }
}