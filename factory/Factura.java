package com.patrones.factory;

public abstract class Factura {
	private double importe; 
	private int id;
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public abstract double getImporteIva();
}
