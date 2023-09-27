package co.edu.ubosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void message(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public String pedirNombreCancion() {
		return JOptionPane.showInputDialog(null, "Digite el nombre de la canción:");
	}
	
	public int pedirNumero(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
	} 
	
	public int pedirOpcion() {
		String opciones = "";
		opciones += "***********Mix Composer***************\n";
		opciones += "1) Digite número de estrofas y versos.\n";
		opciones += "2) Crear canción\n";
		opciones += "3) Seleccionar canción\n";
		opciones += "4) Salir\n";
		return pedirNumero(opciones);
	}
}
