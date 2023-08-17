package org.example.fibonacci;

import java.time.Duration;
import java.time.LocalTime;

public final class PrintFB {
    private static final Fibonacci FIBONACCI = new Fibonacci();
    private static final String DURATION = "Duration - ";

    public void recursion(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Recursion(" + n + ") = "
                + FIBONACCI.recursion(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }

    public void iteration(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Iteration(" + n + ") = "
                + FIBONACCI.iteration(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(1)\n" + "Time complexity - O(n)");
    }

    public void dynamic(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Dynamic(" + n + ") = "
                + FIBONACCI.dynamic(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }
}
