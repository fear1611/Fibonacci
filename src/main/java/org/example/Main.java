package org.example;

final class Main {

    private static final int N = 10;

    private static final Fibonacci FIBONACCI = new Fibonacci();

    private Main() {
    }
    public static void main(final String[] args) {
        fibRecursion(N);
        fibIteration(N);
        fibDynamic(N);
    }

    private static void fibRecursion(final int n) {
        System.out.println("Fib-Recursion(" + n + ") = "
                + FIBONACCI.recursion(n));
    }

    private static void fibIteration(final int n) {
        System.out.println("Fib-Iteration(" + n + ") = "
                + FIBONACCI.iteration(n));
    }

    private static void fibDynamic(final int n) {
        System.out.println("Fib-Dynamic(" + n + ") = "
                + FIBONACCI.dynamic(n));
    }
}
