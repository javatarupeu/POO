package pe.edu.upeu.poo.factory;

public class FacturaIVAReducido extends Factura {

	@Override
	public double getImporteIva() {
		return getImporte() * 1.07;
	}

}
