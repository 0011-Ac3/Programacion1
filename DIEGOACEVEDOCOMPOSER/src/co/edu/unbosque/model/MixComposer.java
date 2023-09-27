package co.edu.unbosque.model;

import java.util.Random;
import co.edu.ubosque.model.persistence.FileManager;
import co.edu.ubosque.model.persistence.Propiedades;

public class MixComposer {
	private FileManager fm;
	private Propiedades propiedades;
	private String[] fr1 = {"mami", "bebe", "plincess", "mami"};
	private String[] fr2 = {"yo quielo", "yo puedo", "yo vengo", "voy a"};
	private String[] fr3 = {"encendelte", "amalte", "ligal", "jugal"};
	private String[] fr4 = {"suave", "lento", "rapido", "fuelte"};
	private String[] fr5 = {"hasta que salga el sol", "toda la noche", "hasta el amanecel", "todo el dia"};
	private String[] fr6 = {"sin anestesia", "sin complomiso", "feis to feis", "sin miedo"};
	
	private String cancion;
	
	public MixComposer() {
		fm = new FileManager();
		propiedades = new Propiedades();
		
	}
	
	public void construirCancion(int estrofas, int frasesPorEstrofa, String nombreDeLaCancion) {
		
		Random r = new Random();
		
		String cancion = "Nombre de la canción: " + nombreDeLaCancion + "\n";
		
		for (int i = 0; i < estrofas; i++) {
			cancion += "********Estrofa" + (i+1) +  " *************\n";
			for (int j = 0; j < frasesPorEstrofa; j++) {
				cancion += fr1[r.nextInt(0, fr1.length)] + " ";
				cancion += fr2[r.nextInt(0, fr2.length)] + " ";
				cancion += fr3[r.nextInt(0, fr3.length)] + " ";
				cancion += fr4[r.nextInt(0, fr4.length)] + " ";
				cancion += fr5[r.nextInt(0, fr5.length)] + " ";
				cancion += fr6[r.nextInt(0, fr6.length)] + " ";
				cancion += "\n";
			}
			cancion += "\n";
		}
		setCancion(cancion);
	}
	
	public String crearArchivoCancion() {
		if (fm.escribirArchivo(cancion) == 0) {
			return "Canción creada con éxito";
		} else {
			return "Fallo en la creación de la canción";
		}
	}
	
	public void gestionarPropiedades(String nombreDeLaCancion, int estrofas, int frases) {
		propiedades.escribirPropiedadesDeLaCancion(nombreDeLaCancion, estrofas, frases);
		propiedades.listarPropiedadesDeCancion();
	}
	
	public String seleccionarCancion() {
		fm.getArchivo();
		return fm.leerArchivo();
	}

	public FileManager getFm() {
		return fm;
	}

	public String[] getFr1() {
		return fr1;
	}

	public String[] getFr2() {
		return fr2;
	}

	public String[] getFr3() {
		return fr3;
	}

	public String[] getFr4() {
		return fr4;
	}

	public String[] getFr5() {
		return fr5;
	}

	public String[] getFr6() {
		return fr6;
	}

	public String getCancion() {
		return cancion;
	}

	public void setFm(FileManager fm) {
		this.fm = fm;
	}

	public void setFr1(String[] fr1) {
		this.fr1 = fr1;
	}

	public void setFr2(String[] fr2) {
		this.fr2 = fr2;
	}

	public void setFr3(String[] fr3) {
		this.fr3 = fr3;
	}

	public void setFr4(String[] fr4) {
		this.fr4 = fr4;
	}

	public void setFr5(String[] fr5) {
		this.fr5 = fr5;
	}

	public void setFr6(String[] fr6) {
		this.fr6 = fr6;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
}
