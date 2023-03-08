package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Archivo;
import co.edu.unbosque.model.PokemonDAO;
import co.edu.unbosque.view.Ventana_general;
import co.edu.unbosque.view.View;




public class Controller implements ActionListener{
	private PokemonDAO dao;
	int operacao = 0;
	int local = 12345;
	int aux11  = 1;
	private Archivo archivo;


	private Ventana_general vp;

	public Controller() {
		archivo = new Archivo();
		vp = new Ventana_general();
		dao = new PokemonDAO(archivo);
		asignarOyentes();


	}

	public void asignarOyentes() {

		vp.getV_principal().getB_ingresar().addActionListener(this);
		vp.getV_principal().getB_salir().addActionListener(this);
		vp.getV_principal().getPanel_pokemones().getB_atras().addActionListener(this);
		vp.getV_principal().getPanel_pokemones().getB_atras_caja().addActionListener(this);
		vp.getV_principal().getPanel_pokemones().getB_siguiente_caja().addActionListener(this);
		vp.getV_principal().getInfo_pokemon().getB_atras().addActionListener(this);


		//		
		for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().size(); i++) {
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(i).addActionListener(this);

		}
		for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().size(); i++) {
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(i).addActionListener(this);

		}
		for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().size(); i++) {
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(i).addActionListener(this);

		}


	}



	/**
	 * Archivo para guardar informacion de los candidatos
	 */



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



	}
	public void iniciar() throws UnknownHostException, IOException {
		vp.getV_principal().setVisible(true);
		vp.getV_principal().getMenu().setVisible(true);
		cargarBase();
		repartirCajas();

	}

	public void repartirCajas() {

		for (int i = 0; i < 36; i++) {

			dao.getCaja1().add(dao.getPc().get(i));


			vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(i).setText(dao.getCaja1().get(i).getNombre());





		}
		for (int i = 36; i < 72; i++) {

			dao.getCaja2().add(dao.getPc().get(i));
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(i-36).setText(dao.getCaja2().get(i-36).getNombre());


		}
		for (int i = 72; i < 100; i++) {

			dao.getCaja3().add(dao.getPc().get(i));
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(i-72).setText(dao.getCaja3().get(i-72).getNombre());


		}


	}

	//	
	//	public void iniciar() throws UnknownHostException, IOException {
	//		
	//		
	//	cargarBase();
	//		
	//
	//		while (true) {
	//			try {
	//				
	//		
	//	
	//		operacao = Integer.parseInt(
	//				JOptionPane.showInputDialog("(1).Agregar 6 pokemones" + "\n" + "(2).Agrega un pokemon" +"\n" +"(3).coinar un pokemon" +"\n" +"(4).Mandar a la pc"));
	//		
	//		
	//	switch (operacao) {
	//	case 1:
	//	
	//		for (int i = 0; i < 6; i++) {
	//
	//			Socket socket = new Socket("127.0.0.1", local);
	//			/*
	//			 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
	//			 * um novo processo. Permitindo assim a conexão de vário clientes com o
	//			 * servidor.
	//			 */
	//			Cliente c = new Cliente(operacao, socket, dao.getLista(), dao,aux11);
	//
	//			c.run();
	//
	//
	//		}
	//		System.out.println(dao.mostrarpokemones());
	//		break;
	//	case 2:
	//		
	//		Socket socket = new Socket("127.0.0.1", local);
	//		/*
	//		 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
	//		 * um novo processo. Permitindo assim a conexão de vário clientes com o
	//		 * servidor.
	//		 */
	//		Cliente c = new Cliente(operacao, socket, dao.getLista(), dao,aux11);
	//
	//		c.run();
	//		
	//		break;
	//
	//	default:
	//		break;
	//	}
	//			} catch (Exception e) {
	//				// TODO: handle exception
	//			}	
	//		
	//	}
	//	}
	//	
	//	

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		if (comando.equals("INGRESAR")) {
			vp.getV_principal().getPanel_pokemones().setVisible(true);
			vp.getV_principal().getMenu().setVisible(false);
			//			vp.getV_principal().getPanel_pokemones().getCaja().agregar();


		}
		for (int j = 0; j < dao.getCaja1().size(); j++) {

			if (comando.equals("Boton caja 1 "+(j + 1))) {



				vp.getJp().mostrarInformacion(dao.getCaja1().get(j).toString());
			}
		}
		for (int j = 0; j < dao.getCaja2().size(); j++) {

			if (comando.equals("Boton caja 2 "+(j + 1))) {



				vp.getJp().mostrarInformacion(dao.getCaja2().get(j).toString());
			}
		}
		for (int j = 0; j < dao.getCaja3().size(); j++) {

			if (comando.equals("Boton caja 3 "+(j + 1))) {



				vp.getJp().mostrarInformacion(dao.getCaja3().get(j).toString());
			}
		}



		if (comando.equals("atras_lista")) {
			vp.getV_principal().getPanel_pokemones().setVisible(false);
			vp.getV_principal().getMenu().setVisible(true);

		}

		if (comando.equals("atras_caja")) {

			if (vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().isVisible()) {
				vp.getV_principal().getPanel_pokemones().getB_atras_caja().setVisible(false);
				 vp.getJp().mostrarInformacion("ya no puedes retroceder mas");
			}else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().isVisible()){
				vp.getV_principal().getPanel_pokemones().getB_atras_caja().setEnabled(false);
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(false);
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().setVisible(true);
				vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 1");;
				 vp.getJp().mostrarInformacion("ves la caja numero 2");
			}else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().isVisible()) {
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().setVisible(false);
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(true);
				vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 2");;
				 vp.getJp().mostrarInformacion("ves la caja numero 3");
			}
			//			System.out.println("funciono");

		}

		if (comando.equals("siguiente_caja")) {
			if (vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().isVisible()) {
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(true);
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().setVisible(false);
				vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 2");
				 vp.getJp().mostrarInformacion("ves la caja numero 1");
			}else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().isVisible()){
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().setVisible(true);
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(false);
				vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 3");;
				 vp.getJp().mostrarInformacion("ves la caja numero 2");
			}else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().isVisible()) {
				vp.getV_principal().getPanel_pokemones().getB_siguiente_caja().setEnabled(false);
				 vp.getJp().mostrarError("ya no puedes avanzar mas");
			}
			//			System.out.println("yo tambien funciono");

		}


		if (comando.equals("SALIR")) {
			int op = vp.getJp().mostrarYoN("Desea salir?");
			if (op == 0) {
				System.exit(0);
			} else if (op == 1) {

			}
		}
	}
}
