package com.entornos.tunombre.algoritmos;

public abstract class algoritmos {
    
    
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
