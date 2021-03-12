package com.coding.tasks;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private static final Long DEFAULT_FROM_VALUE = 1L;
    private static final Long DEFAULT_TO_VALUE = 10L;

    public static List<Long> print() {
        return print(null, null);
    }

    public static List<Long> print(Long initialFromValue, Long initialToValue) {
        long fromValue = getNumberIfDefinedOrDefault(initialFromValue, DEFAULT_FROM_VALUE);
        long toValue = getNumberIfDefinedOrDefault(initialToValue, DEFAULT_TO_VALUE);

        if (toValue < fromValue) {
            throw new IllegalArgumentException(
                    String.format(
                            "Cannot print numbers between the boundaries " +
                                    "as the ending value (%d) is smaller than the starting one (%d)",
                            toValue, fromValue
                    )
            );
        }

        List<Long> printedNumbers = new ArrayList<>();

        for (long actualValue = fromValue; actualValue < toValue + 1; actualValue++) {
            System.out.printf("Actual number: %d%n", actualValue);
            printedNumbers.add(actualValue);
        }

        System.out.println("The whole list of printed values is the following:");
        System.out.println(printedNumbers);

        return printedNumbers;
    }

    private static long getNumberIfDefinedOrDefault(Long initialValue, Long defaultValue) {
        if (initialValue == null) {
            return defaultValue;
        } else {
            return initialValue;
        }
    }
}
