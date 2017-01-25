package com.patrones.decorator;

public class TomateExtra extends HamburguesaDecorator{

	public TomateExtra(Vendible vendible){
		super(vendible);	
	}
	
	//a la descripcion original le suma la del agregado
	@Override
	public String getDescripcion() {
		
		return getVendible().getDescripcion() + " + tomate extra";
	}
	
	//hace lo mismo con el precio
	@Override
	public int getPrecio() {
		
		return getVendible().getPrecio() + 10;
	}

}
