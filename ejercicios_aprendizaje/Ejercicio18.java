package ejercicios_aprendizaje;

import java.util.Random;

/*
 * Ejercicio 18
 * Realizar un programa que rellene un matriz de 4 x 4 de valores
 * aleatorios y muestre la traspuesta de la matriz. La matriz
 * traspuesta de una matriz A se denota por B y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 18");
        int[][] matriz = new int[4][4];
        int[][] matrizT;
        llenarMatrizAleatoria(matriz);
        mostrarMatriz(matriz);
        matrizT = trasponerMatriz(matriz);
        mostrarMatriz(matrizT);
    }
    public static void llenarMatrizAleatoria(int[][] matriz) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Genera un número aleatorio de hasta dos cifras
                int numeroAleatorio = rand.nextInt(10,100);
                matriz[i][j] = numeroAleatorio;
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("-----Matriz-----");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println("-----Fin Matriz-----");
    }
    public static int[][] trasponerMatriz(int[][] matriz) {
        int[][] matrizT = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        return matrizT;
    }
}
