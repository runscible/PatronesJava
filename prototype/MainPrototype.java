package com.patrones.prototype;

public class MainPrototype {
/*
 * tambi�n conocida como la clase del cliente 
 *
 * */
	
	public static void main (String ...args) throws CloneNotSupportedException{
		Bici bic = new NuevaBici(); 
		bic.setColor("Naranja");
		bic.setRodado(44);
		
		System.out.println(bic.verBici());
		
		
		//ac� podria instanciar un nuevo objeto pero eso consumir�a muchos recursos
		// es mucho mas f�cil instanciar el ya existente y clonarlo : ) 
		
		Bici bic2 = bic.clonar();
		bic2.setColor("azul");
		bic2.setRodado(22);
		
		System.out.println(bic2.verBici());
		
	}
}
