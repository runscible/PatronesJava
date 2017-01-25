package com.patrones.iterator;

public class Producto {
	private String nombre; 
	private String catalogo; 
	public Producto(String n, String c) {
		nombre = n; 
		catalogo = c; 
	}

	public String getName(){
		return nombre; 
	}
	
	public void print (){
		System.out.println("el nombre del producto es: " + nombre + "\n y esta en el siguiente catalogo : \n" + catalogo);
	}

}
