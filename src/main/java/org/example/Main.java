package org.example;

import org.example.fibonacci.PrintFB;

final class Main {
    private static final PrintFB PRINT_FB = new PrintFB();

    private Main() {
    }

    public static void main(final String[] args) {
        PRINT_FB.recursion(25);
        PRINT_FB.iteration(15);
        PRINT_FB.dynamic(9);
    }
}
