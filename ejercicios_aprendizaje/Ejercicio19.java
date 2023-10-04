package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 19
 * Realice un programa que compruebe si una matriz dada es
 * anti simétrica. Se dice que una matriz A es anti simétrica
 * cuando ésta es igual a su propia traspuesta, pero cambiada
 * de signo. Es decir, A es anti simétrica si A = -AT. La matriz
 * traspuesta de una matriz A se denota por AT y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 19");
        int dim;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas y columnas: ");
        dim = sc.nextInt();
        int[][] matriz = new int[dim][dim];
        int[][] matrizT;
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        matrizT = trasponerMatriz(matriz);
        mostrarMatriz(matrizT);
        System.out.print("Matriz antisimetrica: ");
        System.out.print(verificarAntisimetrica(matriz, matrizT));
        sc.close();
    }
    public static void llenarMatriz(int[][] matriz) {
        System.out.println("Ingrese los elementos de la matriz:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
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
    public static boolean verificarAntisimetrica(int[][] mat1, int[][] mat2) {
        boolean antisimetrica = true;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if (!(mat1[i][j] == (-1 * mat2[i][j]))) {
                    antisimetrica = false;
                }
            }
        }
        return antisimetrica;
    }
}
