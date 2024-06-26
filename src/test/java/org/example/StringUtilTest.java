package org.example;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {
    @Test
    void testReverseString() {
        String input = "Hello";
        String expected = "olleH";
        String result = StringUtil.reverseString(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testReverseStringNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.reverseString(null);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "Hello, olleH",
            "'',''",
            "World, dlroW",
            "Java, avaJ"
    })
    void testReverseString(String input, String expected) {
        Assumptions.assumeFalse(input.isEmpty(), "Input should not be empty");

        String actual = StringUtil.reverseString(input);
        assertEquals(expected, actual);
    }
}
