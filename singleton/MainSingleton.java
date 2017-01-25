package com.patrones.singleton;

public class MainSingleton {
	public static void main (String [] args){
		
		
		Singleton Juan = Singleton.getSingletonInstance("Juan Borsalino");
		//este no deberia ejecutarse
		Singleton Ricardo = Singleton.getSingletonInstance("Ricardo Correa"); 
		
		try{
			Singleton juan = Juan.clone(); 
			Singleton ricardo = Ricardo.clone(); 
			
			System.out.println(ricardo.getNombre());
			System.out.println(juan.getNombre());
			//y no se ejecuta efectivamente ;)
		}
		catch(NullPointerException ex){
			//ex.printStackTrace();
			//printStackTrace (y todos los metodos de impresion por consola 
			//podrían usarse en un modo de debug ;)
		}
	}
	
}
