package com.patrones.decorator;

public abstract class HamburguesaDecorator implements Vendible{
	private Vendible vendible; 

	public HamburguesaDecorator(Vendible vendible){
		setVendible(vendible); 
	}
	
	public Vendible getVendible() {
		return vendible;
	}

	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}


}
