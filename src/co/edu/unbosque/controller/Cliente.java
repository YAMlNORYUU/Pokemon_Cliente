package co.edu.unbosque.controller;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente implements Runnable{

  int operacao = 0;
    private Socket cliente;
    double num1;
    double num2;
    char opr;

  



	public Cliente(int operacao, Socket cliente) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
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
//            Object[] obj = (Object[]) resultado.readObject();
            
            double total = resultado.readDouble();
            
            opr = resultado.readChar();
            
            String a = resultado.readUTF();
            
            System.out.println(a);
//            System.out.println(obj[0]);
            System.out.println("Total de " + num1 + opr + num2 + " = " + total);
//            System.out.println(obj[0]+" Soy la monda ");

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