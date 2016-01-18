package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		Persona jesus = new Persona(new Sexo());
		jesus.nombres = "Jesus Josue";
		jesus.apePaterno = "Mariaca";
		jesus.apeMaterno = "Mamani";
		jesus.altura = 1.72;
		jesus.dni = "45800691";
		jesus.celular = "982003631";
		jesus.email = "javatar.sempai@gmail.com";
		jesus.tipoSangre = "O+";
		jesus.direccion = "Jr. Sinchi Roca 824";
		jesus.religion = "Cristiano";
//		jesus.sexo = "Masculino";
		jesus.estadoCivil1 = "Casado";
		jesus.vive = true;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			jesus.fechaNacimiento = sdf.parse("15/05/1989");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(jesus);

	}

}
