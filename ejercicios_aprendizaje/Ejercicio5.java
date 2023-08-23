package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 5
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 * Math.sqrt().
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double num2, resultado;
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        System.out.println(num * 2);
        System.out.println(num * 3);
        num2 = (double) num;
        resultado = Math.sqrt(num2);
        System.out.println(resultado);
        sc.close();
    }
}
