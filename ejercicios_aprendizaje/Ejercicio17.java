package ejercicios_aprendizaje;

import java.util.Random;

/*
 * Ejercicio 17
 * Recorrer un vector de N enteros contabilizando cuántos números son
 * de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 17");
        int[] vector = new int[1000];
        System.out.println("----------Llenando vector----------");
        llenarVectorAleatorio(vector);
        System.out.println("----------Mostrando vector----------");
        recorrerVector(vector);
    }
    public static void llenarVectorAleatorio(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            // Genera un número aleatorio de hasta cinco cifras (entre 0 y 99999)
            int numeroAleatorio = rand.nextInt(100000);
            vector[i] = numeroAleatorio;
        }
    }
    public static int contarCifras(int num) {
        int cifras = 0;
        if (num == 0) {
            return 1; // El número 0 tiene una cifra
        }
        while (num != 0) {
            cifras++;
            num /= 10; // Dividir el número por 10 para eliminar la última cifra
        }
        return cifras;
    }
    
    public static void recorrerVector(int[] vector) {
        int unoC = 0, dosC = 0, tresC = 0, cuatroC = 0, cincoC = 0; // Cantidad de Cifras
        for (int i : vector) {
            System.out.print("[" + i + "] ");
            switch (contarCifras(i)) {
                case 1:
                    unoC += 1;
                    break;
                case 2:
                    dosC += 1;
                    break;
                case 3:
                    tresC += 1;
                    break;
                case 4:
                    cuatroC += 1;
                    break;
                case 5:
                    cincoC += 1;
                    break;
                default:
                    System.out.println("Ha ocurrido un error inesperado...");
                    break;
            }
        }
        System.out.println();
        System.out.println("\n-----Elementos clasificados por sus cifras-----\n");
        System.out.println("Numeros con 1 cifra: " + unoC);
        System.out.println("Numeros con 2 cifras: " + dosC);
        System.out.println("Numeros con 3 cifras: " + tresC);
        System.out.println("Numeros con 4 cifras: " + cuatroC);
        System.out.println("Numeros con 5 cifras: " + cincoC);
    }

}
