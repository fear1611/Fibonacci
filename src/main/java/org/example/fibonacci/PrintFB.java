package org.example.fibonacci;

import java.time.Duration;
import java.time.LocalTime;

public final class PrintFB implements Print {
    private static final String DURATION = "Duration - ";
    private static final SolutionFB SOLUTION_FB = new SolutionFB();

    @Override
    public void execute(final String method, final int n) {
        switch (method.toLowerCase()) {
            case "recursion" -> printRecursion(n);
            case "iteration" -> printIteration(n);
            case "dynamic" -> printDynamic(n);
            default -> throw new IllegalStateException("Unexpected value: " + method.toLowerCase());
        }
    }

    private void printRecursion(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Recursion(" + n + ") = "
                + SOLUTION_FB.recursion(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }

    private void printIteration(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Iteration(" + n + ") = "
                + SOLUTION_FB.iteration(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(1)\n" + "Time complexity - O(n)");
    }

    private void printDynamic(final int n) {
        LocalTime timeStart = LocalTime.now();
        System.out.println("\nFib-Dynamic(" + n + ") = "
                + SOLUTION_FB.dynamic(n));
        LocalTime timeEnd = LocalTime.now();

        Duration duration = Duration.between(timeStart, timeEnd);
        System.out.println(DURATION + duration);

        System.out.println("Spatial complexity - O(n)\n" + "Time complexity - O(2^n)");
    }
}

