package com.patrones.decorator;

public  class BigMac extends Hamburguesa{

	@Override
	public String getDescripcion() {
		
		return "la hamburguesa mas barata, para las estad�sticas ;s)";
	}

	@Override
	public int getPrecio() {
		
		return 50;
	}

}
