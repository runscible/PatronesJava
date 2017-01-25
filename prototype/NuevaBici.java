package com.patrones.prototype;

public class NuevaBici extends Bici {

	@Override
	public String verBici() {
		return "esta bici es de color" + this.getColor() +" y es de rodado "+ this.getRodado(); 
		
	}
}
