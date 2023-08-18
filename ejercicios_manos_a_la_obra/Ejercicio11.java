package ejercicios_manos_a_la_obra;

import java.util.Scanner;

/*
 * Ejercicio 11
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
 * en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
 * reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a
 * las vocales acentuadas) se mantienen sin cambios.
 * a e i o u
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
 * correspondiente. Utilice la estructura “según” para la transformación.
 * Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
 * La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        // importamos la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 11 encriptador");
        String frase, fraseEncriptada;
        System.out.print("Escriba una frase para encriptar: ");
        frase = sc.nextLine();
        fraseEncriptada = encriptar(frase);
        System.out.println(fraseEncriptada);
        sc.close();
    }
    public static String encriptar(String frase) {
        String fraseEncriptada = "";
        char aux;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            aux = frase.charAt(i);
            switch (aux) {
                case 'a':
                    fraseEncriptada += "@";
                    break;
                case 'e':
                    fraseEncriptada += "#";
                    break;
                case 'i':
                    fraseEncriptada += "$";
                    break;
                case 'o':
                    fraseEncriptada += "%";
                    break;
                case 'u':
                    fraseEncriptada += "*";
                    break;
                default:
                    fraseEncriptada += aux;
                    break;
            }
        }
        return fraseEncriptada;
    }
}
