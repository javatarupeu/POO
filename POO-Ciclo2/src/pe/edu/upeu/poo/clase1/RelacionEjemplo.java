package pe.edu.upeu.poo.clase1;

public class RelacionEjemplo {

	public static void main(String[] args) {

		// Ropa chompa = new Ropa();
		// chompa.color = "Azul";
		// chompa.marca = "Nike";
		// chompa.modelo = "UPeU";
		// chompa.talla = "S";

		Sexo m = new Sexo();
		m.nombre = "Masculino";

		Persona joselin = new Persona(m);
		// joselin.nombres = "Joselin";
		// joselin.sexo = "Femenino";
		// joselin.celular = "1231564";
		// joselin.ropa = chompa;

		System.out.println(joselin);

	}

}
