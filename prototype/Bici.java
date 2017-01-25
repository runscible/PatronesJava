package com.patrones.prototype;

public abstract class Bici implements Cloneable {
	private String color;
	private int rodado; 
	
	//metodo para clonar :) 
	public Bici clonar() throws CloneNotSupportedException {
		return (Bici)super.clone();
	}
	
	public abstract String verBici();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRodado() {
		return rodado;
	}

	public void setRodado(int rodado) {
		this.rodado = rodado;
	}
	
	
}
