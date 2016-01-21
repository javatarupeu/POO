package pe.edu.upeu.poo.veterinaria.model;

import java.util.Date;

public class HistoriaClinica {

	private String nroHC;
	private Mascota mascota;
	private Date fechaIngreso;
	private String antecedentes;

	public String getNroHC() {
		return nroHC;
	}

	public void setNroHC(String nroHC) {
		this.nroHC = nroHC;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}

}
