package linkedlist;

import java.util.Random;

// clase empleado con atributos: id, codigo, nombre, apellido, departamento, salario
// usar encapsulamiento para los atributos
public class Empleado {
    private int id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String departamento;
    private double salario;

    public Empleado(int id, String nombre, String apellido, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.salario = salario;

        // codigo de empleado en base a las dos primeras letras del apellido, las tres primeras letras del departamento y un número aleatorio de tres dígitos
        
        // obtener las dos primeras letras del apellido
        String dosPrimerasLetrasApellido = apellido.substring(0, 2);
        // obtener las tres primeras letras del departamento
        String tresPrimerasLetrasDepartamento = departamento.substring(0, 3);

        // generar número aleatorio de tres dígitos
        Random random = new Random();
        int numeroAleatorio = random.nextInt(900) + 100;

        // concatenar las letras y el número aleatorio
        this.codigo = dosPrimerasLetrasApellido + tresPrimerasLetrasDepartamento + numeroAleatorio;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
