package poo;

class Enfermero extends Persona {
    protected String turno;
    protected int anioExperiencia;

    public Enfermero() {
    }

    public Enfermero(int id, String nombre, String apellido, int edad, String turno, int anioExperiencia) {
        super(id, nombre, apellido, edad);
        this.turno = turno;
        this.anioExperiencia = anioExperiencia;
    }

    @Override
    public void darOpiniones() {
        System.out.println(nombre + " " + apellido + " (Enfermero) está dando su opinión.");
    }

    public void asistirDoctor() {
        System.out.println(nombre + " " + apellido + " está asistiendo al doctor.");
    }

    public void aplicarMedicamento() {
        System.out.println(nombre + " " + apellido + " está aplicando medicamentos.");
    }

    public void asistirPaciente() {
        System.out.println(nombre + " " + apellido + " está asistiendo al paciente.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Turno: " + turno);
        System.out.println("Años de experiencia: " + anioExperiencia);
    }
}
