package ejercicios_manos_a_la_obra;

import java.util.Scanner;

/*
 * Ejercicio 6
 * Implementar un programa que le pida dos números enteros al usuario
 * y determine si ambos o alguno de ellos es mayor a 25.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // importamos la clase scanner
        Scanner sc = new Scanner(System.in);
        // declaramos variables
        int num1, num2;
        // mostramos mensajes por pantalla
        System.out.println("Ejercicio 6 comparar numeros");
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        sc.close();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25.");
        } else if (num1 > 25) {
            System.out.println("Sólo numero 1 es mayor a 25.");
        } else if (num2 > 25) {
            System.out.println("Sólo número 2 es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
        System.out.println("Fin!");
    }
}
