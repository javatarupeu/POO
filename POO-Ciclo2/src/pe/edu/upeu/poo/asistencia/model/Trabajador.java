package pe.edu.upeu.poo.asistencia.model;

import java.util.Date;

public class Trabajador extends Persona {

	private String codigo;
	private CargoTrabajador cargo; // agregacion
	private AreaTrabajo area = new AreaTrabajo();
	private TipoTrabajador tipo = new TipoTrabajador();
	private Date fechaPago;
	private Date fechaIngreso;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public CargoTrabajador getCargo() {
		return cargo;
	}

	public void setCargo(CargoTrabajador cargo) {
		this.cargo = cargo;
	}

	public AreaTrabajo getArea() {
		return area;
	}

	public void setArea(AreaTrabajo area) {
		this.area = area;
	}

	public TipoTrabajador getTipo() {
		return tipo;
	}

	public void setTipo(TipoTrabajador tipo) {
		this.tipo = tipo;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
