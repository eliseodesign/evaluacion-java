package ejercicios;

import java.util.Scanner;

public class Transpuesta {
    public static void main(String[] args) {
        // programa que solicita 9 datos y llenar una matriz de 3x3, pero mostrar la matriz transpuesta

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];

        System.out.println("Llenar matriz de 3x3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Ingrese un número: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("-------------------");
        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Transponer matriz
        System.out.println("-------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar matriz transpuesta
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta.length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }


    }
}
