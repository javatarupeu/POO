package pe.edu.upeu.poo.veterinaria.model;

import java.util.Date;

public class Mascota {

	private String nombre;
	private Double peso;
	private String sexo;
	private String color;
	private String pelaje;
	private Date fechaNacimiento;
	private TipoMascota tipo = new TipoMascota();
	private Raza raza = new Raza();
	private PropietarioMascota propietario = new PropietarioMascota();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public TipoMascota getTipo() {
		return tipo;
	}

	public void setTipo(TipoMascota tipo) {
		this.tipo = tipo;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public PropietarioMascota getPropietario() {
		return propietario;
	}

	public void setPropietario(PropietarioMascota propietario) {
		this.propietario = propietario;
	}

}
