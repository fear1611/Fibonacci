package org.example;

import org.example.fibonacci.PrintFB;

final class Main {
    private static final PrintFB PRINT_FB = new PrintFB();

    private Main() {
    }

    public static void main(final String[] args) {
        PRINT_FB.execute("recursion", 10);
        PRINT_FB.execute("iteration", 25);
        PRINT_FB.execute("dynamic", 7);
    }
}
