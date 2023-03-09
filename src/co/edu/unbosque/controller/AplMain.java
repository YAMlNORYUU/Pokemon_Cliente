package co.edu.unbosque.controller;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 * Clase main del proyecto.
 * 
 * @author Jose
 * @author Kevin
 * @author Nicolás
 */
public class AplMain {
	/**
	 * Metodo main del proyecto.
	 * 
	 * @param args para el metodo main
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Controller control = new Controller();

		control.iniciar();
	}

}
