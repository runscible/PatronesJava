package com.patrones.observable;

public class MainObservable {
	public static void main(String ...args){
		Observador observador = new Observador(); 
		VentanaOpciones nuevaVentanaOpciones = new VentanaOpciones(observador);
		VentanaColor nuevaVentanaColor = new VentanaColor(observador);
		VentanaSeleccion nuevaVentanaSeleccion = new VentanaSeleccion(observador);
		
		observador.addObserver(nuevaVentanaColor);
		observador.addObserver(nuevaVentanaSeleccion);
		observador.addObserver(nuevaVentanaOpciones);
		
	}
}
