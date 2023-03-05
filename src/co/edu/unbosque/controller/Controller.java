package co.edu.unbosque.controller;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.PokemonDAO;

public class Controller {
	private PokemonDAO dao;
	int operacao = 0;
	int local = 12345;

	public Controller() {

		dao = new PokemonDAO();
	}

	public void iniciar() throws UnknownHostException, IOException {

		while (true) {
			
	
		operacao = Integer.parseInt(
				JOptionPane.showInputDialog("Qual operação desejada? 1= +, 2= -,3= X,4= /,5= ^,6= %,7= √"));
		
		
	switch (operacao) {
	case 1:
		for (int i = 0; i < 6; i++) {

			if (operacao <= 0 || operacao > 7) {
				System.out.println("Você digitou uma operação inválida.");
			}

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
