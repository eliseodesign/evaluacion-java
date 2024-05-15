package ejercicios;

import java.util.Scanner;

// Desarrollar un programa que solicite el sueldo de un empleado y como resultado muestre el monto
// a descontar en concepto de renta, sabiendo que: si el sueldo es menor que $500.00 el descuento
// es de $0.00, si el sueldo es igual o mayor a $500.00 y menor que $750.00 el descuento es del 5% del
// monto del sueldo y si el sueldo es igual o mayor que $750.00 el descuento es del 10% del monto del sueldo.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sueldo = 0.0;
        double descuento = 0.0;

        System.out.println("Ingrese el sueldo del empleado: ");
        sueldo = scanner.nextDouble();

        if (sueldo < 500.00) {
            descuento = 0.00;
        } else if (sueldo >= 500.00 && sueldo < 750.00) {
            descuento = sueldo * 0.05;
        } else {
            descuento = sueldo * 0.10;
        }

        System.out.println("El monto a descontar en concepto de renta es de $" + descuento);


    }
}
