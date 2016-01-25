package pe.edu.upeu.poo.asistencia.model;

public class Departamento {

	private String nombre;
	private Pais pais = new Pais(); // composicion

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
