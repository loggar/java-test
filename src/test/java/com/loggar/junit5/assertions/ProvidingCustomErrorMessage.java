package com.loggar.junit5.assertions;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Providing a Custom Error Message")
public class ProvidingCustomErrorMessage {
    @Nested
    @DisplayName("When boolean is false")
    class WhenBooleanIsFalse {

        @Test
        @DisplayName("Should be false")
        void shouldBeFalse() {
            assertFalse(false, "The boolean is not false");
        }
    }
}
