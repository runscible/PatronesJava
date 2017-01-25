package com.patrones.decorator;

public class QuesoExtra extends HamburguesaDecorator{

	public QuesoExtra(Vendible vendible){
		super(vendible);
	}
	
	@Override
	public String getDescripcion() {
		
		return getVendible().getDescripcion()+" + queso extra ";
	}

	@Override
	public int getPrecio() {
		
		return getVendible().getPrecio()+ 25;
	}

}
