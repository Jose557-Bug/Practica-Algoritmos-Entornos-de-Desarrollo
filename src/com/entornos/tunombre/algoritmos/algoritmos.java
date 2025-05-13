package com.entornos.tunombre.algoritmos;

/**
 * Clase abstracta que contiene métodos estáticos para realizar
 * cálculos comunes como fibonacci, factorial y verificación de primos.
 * 
 * @author TuNombre
 */


public abstract class algoritmos {
	
    /**
     * Calcula el número de Fibonacci correspondiente al índice indicado.
     * 
     * @param numero Número entero mayor o igual que 0
     * @return Número de Fibonacci correspondiente al índice dado
     * @throws IllegalArgumentException si el número es menor que 0
     */
    
    public static int fibonacci(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número tiene que ser mayor o igual a 0");
        }
        if (num == 0) return 0;
        if (num == 1) return 1;
        int anterior = 0;
        int actual = 1;
        int siguiente = 1;
        for (int i = 2; i <= num; i++) {
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }

        return siguiente;
    }

    /**
     * Calcula el factorial de un número entero.
     * 
     * @param numero Número entero mayor o igual que 0
     * @return Factorial del número indicado
     * @throws IllegalArgumentException si el número es menor que 0
     */
    
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número tiene que ser mayor o igual a 0");
        }
        long resultado = 1;

        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        
        return resultado;
    }

    /**
     * Determina si un número es primo.
     * 
     * @param numero Número entero mayor o igual que 2
     * @return true si el número es primo, false en caso contrario
     * @throws IllegalArgumentException si el número es menor que 2
     */
    
    public static boolean primo(int num) {
        if (num < 2) {
            throw new IllegalArgumentException("El número tiene que ser mayor o igual a 2");
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
