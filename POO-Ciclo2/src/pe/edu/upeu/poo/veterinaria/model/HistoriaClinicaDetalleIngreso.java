package pe.edu.upeu.poo.veterinaria.model;

import java.util.Date;

public class HistoriaClinicaDetalleIngreso {

	private Date fecha;
	private String anamnesis;
	private String diagnostico;
	private Boolean emergencia;
	private Doctor doctor;
	private Tratamiento tratamiento;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getAnamnesis() {
		return anamnesis;
	}

	public void setAnamnesis(String anamnesis) {
		this.anamnesis = anamnesis;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Boolean getEmergencia() {
		return emergencia;
	}

	public void setEmergencia(Boolean emergencia) {
		this.emergencia = emergencia;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

}
