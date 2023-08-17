package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

final class Fibonacci {
    private static final Map<Integer, Long> MEMO = new HashMap<>();

    long dynamic(final int n) {
        if (n <= 1) {
            return n;
        }

        if (MEMO.containsKey(n)) {
            return MEMO.get(n);
        }

        long fib = dynamic(n - 1) + dynamic(n - 2);

        MEMO.put(n, fib);
        return fib;
    }

    long iteration(final int n) {
        int n1 = 0;
        int n2 = 1;
        int result = n;

        for (int i = 1; i < n; ++i) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }

        return result;
    }

    long recursion(final int n) {
        if (n <= 1) {
            return n;
        }

        return recursion(n - 1) + recursion(n - 2);
    }
}
