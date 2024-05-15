package ejercicios;

import java.util.Scanner;

// Desarrollar un programa que permita almacenar 8 nombres de elementos químicos en una matriz unidimensional llamada
// “elementos”, posteriormente el programa deberá mostrar el contenido de la matriz en orden inverso al que fue
// llenada, es decir, el último elemento deberá aparecer primero y el primero deberá aparecer último.
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4 - Almacenar nombres de elementos químicos en una matriz");

        Scanner scanner = new Scanner(System.in);

        String[] elementos = new String[8];

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Ingrese el nombre del elemento químico " + (i + 1) + ": ");
            elementos[i] = scanner.nextLine();
        }

        System.out.println("Elementos químicos ingresados:");

        for (int i = elementos.length - 1; i >= 0; i--) {
            System.out.println(elementos[i]);
        }



    }
}
