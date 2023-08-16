package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void testDynamic() {
        //Given
        final Fibonacci fibonacci = new Fibonacci();

        //When && Then
        assertEquals(55, fibonacci.dynamic(10));
    }

    @Test
    void testIteration() {
        //Given
        final Fibonacci fibonacci = new Fibonacci();

        //When && Then
        assertEquals(55, fibonacci.iteration(10));
    }

    @Test
    void testRecursion() {
        //Given
        final Fibonacci fibonacci = new Fibonacci();

        //When && Then
        assertEquals(55, fibonacci.recursion(10));
    }
}