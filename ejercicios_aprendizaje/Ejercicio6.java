package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 6
 * Crear un programa que dado un número determine si es par o impar
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número entero: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
        sc.close();
    }
}
