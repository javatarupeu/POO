package pe.edu.upeu.poo.factory;

public class FacturaFactory {

	public static Factura getFactura(String tipo) {

		if (tipo.equals("iva")) {
			return new FacturaIVA();
		} else {
			return new FacturaIVAReducido();
		}

	}

}
