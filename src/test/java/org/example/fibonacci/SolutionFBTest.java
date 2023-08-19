package org.example.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionFBTest {

    @Test
    void testDynamic() {
        //Given
        final SolutionFB solutionFB = new SolutionFB();

        //When && Then
        assertEquals(13, solutionFB.dynamic(7));
    }

    @Test
    void testIteration() {
        // Given
        final SolutionFB solutionFB = new SolutionFB();

        // When && Then
        assertEquals(0, solutionFB.iteration(0));
    }

    @Test
    void testRecursion() {
        //Given
        final SolutionFB solutionFB = new SolutionFB();

        //When && Then
        assertEquals(55, solutionFB.recursion(10));
    }
}