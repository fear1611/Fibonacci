package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

final class SolutionFB implements Fibonacci {
    private static final Map<Integer, Long> MEMO = new HashMap<>();


    @Override
    public long dynamic(int n) {
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

    @Override
    public long iteration(int n) {
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

    @Override
    public long recursion(int n) {
        if (n <= 1) {
            return n;
        }

        return recursion(n - 1) + recursion(n - 2);
    }
}
