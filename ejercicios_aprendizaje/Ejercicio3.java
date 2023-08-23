package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 3
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();
        System.out.println("La frase ingresada es: ");
        System.out.println(frase);
        System.out.println("La frase en mayúsculas: ");
        frase = frase.toUpperCase();
        System.out.println(frase);
        System.out.println("Ahora la frase en minúsculas: ");
        frase = frase.toLowerCase();
        System.out.println(frase);
        sc.close();
    }
}
