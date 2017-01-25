package com.patrones.decorator;

public class MainDecorator {
	public static void main(String ... args){
		Vendible hamburguesa = new BigMac();
		hamburguesa = new HuevoExtra(hamburguesa);
		hamburguesa = new QuesoExtra(hamburguesa); 
		
		System.out.println(hamburguesa.getDescripcion());
		System.out.println("su precio es "+hamburguesa.getPrecio());
		
		Vendible hamburguesa2 = new AngusTaste(); 
		hamburguesa2 = new TomateExtra(hamburguesa2); 
		hamburguesa2 = new HuevoExtra(hamburguesa2); 
		hamburguesa2 = new QuesoExtra(hamburguesa2); 
		
		System.out.println("te vas a comer lo siguiente \n"
								+hamburguesa2.getDescripcion());
		System.out.println("cuesta "+ hamburguesa2.getPrecio());
		System.out.println("disfruta el infarto 3:)");
		
		
	}
}
