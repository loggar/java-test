package com.loggar.junit5.assertj;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Writing assertions for objects")
class ObjectAssertionTest {

    @Nested
    @DisplayName("When object is null")
    class WhenObjectIsNull {

        private final Object NULL = null;

        @Test
        @DisplayName("Should be null")
        void shouldBeNull() {
            assertThat(NULL).isNull();
        }
    }

    @Nested
    @DisplayName("When object is not null")
    class WhenObjectIsNotNotNull {

        @Test
        @DisplayName("Should not be null")
        void shouldNotBeNull() {
            assertThat(new Object()).isNotNull();
        }
    }

    @Nested
    @DisplayName("When two objects are equal")
    class WhenTwoObjectsAreEqual {

        @Nested
        @DisplayName("When objects are integers")
        class WhenObjectsAreIntegers {

            private final Integer ACTUAL = 9;
            private final Integer EXPECTED = 9;

            @Test
            @DisplayName("Should be equal")
            void shouldBeEqual() {
                assertThat(ACTUAL).isEqualByComparingTo(EXPECTED);
            }
        }
    }

    @Nested
    @DisplayName("When two objects aren't equal")
    class WhenTwoObjectsAreNotEqual {

        @Nested
        @DisplayName("When objects are integers")
        class WhenObjectsAreIntegers {

            private final Integer ACTUAL = 9;
            private final Integer EXPECTED = 4;

            @Test
            @DisplayName("Should not be equal")
            void shouldNotBeEqual() {
                assertThat(ACTUAL).isNotEqualByComparingTo(EXPECTED);
            }
        }
    }

    @Nested
    @DisplayName("When two objects refer to the same object")
    class WhenTwoObjectsReferToSameObject {

        private final Object ACTUAL = new Object();
        private final Object EXPECTED = ACTUAL;

        @Test
        @DisplayName("Should refer to the same object")
        void shouldReferToSameObject() {
            assertThat(ACTUAL).isSameAs(EXPECTED);
        }
    }

    @Nested
    @DisplayName("When two objects don't refer to the same object")
    class WhenTwoObjectsDoNotReferToSameObject {

        private final Object ACTUAL = new Object();
        private final Object EXPECTED = new Object();

        @Test
        @DisplayName("Should not refer to the same object")
        void shouldNotReferToSameObject() {
            assertThat(ACTUAL).isNotSameAs(EXPECTED);
        }
    }
}