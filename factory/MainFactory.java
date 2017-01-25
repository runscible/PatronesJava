package com.patrones.factory;

public class MainFactory {
	public static void main(String [] args ){
		Factura factura = FactoriaFacturas.getFatutras("ivas"); 
		factura.setId(23);
		factura.setImporte(10000);
		System.out.println(factura.getImporteIva());
	}
}	
