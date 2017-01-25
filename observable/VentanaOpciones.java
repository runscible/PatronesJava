package com.patrones.observable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaOpciones extends JFrame implements Observer, ActionListener {
	
	JLabel titulo; 
	int colorSeleccionado; 
	JComboBox color;
	String arregloColores [] = {
		"seleccione uno", "amarillo", 
		"verde", "rojo", "negro", "blanco" 
	}; 
	Observador nuevoObservador; 
	
	public VentanaOpciones (Observador observador){

		nuevoObservador = observador; 	
		titulo = new JLabel();
		titulo.setText("observador de patrones");
		titulo.setBounds(20, 10, 250, 35);
		
		color = new JComboBox();
		color.setBounds(20, 40, 150, 25);
		color.setModel(new DefaultComboBoxModel(arregloColores));
		color.addActionListener(this);
		
		add(titulo);
		add(color);
		
		setSize(200, 150); 
		setTitle("ventana color");
		setLocation(550, 250);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		nuevoObservador.setColor((String) color.getSelectedItem());
		nuevoObservador.setColorSeleccionado(color.getSelectedIndex());
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		switch(colorSeleccionado){
		case 1: color.setSelectedIndex(1);
		break;
		
		case 2: color.setSelectedIndex(2);
		break;
		
		case 3: color.setSelectedIndex(3);
		break;
		
		case 4: color.setSelectedIndex(4);
		break;
		
		case 5: color.setSelectedIndex(5);
		break;
		
		default: color.setSelectedIndex(0);
	}
		
	}
	
}
