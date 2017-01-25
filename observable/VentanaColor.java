package com.patrones.observable;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class VentanaColor extends JFrame implements Observer, ActionListener{
	JPanel nuevoPanel; 
	JLabel titulo, mensaje; 
	int colorSeleccionado; 
	Observador nuevoObservador; 
	ButtonGroup grupoBotones; 
	JRadioButton amarillo, verde, rojo, negro, blanco, inv; 
	
	public VentanaColor(Observador observador){
		
		nuevoObservador = observador; 
		
		titulo = new JLabel();
		titulo.setText("sistema de ventanas por color");
		titulo.setBounds(150, 15, 300, 200);
		
		mensaje = new JLabel(); 
		mensaje.setText("seleccione un color");
		mensaje.setBounds(10, 30, 250, 50);
		
		nuevoPanel = new JPanel();
		nuevoPanel.setBounds(33, 50, 350, 170);
		
		amarillo = new JRadioButton();
		amarillo.setText("amarillo");
		amarillo.setBounds(5, 40, 75, 25);
		amarillo.addActionListener(this);
		
		verde = new JRadioButton();
		verde.setText("verde");
		verde.setBounds(5, 40, 75, 25);
		verde.addActionListener(this);
		
		rojo = new JRadioButton();
		rojo.setText("rojo");
		rojo.setBounds(5, 40, 75, 25);
		rojo.addActionListener(this);
	
		negro = new JRadioButton();
		negro.setText("negro");
		negro.setBounds(5, 40, 75, 25);
		negro.addActionListener(this);
		
		blanco = new JRadioButton();
		blanco.setText("blanco");
		blanco.setBounds(5, 40, 75, 25);
		blanco.addActionListener(this);
		
		
		grupoBotones = new ButtonGroup(); 
		grupoBotones.add(amarillo);
		grupoBotones.add(verde);
		grupoBotones.add(rojo);
		grupoBotones.add(negro);
		grupoBotones.add(blanco);
		
		add(amarillo); 
		add(verde); 
		add(rojo); 
		add(negro); 
		add(blanco); 
		add(mensaje); 
		add(titulo); 
		add(nuevoPanel);
		
		setSize(450, 500);
		setTitle("ventana de color");
		setLocation(250, 300);
		setLayout(null);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== amarillo){
			nuevoObservador.setColorSeleccionado(1);
		}
		if(e.getSource()== verde){
			nuevoObservador.setColorSeleccionado(2);
		}
		if(e.getSource()== rojo){
			nuevoObservador.setColorSeleccionado(3);
		}
		if(e.getSource()== negro){
			nuevoObservador.setColorSeleccionado(4);
		}
		if(e.getSource()== blanco){
			nuevoObservador.setColorSeleccionado(5);
		}
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		colorSeleccionado = nuevoObservador.getColorSeleccionado(); 
		switch(colorSeleccionado){
			case 1 : mensaje.setText("");
			nuevoPanel.setBackground(Color.yellow);
			amarillo.setSelected(true);
			break;
			
			case 2 : mensaje.setText("");
			nuevoPanel.setBackground(Color.green);
			amarillo.setSelected(true);
			break;
			
			case 3 : mensaje.setText("");
			nuevoPanel.setBackground(Color.red);
			amarillo.setSelected(true);
			break;
			
			case 4 : mensaje.setText("");
			nuevoPanel.setBackground(Color.black);
			amarillo.setSelected(true);
			break;
			
			case 5 : mensaje.setText("");
			nuevoPanel.setBackground(Color.white);
			amarillo.setSelected(true);
			break;
		}
		
		
	}
	
}
