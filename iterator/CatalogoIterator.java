package com.patrones.iterator;

import java.util.Iterator;

public class CatalogoIterator implements Iterator <Producto>{
	private Producto [] producto; 
	private int location = 0; 
	
	public CatalogoIterator(Producto[] productos) {
		producto = productos;   
	}
	
	public Producto next(){
		return producto[location++];
		
	}

	@Override
	public boolean hasNext() {
		if(location < producto.length && producto[location] != null){
			return true; 
		}else{
		return false;
		}
	}

	public void remove (){
		
	}
}
