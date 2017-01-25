package com.patrones.iterator;

public class Catalogo {
	private Producto[] productos = new Producto[1000]; 
	private int numero = 0;
	private String nombreCatalogo; 
	
	
	public Catalogo(String nombre ){
		this.nombreCatalogo = nombre; 
	}
	
	public String getNombre(){
		return nombreCatalogo; 
	}
	
	public void add(String nombre){
		Producto p = new Producto(nombre, nombreCatalogo);  
		productos[numero++] = p;
	}
	
	public CatalogoIterator catalogoIterator(){
		return new CatalogoIterator(productos); 
	}
	
}
