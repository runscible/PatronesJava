package com.patrones.observable;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaSeleccion extends JFrame implements Observer{
	JLabel titulo, color; 
	int colorSeleccionado; 
	Observador nuevoObservador; 
	
	public VentanaSeleccion(Observador observador){
		nuevoObservador = observador;
		
		titulo = new JLabel(); 
		titulo.setText("color seleccionado: ");
		titulo.setBounds(20,10, 150, 25);
		
		color = new JLabel(); 
		color.setText("Hace falta seleccionar un color ");
		color.setBounds(20, 40, 100,25);
		
		add(titulo); 
		add(color); 
		
		setSize(230, 120);
		setTitle("ventana color");
		setLocation(700, 300);
		setLayout(null);
		setVisible(true);
		
	}	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		colorSeleccionado =nuevoObservador.getColorSeleccionado(); 
		
		switch(colorSeleccionado){
			case 1: color.setText(nuevoObservador.getColor());
			break;
			
			case 2: color.setText(nuevoObservador.getColor());
			break;
			
			case 3: color.setText(nuevoObservador.getColor());
			break;
			
			case 4: color.setText(nuevoObservador.getColor());
			break;
			
			case 5: color.setText(nuevoObservador.getColor());
			break;
			
			default: color.setText("ningún color fue seleccionado :_(");
		}
		
	}
	
}
