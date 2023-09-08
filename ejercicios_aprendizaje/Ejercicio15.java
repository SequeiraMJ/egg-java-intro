package ejercicios_aprendizaje;

/*
 * Ejercicio 15
 * Realizar un algoritmo que rellene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 15");
        int[] vectorEnteros = new int[100];
        rellenarVector(vectorEnteros);
        System.out.println("Mostramos el vector en el orden normal");
        System.out.println("--------------------------------------");
        mostrarVector(vectorEnteros);
        System.out.println();
        System.out.println("Mostramos el vector en el orden reverso");
        System.out.println("---------------------------------------");
        mostrarVectorReverso(vectorEnteros);
    }
    public static void rellenarVector(int[] vectorEnteros) {
        for (int i = 0; i < vectorEnteros.length; i++) {
            vectorEnteros[i] = i + 1;
        }
    }
    public static void mostrarVector(int[] vectorEnteros) {
        for (int i = 0; i < vectorEnteros.length; i++) {
            System.out.print("[" + vectorEnteros[i] + "] ");
        }
    }
    public static void mostrarVectorReverso(int[] vectorEnteros) {
        for (int i = (vectorEnteros.length -1); i >= 0 ; i--) {
            System.out.print("[" + vectorEnteros[i] + "] ");
        }
    }
}
