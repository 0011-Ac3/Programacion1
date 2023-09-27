package co.edu.unbosque.controller;

import co.edu.ubosque.view.View;
import co.edu.unbosque.model.MixComposer;

public class Controller {
	
	private View view;
	private MixComposer mc;
	
	public Controller() {
		view = new View();
		mc = new MixComposer();
		
		boolean salir = false;
		while (!salir) {
			
			switch (view.pedirOpcion()) {
				case 1:
					int numeroDeEstrofas = view.pedirNumero("Digite el número de estrofas:");
					int numeroDeVersos = view.pedirNumero("Digite el número de versos:");
					String nombreDeLaCancion = view.pedirNombreCancion();
					mc.construirCancion(numeroDeEstrofas, numeroDeVersos, nombreDeLaCancion);
					mc.gestionarPropiedades(nombreDeLaCancion, numeroDeEstrofas, numeroDeVersos);
					break;
				case 2: 
					view.message(mc.crearArchivoCancion());
					break;
				case 3:
					view.message(mc.seleccionarCancion());
					break;
				case 4:
					salir = true;
					break;
			}
		}
	}
}
