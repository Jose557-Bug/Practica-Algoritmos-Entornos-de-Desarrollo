package com.entornos.tunombre.algoritmos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestAlgoritmos {

    @Test
    public void testFibonacci() {
        assertEquals(0, algoritmos.fibonacci(0));
        assertEquals(1, algoritmos.fibonacci(1));
        assertEquals(13, algoritmos.fibonacci(7));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, algoritmos.factorial(0));
        assertEquals(120, algoritmos.factorial(5));
    }

    @Test
    public void testPrimo() {
        assertTrue(algoritmos.primo(5));
        assertFalse(algoritmos.primo(8));
    }

    @Test
    public void testExcepciones() {
        assertThrows(IllegalArgumentException.class, () -> algoritmos.fibonacci(-1));
        assertThrows(IllegalArgumentException.class, () -> algoritmos.factorial(-3));
        assertThrows(IllegalArgumentException.class, () -> algoritmos.primo(1));
    }
}
