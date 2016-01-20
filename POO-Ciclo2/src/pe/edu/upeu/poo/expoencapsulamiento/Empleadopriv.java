package pe.edu.upeu.poo.expoencapsulamiento;

public class Empleadopriv {
	
	private String nombre;
	private String codigo;
	private int tipodeempleado;
	
	public void Empleado(String n, String c, int t){
		nombre = n;
		codigo = c;
		tipodeempleado= t;
	}
	public String getNombre(){
		return nombre;
	}
	public String getCodigo(){
		return codigo;
	}
	public int getTipodeempleado(){
		return tipodeempleado;
	}
	

}
