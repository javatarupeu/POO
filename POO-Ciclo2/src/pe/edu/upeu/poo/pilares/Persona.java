package pe.edu.upeu.poo.pilares;

import java.util.Date;

import pe.edu.upeu.poo.clase1.EstadoCivil;
import pe.edu.upeu.poo.clase1.Sexo;

public class Persona {
	private String nombres;
	private String apePaterno;
	private String apeMaterno;
	private Double altura;
	private String dni;
	private Date fechaNacimiento;
	private String tipoSangre;
	private String direccion;
	private EstadoCivil estadoCivil = new EstadoCivil();
	private Sexo sexo = new Sexo();
	private Boolean vive;

	public void caminar() {
		System.out.println("Caminar");
	}

	public void respirar() {
		System.out.println("Respirar");
	}

	public void comer() {
		System.out.println("Comer");
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
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

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Boolean getVive() {
		return vive;
	}

	public void setVive(Boolean vive) {
		this.vive = vive;
	}

}
