package com.loggar.junit5.assertions;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Writing assertions for lists")
class ListAssertionTest {

    @Nested
    @DisplayName("When we compare two lists")
    class WhenWeCompareTwoLists {

        private final List<Integer> FIRST = Arrays.asList(1, 2, 3);
        private final List<Integer> SECOND = Arrays.asList(1, 2, 3);

        @Test
        @DisplayName("Should contain the same elements")
        void shouldContainSameElements() {
            assertIterableEquals(FIRST, SECOND);
        }
    }
}