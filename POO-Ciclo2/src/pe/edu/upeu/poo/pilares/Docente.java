package pe.edu.upeu.poo.pilares;

public class Docente extends Persona {
	
	private double sueldo;
	private String nroTitulo;
	private String profesion;

	public void enseniar() {
		System.out.println("Enseñar");
	}

	public void calificarExamen() {
		System.out.println("Calificar");
	}

	public void elaborarSilabo() {
		System.out.println("Elaborar silabo");
	}

	@Override
	public void comer() {
		System.out.println("Comer en restaurant");
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNroTitulo() {
		return nroTitulo;
	}

	public void setNroTitulo(String nroTitulo) {
		this.nroTitulo = nroTitulo;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

}
