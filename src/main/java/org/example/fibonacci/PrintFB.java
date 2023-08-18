package org.example.fibonacci;

import java.time.Duration;
import java.time.LocalTime;

public final class PrintFB {
    private static final SolutionFB SOLUTION_FB = new SolutionFB();
    private static final String DURATION = "Duration - ";

    public void execute() {

    }

    public void recursion(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Recursion(" + n + ") = "
                + SOLUTION_FB.recursion(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }

    public void iteration(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Iteration(" + n + ") = "
                + SOLUTION_FB.iteration(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(1)\n" + "Time complexity - O(n)");
    }

    public void dynamic(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Dynamic(" + n + ") = "
                + SOLUTION_FB.dynamic(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }
}
