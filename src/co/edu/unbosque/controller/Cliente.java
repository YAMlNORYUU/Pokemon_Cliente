package co.edu.unbosque.controller;

import javax.swing.*;

import co.edu.unbosque.model.PokemonDTO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Cliente implements Runnable{

  int operacao = 0;
    private Socket cliente;
    double num1;
    double num2;
    char opr;
    private  ArrayList<PokemonDTO> lista;
  



	



    public Cliente(int operacao, Socket cliente, ArrayList<PokemonDTO> lista) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
		this.lista = lista;
	}








	public void run() {
        try {
            PrintStream saida;
            System.out.println("O cliente conectou ao servidor");

            ObjectInputStream resultado = new ObjectInputStream(cliente.getInputStream());
            ObjectOutputStream dados = new ObjectOutputStream(cliente.getOutputStream());

            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

            
            
            dados.writeInt(operacao);
            dados.writeDouble(num1);
            dados.writeDouble(num2);
            dados.flush();

//
            
            double total = resultado.readDouble();
            
            opr = resultado.readChar();
           
            
        	 int id= resultado.readInt();
        	 String nombre= resultado.readUTF();
        	 int id_general= resultado.readInt();
        	 String tipo= resultado.readUTF();
        	 String ps= resultado.readUTF();
        	 String ataque= resultado.readUTF();
        	 String defensa= resultado.readUTF();
        	 String ataque_especial= resultado.readUTF();
        	 String defensa_especial= resultado.readUTF();
        	 String velocidad= resultado.readUTF();
        	 String mote= resultado.readUTF();
        	 String movimientos= resultado.readUTF();
        	 int nivel= resultado.readInt();
 
            System.out.println("Total de " + num1 + opr + num2 + " = " + total);
//            System.out.println(obj[0]+" Soy la monda ");
System.out.println(nombre+velocidad);
            resultado.close();
            dados.close();
        } catch (IOException  e) {
            e.printStackTrace();
        } 
//        catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
}