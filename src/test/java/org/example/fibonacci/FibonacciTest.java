package org.example.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void testDynamic() {
        //Given
        final Fibonacci fibonacci = new Fibonacci();

        //When && Then
        assertEquals(13, fibonacci.dynamic(7));
    }

    @Test
    void testIteration() {
        //Given
        final Fibonacci fibonacci = new Fibonacci();

        //When && Then
        assertEquals(5, fibonacci.iteration(5));
    }

    @Test
    void testRecursion() {
        //Given
        final Fibonacci fibonacci = new Fibonacci();

        //When && Then
        assertEquals(55, fibonacci.recursion(10));
    }
}