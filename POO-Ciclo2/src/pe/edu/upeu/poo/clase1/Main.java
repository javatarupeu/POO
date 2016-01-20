package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		Persona jesus = new Persona();
		
		
		jesus.setNombres("Jesus Josue");
		jesus.setApePaterno("Mariaca");
		jesus.setApeMaterno("Mamani");
		jesus.setAltura(1.72);
		jesus.setDni("45800691");
		jesus.setCelular("982003631");
		jesus.setEmail("javatar.sempai@gmail.com");
		jesus.setTipoSangre("O+");
		jesus.setDireccion("Jr. Sinchi Roca 824");
		jesus.setReligion("Cristiano");
		// jesus.sexo = "Masculino";
		jesus.setEstadoCivil1("Casado");
		;
		jesus.setVive(true);
		;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			jesus.setFechaNacimiento(sdf.parse("15/05/1989"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(jesus.getNombres());

	}

}
