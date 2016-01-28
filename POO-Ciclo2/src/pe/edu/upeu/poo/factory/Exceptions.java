package pe.edu.upeu.poo.factory;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/***
		 * try: Dentro del bloque try se deben incluir las sentencias que se
		 * 		quieren controlar, en otras palabras, las que podrian desencadenar un
		 * 		error. 
		 * catch: El boque catch captura las excepciones que se
		 * 		desencadenan en el bloque try, se debe especificar el tipo de
		 * 		excepcion. En este bloque se procesa la excepcion. 
		 * finally: Se utiliza para indicar el bloque de instrucciones que siempre se debe
		 * 		ejecutar. 
		 * throw
		 * 		Para generar excepciones en forma manual debemos utilizar una instruccion throw.
		 * throws
		 * 		La plabra clave throws se utiliza para indicar las excepciones que un metodo no puede
		 * 		gestionar y que deben ser controladas por el código que llame a estos metodos.
		 */

//		int x = 0;
		Operaciones o = new Operaciones();
		System.out.println("Suma " + o.sumar(2, 5));
		
		try {
			System.out.println("Dividir " + o.dividir(12, 0));
		} catch (MiExcepcion e) {
			e.printStackTrace();
		}
		
		
		
//		try {
//
//			// x = scan.nextInt();
//
//			// throw new NullPointerException("Error de usuario");
//
//			// int y = 2;
//			// System.out.println(y / 0);
//		} catch (InputMismatchException e) {
//			System.out.println("Ingrese un dato valido");
//			x = scan.nextInt();
//		} finally {
//			System.out.println("Holaaa");
//		}
//		System.out.println(x);

	}

}
