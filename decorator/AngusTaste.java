package com.patrones.decorator;

public class AngusTaste extends Hamburguesa{

	@Override
	public String getDescripcion() {
		return "Hamburguesa tapa arterias ;)";
	}

	@Override
	public int getPrecio() {
		
		return 125;
	}

}
