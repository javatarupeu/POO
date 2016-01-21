package pe.edu.upeu.poo.veterinaria.model;

public class Tratamiento {

	private String medicamento;
	private int nroDosis;
	private Boolean suministrado;

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public int getNroDosis() {
		return nroDosis;
	}

	public void setNroDosis(int nroDosis) {
		this.nroDosis = nroDosis;
	}

	public Boolean getSuministrado() {
		return suministrado;
	}

	public void setSuministrado(Boolean suministrado) {
		this.suministrado = suministrado;
	}

}
