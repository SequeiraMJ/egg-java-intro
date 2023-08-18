package ejercicios_manos_a_la_obra;

import java.util.Scanner;

/*
 * Ejercicio 9
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
 * bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
 * el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 * Nota: recordar el uso de la sentencia break.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        // importamos la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 9 for y break");
        int num, suma;
        suma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Se capturo el numero 0");
                break;
            }
            if (num > 0) {
                suma += num;
            }
        }
        System.out.print("La suma de los números ingresados es: " + suma);
        sc.close();
    }
}
