package ejercicios;

import java.util.Scanner;

// Desarrollar un programa que solicite el número de partidos ganados, empatados y perdidos, de un equipo en el
// torneo apertura. El programa debe mostrar la cantidad de puntos obtenidos, sabiendo que un gane vale
// 3 puntos, un empate 1 y una derrota 0.
public class Ejercicio1 {
    public static void main(String[] args) {
        // imprimir nombre del programa
        System.out.println("Ejercicio 1 - Calcular puntos de un equipo en el torneo apertura");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int ganados = 0, empatados = 0, perdidos = 0;

        // solicitar datos al usuario
        System.out.println("Ingrese la cantidad de partidos ganados: ");
        ganados = scanner.nextInt();

        System.out.println("Ingrese la cantidad de partidos empatados: ");
        empatados = scanner.nextInt();

        System.out.println("Ingrese la cantidad de partidos perdidos: ");
        perdidos = scanner.nextInt();

        // verificar que no haya partidos negativos
        if (ganados < 0 || empatados < 0 || perdidos < 0) {
            System.out.println("No se pueden ingresar valores negativos.");
            return;
        }

        // calcular puntos
        int puntos = (ganados * 3) + (empatados * 1) + (perdidos * 0);

        // imprimir resultado
        System.out.println("El equipo obtuvo " + puntos + " puntos en el torneo apertura.");

    }
}
