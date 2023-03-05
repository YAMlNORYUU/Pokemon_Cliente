/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.controller;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Scanner;

import co.edu.unbosque.view.View;

/**
 *
 * @author Nicolas Machado
 * @author Kevin Gonzales
 * 
 */
public class Cliente extends Thread {
	// initialize socket and input output streams
	private Socket socket;
	private ServerSocket server;
	private Scanner sn;
	private DataOutputStream out;
	private DataInputStream in; // Input stream from server
	private String address;
	private int port;
	private View vp;

	// constructor to put ip address and port
	public Cliente(String address, int port) {
		// initialize socket and input output streams
		vp = new View();
		this.socket = null;
		this.server = null;
		this.sn = new Scanner(System.in);
		this.out = null;
		this.address = address;
		this.port = port;

	}

	@Override
	public void run() {

		// string to read message from input
		String line = "";

		// keep reading until "Over" is input
		while (!line.equals("Over")) {
			// establish a connection
			try {
				this.socket = new Socket(this.address, this.port);
				vp.confirm("conectado: Bienvenido")
				;

				// sets timeout for server response
				this.socket.setSoTimeout(2000); // 5 seconds
				// sends output to the socket
				this.out = new DataOutputStream(socket.getOutputStream());

				// line = this.input.readLine();
				line = sn.next();
				this.out.writeUTF(line);
				// close socket and output stream
				this.out.close();
				this.socket.close();
				// Create a serverSocket to wait message from server
				this.server = new ServerSocket(this.port + 1);
				this.socket = server.accept();
				// takes input from the client socket
				this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				// Print in server the client message

				System.out.println(in.readUTF());
				this.in.close();
				this.server.close();
			} catch (SocketTimeoutException ste) {
				vp.confirm("El servidor no responde, cerrando coneccion.");
				line = "Over";
				try {
					this.socket.close();
				} catch (IOException e) {
					vp.confirm("Error cerrando socket: " + e.getMessage());
				}
			} catch (IOException i) {
				vp.confirm("Error: " + i.getMessage());
			}
		}

		// close the connection
		try {
			out.close();
			socket.close();
		} catch (IOException i) {
			vp.confirm(i.getMessage());
		}

	}

}