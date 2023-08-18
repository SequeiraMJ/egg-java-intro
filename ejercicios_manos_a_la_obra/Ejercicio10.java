package ejercicios_manos_a_la_obra;

import java.util.Scanner;

/*
 * Ejercicio 10
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
 * ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 * 5 *****
 * 3 ***
 * 11 ***********
 * 2 **
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 10 bucles anidados");
        int num;
        for (int i = 0; i < 4; i++) {
            do {
                System.out.print("Ingrese un número entre 1 y 20: ");
                num = sc.nextInt();
            } while (num < 1 || num > 20);
            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
