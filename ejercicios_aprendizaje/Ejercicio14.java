package ejercicios_aprendizaje;

import java.util.Scanner;

/*
 * Ejercicio 14
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes
 * o libras. La función tendrá como parámetros, la cantidad de euros y la moneda
 * a converir que será una cadena, este no devolverá ningún valor y mostrará un
 * mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        // Objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        // Variables requeridas
        boolean continuar = true;
        double eur;
        int opc;
        do { // Un menu para darle funcionalidad al programa
            System.out.print("Ingrese una cantidad de Euros: ");
            eur = sc.nextDouble();
            System.out.print("Opciones disponibles:\n1- Libras\n2- Dolares"
            + "\n3- Yenes\n4- Salir\nElija una opcion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    convertirDivisa(eur, "libras");
                    break;
                case 2:
                    convertirDivisa(eur, "dolares");
                    break;
                case 3:
                    convertirDivisa(eur, "yenes");
                    break;
                case 4:
                    System.out.println("Hasta pronto...");
                    continuar = false;
                    break;            
                default:
                    System.out.println("Opcion no disponible...");
                    break;
            }
        } while (continuar);
        sc.close();
    }
    public static void convertirDivisa(double euros, String divisa) {
        double salida = 0, libras = 0.86, dolares = 1.28611, yenes = 129.852;
        switch (divisa) {
            case "libras":
                salida = euros * libras;
                break;
            case "dolares":
                salida = euros * dolares;
                break;
            case "yenes":
                salida = euros * yenes;
                break;
            default:
                System.out.println("Opcion no disponible...");
                break;
        }
        System.out.println("El tipo de cambio corresponde a: " + salida + " " + divisa);
    }
}
