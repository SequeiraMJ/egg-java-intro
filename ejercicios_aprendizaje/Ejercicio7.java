package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 7
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
 * investigar la función equals() en Java.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Escriba una frase: ");
        frase = sc.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        sc.close();
    }    
}
