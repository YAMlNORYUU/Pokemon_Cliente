package co.edu.unbosque.controller;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Archivo;
import co.edu.unbosque.model.PokemonDAO;



public class Controller {
	private PokemonDAO dao;
	int operacao = 0;
	int local = 12345;
	
	/**
	 * Archivo para guardar informacion de los candidatos
	 */
	private Archivo archivo;

	public Controller() {
		archivo = new Archivo();

		dao = new PokemonDAO(archivo);


	}

	public void iniciar() throws UnknownHostException, IOException {

		while (true) {
			
	
		operacao = Integer.parseInt(
				JOptionPane.showInputDialog("(1).Agregar 6 pokemones" + "\n" + "(2).Agrega un pokemon" +"\n" +"(3).coinar un pokemon" +"\n" +"(4).Mandar a la pc"));
		
		
	switch (operacao) {
	case 1:
	
		for (int i = 0; i < 6; i++) {

			Socket socket = new Socket("26.92.185.244", local);
			/*
			 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
			 * um novo processo. Permitindo assim a conexão de vário clientes com o
			 * servidor.
			 */
			Cliente c = new Cliente(operacao, socket, dao.getLista(), dao);

			c.run();


		}
		System.out.println(dao.mostrarpokemones());
		break;
	case 2:
	
		break;

	default:
		break;
	}
		
		
	}
	}
}
