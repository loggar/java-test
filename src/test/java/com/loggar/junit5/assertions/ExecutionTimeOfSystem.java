package com.loggar.junit5.assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Writing assertions for the execution time of the system under test")
public class ExecutionTimeOfSystem {
    @Test
    @DisplayName("Should return the correct message before timeout is exceeded")
    void shouldReturnCorrectMessageBeforeTimeoutIsExceeded() {
        final String message = assertTimeout(Duration.ofMillis(50), () -> {
            Thread.sleep(20);
            return "Hello World!";
        });
        assertEquals("Hello World!", message);
    }

    @Test
    @DisplayName("Should return the correct message before timeout is exceeded")
    void shouldReturnCorrectMessageBeforeTimeoutIsExceeded2() {
        final String message = assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
            Thread.sleep(20);
            return "Hello World!";
        });
        assertEquals("Hello World!", message);
    }
}
