package pe.edu.upeu.poo.asistencia.model;

public class Provincia {

	private String nombre;
	private Departamento departamento = new Departamento();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
