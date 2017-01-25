package com.patrones.decorator;

public class HuevoExtra extends HamburguesaDecorator{

	public HuevoExtra(Vendible vendible){
		super(vendible);
	}
	
	@Override
	public String getDescripcion() {
		return getVendible().getDescripcion() + " + huevo extra ";
	}

	@Override
	public int getPrecio() {
		
		return getVendible().getPrecio() + 15;
	}

}
