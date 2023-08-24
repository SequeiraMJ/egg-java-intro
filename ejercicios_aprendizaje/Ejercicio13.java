package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 13
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “ * ”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 *  *  *  *  *
 *  *        *
 *  *        *
 *  *  *  *  *
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite un numero entero: ");
        num = sc.nextInt();
        dibujarCuadrado(num);
        sc.close();
    }
    public static void dibujarCuadrado(int numero) {
        for (int i = 0; i < numero; i++) { // filas
            for (int j = 0; j < numero; j++) { // columnas
                if (i == 0 || i == (numero -1) || j == 0 || j == (numero -1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }
}
