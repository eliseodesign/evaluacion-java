package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        try {
            Scanner sc = new Scanner(System.in);
            LinkedList<Empleado> empleados = new LinkedList<>();
            
            Empleado em;
            
            String respuesta = "s";
            
            // solicitar con un for hasta que el usuario decida salir y mostrar los empleados
            for (int i = 0; respuesta.equalsIgnoreCase("s"); i++) {
                System.out.println("Ingrese el id del empleado n° " + (i + 1) + ": ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el nombre del empleado: ");
                String nombre = sc.nextLine();

                System.out.println("Ingrese el apellido del empleado: ");
                String apellido = sc.nextLine();

                System.out.println("Ingrese el departamento del empleado: ");
                String departamento = sc.nextLine();

                System.out.println("Ingrese el salario del empleado: ");
                double salario = sc.nextDouble();
                sc.nextLine();

                em = new Empleado(id, nombre, apellido, departamento, salario);
                empleados.add(em);

                System.out.println("¿Desea ingresar otro empleado? (s/n): ");
                respuesta = sc.nextLine();
            }

            sc.close();
            
            System.out.println("************************************");
            System.out.println("Empleados ingresados: ");
            
            for (Empleado empleado : empleados) {
                System.out.println("ID: " + empleado.getId());
                System.out.println("Código: " + empleado.getCodigo());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellido: " + empleado.getApellido());
                System.out.println("Departamento: " + empleado.getDepartamento());
                System.out.println("Salario: " + empleado.getSalario());
                System.out.println("************************************");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
