package org.example;

final class Main {

    private static final int N = 10;

    private static final Fibonacci FIBONACCI = new Fibonacci();

    private Main() {
    }

    public static void main(final String[] args) {
        System.out.println("Fib-Recursion(" + N + ") = "
                + FIBONACCI.recursion(N));

        System.out.println("Fib-Iteration(" + N + ") = "
                + FIBONACCI.iteration(N));

        System.out.println("Fib-Dynamic(" + N + ") = "
                + FIBONACCI.dynamic(N));
    }
}
