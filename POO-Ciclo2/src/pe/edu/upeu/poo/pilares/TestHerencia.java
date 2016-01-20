package pe.edu.upeu.poo.pilares;

public class TestHerencia {

	public static void main(String[] args) {

		Docente docente1 = new Docente();
		Persona docente2 = new Docente();
		Persona docente3 = new Persona();

		docente1.comer();
		docente2.comer();
		docente3.comer();

		// d.elaborarSilabo();
		// d.caminar();
		// d.respirar();
		// d.calificarExamen();

	}

}
