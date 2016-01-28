package pe.edu.upeu.poo.factory;

public class FacturaIVA extends Factura {

	@Override
	public double getImporteIva() {
		return getImporte() * 1.21;
	}

}
