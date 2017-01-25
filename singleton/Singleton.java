package com.patrones.singleton;

public class Singleton {
	private String nombre; 
	private static Singleton singleton; 
	
	private Singleton (String nombre){
		this.nombre = nombre ; 
		System.out.println("Hola, soy: " + nombre);
	}
	
	
	/*
	 * método que instancia una propiedad del objeto
	 * -es la única forma desde la cual se puede acceder al mismo ya es público y 
	 * todos los demas son privados 
	 * */
	public static Singleton getSingletonInstance(String nombre){
		//habria que buscar una forma en que si el sistema falla no ande haciendo loops
		//sobre los resultados acertados (solucionado con el override)
		if(singleton == null){
			singleton = new Singleton(nombre); 
		}else{
			System.out.println("no se pudo ingresar " +
					nombre + " ya existe un objeto con esas caracteristicas");
		}
		return singleton; 
	}
	
	@Override 
	public Singleton clone(){
		try {
			throw new CloneNotSupportedException(); 
		}
		catch(CloneNotSupportedException ex){
		//	System.out.println("No se puede clonar el objeto ");
		//	System.out.println(ex);
		}
		return null; 
	}
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Singleton getSingleton() {
		return singleton;
	}

	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
}
