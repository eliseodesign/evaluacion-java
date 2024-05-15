package ejercicios;

import java.util.Scanner;

// Desarrollar un programa que solicite un número entero positivo y como resultado muestre todos los números impares
// entre 0 y el número ingresado. Utilizar la estructura repetitiva “For”.
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3 - Mostrar números impares entre 0 y un número ingresado");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número ingresado no es positivo.");
            return;
        }

        for (int i = 1; i < numero; i += 2) {
            System.out.println(i);
        }

    }
}
