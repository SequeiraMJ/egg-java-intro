package ejercicios_manos_a_la_obra;

/*
 * Ejercicio 3
 * Define variables donde puedas alojar los resultados y prueba usar
 * dos operadores de cada tipo.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3 operadores");
        int num1, num2;
        double num3, num4;
        boolean relacion;
        num1 = 5; num2 = 7;
        num3 = num1 / num2;
        num4 = num1 * num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        // Operadores unarios
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);
        ++num1;
        --num2;
        System.out.println(num1);
        System.out.println(num2);
        relacion = num1 != num2;
        System.out.println(relacion);
        relacion = num3 == num4;
        System.out.println(relacion);
    }
}
