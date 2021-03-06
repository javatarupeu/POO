package pe.edu.upeu.poo.clase1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	private String nombres;
	private String apePaterno;
	private String apeMaterno;
	private Double altura;
	private String dni;
	private String celular;
	private Date fechaNacimiento;
	private String email;
	private String tipoSangre;
	private String direccion;
	private String religion;
	private EstadoCivil estadoCivil = new EstadoCivil();
	private Sexo sexo = new Sexo();
	private String estadoCivil1;
	private Boolean vive;
	private Ropa ropa;

	/***
	 * Metodo Constructor de la clase Persona
	 * 
	 * @param sexo
	 */
	public Persona() {
		super();
	}

	public Persona(Sexo sexo) {
		super();
		this.sexo = sexo;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
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

	public String getEstadoCivil1() {
		return estadoCivil1;
	}

	public void setEstadoCivil1(String estadoCivil1) {
		this.estadoCivil1 = estadoCivil1;
	}

	public Boolean getVive() {
		return vive;
	}

	public void setVive(Boolean vive) {
		this.vive = vive;
	}

	public Ropa getRopa() {
		return ropa;
	}

	public void setRopa(Ropa ropa) {
		this.ropa = ropa;
	}

	public int getEdad() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date now = new Date();
		int anioActual = Integer.parseInt(sdf.format(now));
		int anioNacimiento = Integer.parseInt(sdf.format(fechaNacimiento));

		return anioActual - anioNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + ", altura="
				+ altura + ", dni=" + dni + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", email="
				+ email + ", tipoSangre=" + tipoSangre + ", direccion=" + direccion + ", religion=" + religion
				+ ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", vive=" + vive + "]";
	}

}
