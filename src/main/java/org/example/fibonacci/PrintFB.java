package org.example.fibonacci;

import java.time.Duration;
import java.time.LocalTime;

public final class PrintFB implements Print {
    private static final String DURATION = "Duration - ";
    private static final SolutionFB SOLUTION_FB = new SolutionFB();

    @Override
    public void execute(final String method, final int n) {
        if (method.equalsIgnoreCase("recursion")) {
            recursion(n);
        } else if (method.equalsIgnoreCase("iteration")) {
            iteration(n);
        } else if (method.equalsIgnoreCase("dynamic")) {
            dynamic(n);
        }
    }

    private void recursion(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Recursion(" + n + ") = "
                + SOLUTION_FB.recursion(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }

    private void iteration(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Iteration(" + n + ") = "
                + SOLUTION_FB.iteration(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(1)\n" + "Time complexity - O(n)");
    }

    private void dynamic(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Dynamic(" + n + ") = "
                + SOLUTION_FB.dynamic(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }
}

