package pe.edu.upeu.poo.veterinaria.model;

public class Doctor extends Persona {

	private Especialidad especialidad;
	private String nroColegiatura;

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public String getNroColegiatura() {
		return nroColegiatura;
	}

	public void setNroColegiatura(String nroColegiatura) {
		this.nroColegiatura = nroColegiatura;
	}

}
