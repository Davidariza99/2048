package Juego;

import java.awt.Component;

import javax.swing.JFrame;

public class Start {
	
public static void main(String[] args) {
	Juego juego = new Juego();
	
	JFrame window = new JFrame("2048");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setResizable(false);
	window.add(juego);
	window.pack();
	window.setLocationRelativeTo(null);
	window.setVisible(true);
	
	juego.start();
		
	}
}