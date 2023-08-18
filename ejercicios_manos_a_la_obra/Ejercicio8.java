package ejercicios_manos_a_la_obra;

import java.util.Scanner;

/*
 * Ejercicio 8
 * Escriba un programa que valide si una nota está entre 0 y 10, si no está
 * entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        // importamos la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 8 while");
        System.out.print("Ingrese una nota entre 0 y 10: ");
        int nota = sc.nextInt();
        while (nota > 10 || nota < 0) {
            System.out.println("Nota invalida...");
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = sc.nextInt();
        }
        sc.close();
    }
}
