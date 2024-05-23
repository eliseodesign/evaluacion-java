package poo;

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    public void darOpiniones() {
        System.out.println(nombre + " " + apellido + " está dando su opinión.");
    }
}