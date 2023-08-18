package ejercicios_manos_a_la_obra;

import java.util.Scanner;

/*
 * Ejercicio 14
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 14 vectores");
        String [] equipo = new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el elemento de la posición " + i);
            equipo [i] = sc.nextLine();
        }
        // esta parte es extra, imprime los elementos del vector
        System.out.println("Mostramos los elementos del vector:");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + equipo[i] + "]");
        }
        sc.close();
    }
}
