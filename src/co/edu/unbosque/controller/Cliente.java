package co.edu.unbosque.controller;

import javax.swing.*;

import co.edu.unbosque.model.PokemonDAO;
import co.edu.unbosque.model.PokemonDTO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Cliente implements Runnable {

	int operacao = 0;
	private Socket cliente;
	double num1;
	double num2;
	char opr;
	private ArrayList<PokemonDTO> lista;
	private PokemonDAO dao;

	public Cliente(int operacao, Socket cliente, ArrayList<PokemonDTO> lista, PokemonDAO dao) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
		this.lista = lista;
		this.dao = dao;
	}

	public void run() {
		try {
			PrintStream saida;

			ObjectInputStream resultado = new ObjectInputStream(cliente.getInputStream());
			ObjectOutputStream dados = new ObjectOutputStream(cliente.getOutputStream());

			dados.writeInt(operacao);

			dados.flush();

//

			int id = resultado.readInt();
			String nombre = resultado.readUTF();
			int id_general = resultado.readInt();
			String tipo = resultado.readUTF();
			String ps = resultado.readUTF();
			String ataque = resultado.readUTF();
			String defensa = resultado.readUTF();
			String ataque_especial = resultado.readUTF();
			String defensa_especial = resultado.readUTF();
			String velocidad = resultado.readUTF();
			String mote = resultado.readUTF();
			String movimientos = resultado.readUTF();
			int nivel = resultado.readInt();

			try {
				dao.guardar(id, nombre, id_general, tipo, ps, ataque, defensa, ataque_especial, defensa_especial, velocidad,
						mote, movimientos, nivel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			resultado.close();
			dados.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
//        catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}