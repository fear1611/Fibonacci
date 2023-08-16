package org.example.dynamic;

import org.example.iterative.IterativeExemple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicExsapleTest {

    @Test
    void testReturnsANumber() {
        //Given
        DynamicExsaple dynamic = new DynamicExsaple();

        //When && Then
        assertEquals(55, dynamic.fibonacci(10));
    }
}
