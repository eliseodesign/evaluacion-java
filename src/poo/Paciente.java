package poo;

class Paciente extends Persona {
    protected String historiaClinica;
    protected String numeroSeguro;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String apellido, int edad, String historiaClinica, String numeroSeguro) {
        super(id, nombre, apellido, edad);
        this.historiaClinica = historiaClinica;
        this.numeroSeguro = numeroSeguro;
    }

    @Override
    public void darOpiniones() {
        System.out.println(nombre + " " + apellido + " (Paciente) está dando su opinión.");
    }

    public void registrase() {
        System.out.println(nombre + " " + apellido + " se ha registrado como paciente.");
    }

    public void solicitarCita() {
        System.out.println(nombre + " " + apellido + " ha solicitado una cita.");
    }

    public void recibirTratamiento() {
        System.out.println(nombre + " " + apellido + " está recibiendo tratamiento.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Historial Clínico: " + historiaClinica);
        System.out.println("Número de Seguro: " + numeroSeguro);
    }
}
