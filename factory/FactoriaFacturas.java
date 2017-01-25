package com.patrones.factory;

public class FactoriaFacturas {
	
	
	//clase que se encarga de generar las facturas segun 
	//los parametros que se le apliquen 
	public static Factura getFatutras (String tipo){
		//si el argumento que recibe es igual a 'iva'
		//aplica el impuesto correspondiente
		//(super, pero super vulnerable)
		if(tipo.equals("iva")){
			return new FacturaIva();
		}else{
			return new FacturaIvaReducido();
		}
	}
}
