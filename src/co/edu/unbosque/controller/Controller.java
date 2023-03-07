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
	int aux11  = 1;
	
	/**
	 * Archivo para guardar informacion de los candidatos
	 */
	private Archivo archivo;

	public Controller() {
		archivo = new Archivo();

		dao = new PokemonDAO(archivo);


	}
	public void cargarBase() throws UnknownHostException, IOException {
		
		for (int i = 0; i < 100; i++) {

			Socket socket = new Socket("127.0.0.1", local);
			/*
			 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
			 * um novo processo. Permitindo assim a conexão de vário clientes com o
			 * servidor.
			 */
			Cliente c = new Cliente(2, socket, dao.getLista(), dao,aux11);

			c.run();
aux11++;
		
		}
		System.out.println(dao.mostrarpokemones());
		
		
	}

	public void iniciar() throws UnknownHostException, IOException {
		
		
	cargarBase();
		

		while (true) {
			try {
				
		
	
		operacao = Integer.parseInt(
				JOptionPane.showInputDialog("(1).Agregar 6 pokemones" + "\n" + "(2).Agrega un pokemon" +"\n" +"(3).coinar un pokemon" +"\n" +"(4).Mandar a la pc"));
		
		
	switch (operacao) {
	case 1:
	
		for (int i = 0; i < 6; i++) {

			Socket socket = new Socket("127.0.0.1", local);
			/*
			 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
			 * um novo processo. Permitindo assim a conexão de vário clientes com o
			 * servidor.
			 */
			Cliente c = new Cliente(operacao, socket, dao.getLista(), dao,aux11);

			c.run();


		}
		System.out.println(dao.mostrarpokemones());
		break;
	case 2:
		
		Socket socket = new Socket("127.0.0.1", local);
		/*
		 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
		 * um novo processo. Permitindo assim a conexão de vário clientes com o
		 * servidor.
		 */
		Cliente c = new Cliente(operacao, socket, dao.getLista(), dao,aux11);

		c.run();
		
		break;

	default:
		break;
	}
			} catch (Exception e) {
				// TODO: handle exception
			}	
		
	}
	}
}
