package com.loggar.junit5.hamcrest;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Providing a Custom Error Message")
public class ProvidingCustomErrorMessage {
    @Nested
    @DisplayName("When we write assertions for elements")
    class WhenWeWriteAssertionsForElements {

        private Object first;
        private Object second;

        private List<Object> list;

        @BeforeEach
        void createAndInitializeList() {
            first = new Object();
            second = new Object();

            list = Arrays.asList(first, second);
        }

        @Test
        @DisplayName("Should contain a correct element")
        void shouldContainCorrectElementWithCustomErrorMessage() {
            assertThat(String.format("The list doesn't contain the expected object: %s", first), list, hasItem(first));
        }
    }
}
