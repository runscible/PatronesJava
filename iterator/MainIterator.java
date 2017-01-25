package com.patrones.iterator;

import java.util.Iterator;

public class MainIterator {
	public static void main(String [] args){
		Catalogo catalogo1 = new Catalogo("primer catálogo"); 
		catalogo1.add("control remoto");
		catalogo1.add("heladera");
		catalogo1.add("microondas");
		catalogo1.add("lavarropas");
		
		Iterator <Producto> iterador = catalogo1.catalogoIterator(); 
		while(iterador.hasNext()){
			Producto p = ( Producto) iterador.next();
			p.print();
		}
	}
}
