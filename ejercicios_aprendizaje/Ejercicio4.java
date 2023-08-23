package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 4
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.print("Ingrese grados Celsius: ");
        c = sc.nextDouble();
        f = 32 + (c * 9 / 5);
        System.out.println(c + "° Celsius equivalen a " + f + "° Fahrenheit");
        sc.close();
    }
}
