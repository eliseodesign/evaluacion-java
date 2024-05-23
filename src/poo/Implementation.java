package poo;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Scanner mostrar = new Scanner(System.in);
        Doctor doctor = new Doctor();
        Enfermero enfermero = new Enfermero();
        Paciente paciente = new Paciente();

        System.out.println("*****DATOS DEL DOCTOR*****");

        System.out.println("Ingrese su Id , Doctor :");
        doctor.id = mostrar.nextInt();
        mostrar.nextLine();
        System.out.println("Ingrese su Nombre :");
        doctor.nombre = mostrar.nextLine();
        System.out.println("Ingrese su Apellido :");
        doctor.apellido = mostrar.nextLine();
        System.out.println("Ingrese su edad :");
        doctor.edad = mostrar.nextInt();
        mostrar.nextLine(); // Consumir el newline pendiente
        System.out.println("Ingrese su especialidad :");
        doctor.especialidad = mostrar.nextLine();
        System.out.println("Ingrese sus años de experiencia :");
        doctor.aniosExperiencia = mostrar.nextInt();
        mostrar.nextLine();

        System.out.println("\n");
        System.out.println("*****DATOS DEL ENFERMERO*****");

        System.out.println("Ingrese el Id del Enfermero :");
        enfermero.id = mostrar.nextInt();
        mostrar.nextLine();

        System.out.println("Ingrese su Nombre :");
        enfermero.nombre = mostrar.nextLine();
        System.out.println("Ingrese su apellido :");
        enfermero.apellido = mostrar.nextLine();
        System.out.println("Ingrese su edad :");
        enfermero.edad = mostrar.nextInt();
        mostrar.nextLine();
        System.out.println("Ingrese su turno :");
        enfermero.turno = mostrar.nextLine();
        System.out.println("Ingrese los años de experiencia :");
        enfermero.anioExperiencia = mostrar.nextInt();
        mostrar.nextLine();

        System.out.println("\n");

        System.out.println("*****DATOS DEL PACIENTE*****");

        System.out.println("Ingrese el Id del paciente :");
        paciente.id = mostrar.nextInt();
        mostrar.nextLine(); // Consumir el newline pendiente
        System.out.println("Ingrese su Nombre : ");
        paciente.nombre = mostrar.nextLine();
        System.out.println("Ingrese su apellido :");
        paciente.apellido = mostrar.nextLine();
        System.out.println("Ingrese su edad :");
        paciente.edad = mostrar.nextInt();
        mostrar.nextLine(); // Consumir el newline pendiente
        System.out.println("Ingrese su historia clinica :");
        paciente.historiaClinica = mostrar.nextLine();
        System.out.println("Ingrese su numero de seguro:");
        paciente.numeroSeguro = mostrar.nextLine();

        // Mostrar información del doctor
        System.out.println("\n");
        doctor.diagnosticar();
        doctor.prescribirTratamiento();
        doctor.darOpiniones();
        doctor.mostrarInfo();

        // Mostrar información del enfermero
        System.out.println("\n");
        enfermero.asistirDoctor();
        enfermero.aplicarMedicamento();
        enfermero.darOpiniones();
        enfermero.mostrarInfo();

        // Mostrar información del paciente
        System.out.println("\n");
        paciente.registrase();
        paciente.solicitarCita();
        paciente.recibirTratamiento();
        paciente.darOpiniones();
        paciente.mostrarInfo();
    }
}
