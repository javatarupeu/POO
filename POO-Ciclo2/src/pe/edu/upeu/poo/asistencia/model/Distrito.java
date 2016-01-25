package pe.edu.upeu.poo.asistencia.model;

public class Distrito {

	private String nombre;
	private Provincia provincia = new Provincia();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}
