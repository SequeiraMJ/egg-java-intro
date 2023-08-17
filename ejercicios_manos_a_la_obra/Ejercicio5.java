package ejercicios_manos_a_la_obra;

import java.util.Scanner;

/*
 * Ejercicio 5
 * Define una variable de tipo boolean, double y char.
 * Guarda información en ellas a través del Scanner.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean myVar;
        double myNum;
        char myChar;
        System.out.print("Ingrese un booleano: ");
        myVar = sc.nextBoolean();
        System.out.print("Ingrese un double: ");
        myNum = sc.nextDouble();
        System.out.print("Ingrese un char: ");
        myChar = sc.next().charAt(0);
        sc.close();
        System.out.println(myVar);
        System.out.println(myNum);
        System.out.println(myChar);
    }
}
