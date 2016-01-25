package pe.edu.upeu.poo.asistencia.model;

import java.util.Date;

public class Persona {

	private String nombre;
	private String paterno;
	private String materno;
	private String dni;
	private Date fechaNacimiento;
	private Distrito lugarNacimiento;
	private EstadoCivil estadoCivil;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Distrito getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(Distrito lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
