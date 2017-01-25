package com.patrones.factory;

public class FacturaIva extends Factura {
	

	@Override
	public double getImporteIva() {
		
		return getImporte()* 1.21;
	}
}
