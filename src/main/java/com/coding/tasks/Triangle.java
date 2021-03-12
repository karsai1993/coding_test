package com.coding.tasks;

public class Triangle {

    public static Double calculateArea(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException(
                    String.format("Triangle cannot have any side with 0 or less size [ a=%d b=%d c=%d ]", a, b, c)
            );
        }

        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException(
                    String.format(
                            "Side sizes are not for a triangle due to Triangle Inequality Theorem [ a=%d b=%d c=%d ]",
                            a, b, c
                    )
            );
        }

        double subValue = (double) (a + b + c) / 2;

        double calculatedArea = roundThreeDigits(
                Math.sqrt(
                        subValue * (subValue - a) * (subValue - b) * (subValue - c)
                )
        );
        System.out.printf("The calculated area is %s%n", calculatedArea);

        return calculatedArea;
    }

    public static double roundThreeDigits(double value) {
        long factor = (long) Math.pow(10, 3);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
