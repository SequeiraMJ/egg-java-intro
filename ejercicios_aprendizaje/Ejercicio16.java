package ejercicios_aprendizaje;

import java.util.Random;
import java.util.Scanner;

/*
 * Ejercicio 16
 * Realizar un algoritmo que rellene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un numero a buscar en el vector. El
 * programa mostrará donde se encuentra el numero y si se encuentra
 * repetido
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 16");
        Scanner sc = new Scanner(System.in);
        int dimension, numeroBuscado;
        int[] numerosAleatorios;
        System.out.print("Ingrese la dimensión del vector: ");
        dimension = sc.nextInt();
        numerosAleatorios = new int[dimension];
        // Aqui primero relleno el vector, lo muestro por pantalla y despues
        // solicito al usuario que ingrese el número que desea buscar dentro
        // del vector. Esto es así para evitar buscar números inexistentes.
        rellenarVector(numerosAleatorios);
        mostrarVector(numerosAleatorios);
        System.out.print("Ingrese un numero a buscar dentro del vector: ");
        numeroBuscado = sc.nextInt();
        buscarNumero(numerosAleatorios, numeroBuscado);
        sc.close();
    }
    // Genera números aleatorios entre min y max
    public static int generateRandomInteger(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    // Rellena el vector pasado por parametro
    public static void rellenarVector(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generateRandomInteger(1, 10);
        }
    }
    // Muestra el vector pasado por parametro
    public static void mostrarVector(int[] numeros) {
        System.out.println("----- Inicio del vector -----");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "] ");
        }
        System.out.println("\n----- Fin del vector -----");
    }
    // Busca el numero en el vector.
    public static void buscarNumero(int[] numeros, int buscado) {
        int repetido = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println(buscado + " se encuentra en la posición: " + i);
                repetido += 1;
            }
        }
        if (repetido > 1) {
            System.out.println("El numero buscado se repite " + repetido + " veces.");
        } else {
            System.out.println("El numero buscado no se repite, o no aparece del todo.");
        }
    }
}
