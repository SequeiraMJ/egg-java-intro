package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 11
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
 * pantalla el siguiente menú:
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opción:
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
 * pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale 
 * del programa, caso contrario se vuelve a mostrar el menú.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, opc;
        double aux = 0;
        char salir = 'N';
        System.out.println("Ingrese dos números enteros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        do {
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            System.out.print("Elija una opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Suma");
                    System.out.println(num1 + num2);
                    break;
                case 2:
                System.out.println("Resta");
                    System.out.println(num1 - num2);
                    break;
                case 3:
                System.out.println("Multiplicación");
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println("División");
                    aux = (double) (num1) / (double) (num2);
                    System.out.println(aux);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = sc.next().toUpperCase().charAt(0);
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        } while (salir != 'S');
        sc.close();
    }
}
