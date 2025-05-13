package com.entornos.tunombre.algoritmos;

import java.util.Random;
import java.util.HashSet;

public class Principal {

    public static void main(String[] args) {

        //Array con numero aleatorios del 2 al 10
        int[] numeros = new int[3];
        HashSet<Integer> usados = new HashSet<>();
        Random aleatorio = new Random();
        int i = 0;

        while (i < 3) {
            int num = aleatorio.nextInt(9) + 2;
            if (!usados.contains(num)) {
                numeros[i] = num;
                usados.add(num);
                i++;
            }
        }

        //Resultados
        int[] resultadoFibonacci = new int[3];
        long[] resultadoFactorial = new long[3];
        boolean[] resultadoPrimos = new boolean[3];
        for (int j = 0; j < 3; j++) {
            resultadoFibonacci[j] = algoritmos.fibonacci(numeros[j]);
            resultadoFactorial[j] = algoritmos.factorial(numeros[j]);
            resultadoPrimos[j] = algoritmos.primo(numeros[j]);
        }
    }
}
