package org.example;

public class StringUtil {
    public static String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("input can`t null");
        }
        StringBuilder reversedString = new StringBuilder(input);
        return reversedString.reverse().toString();
    }
}
