package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 1
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        resultado = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
        sc.close();
    }
}