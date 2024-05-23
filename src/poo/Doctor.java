package poo;

class Doctor extends Persona {
    protected String especialidad;
    protected int aniosExperiencia;

    public Doctor() {
    }

    public Doctor(int id, String nombre, String apellido, int edad, String especialidad, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void darOpiniones() {
        System.out.println(nombre + " " + apellido + " (Doctor) está dando su opinión.");
    }

    public void diagnosticar() {
        System.out.println(nombre + " " + apellido + " está diagnosticando al paciente.");
    }

    public void prescribirTratamiento() {
        System.out.println(nombre + " " + apellido + " está prescribiendo un tratamiento.");
    }

    public void darSeguimiento() {
        System.out.println(nombre + " " + apellido + " está dando seguimiento al paciente.");
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }
}
