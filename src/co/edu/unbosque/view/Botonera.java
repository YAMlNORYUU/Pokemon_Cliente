package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class Botonera extends JPanel {
	JPanel caja1;
	JPanel caja2;
	JPanel caja3;


	ArrayList<JButton> caja1poke;
	ArrayList<JButton> caja2poke;
	ArrayList<JButton> caja3poke;

	

	int aux1;

	public Botonera() {

		// Creamos la matriz de botones
		caja1 = new JPanel(new GridLayout(0, 6));
		caja2 = new JPanel(new GridLayout(0, 6));
		caja3 = new JPanel(new GridLayout(0, 6));
//    
//  for (int i = 0; i < 100; i++) {
//  JButton boton = new JButton("Botón " + (i+1));
//  
//  ImageIcon icono = new ImageIcon("2 GEN/" + (i +1) + ".png");
//  boton.setIcon(icono);
//  panelBotones.add(boton);
//  System.out.println(i);
//}
//  JButton boton1 = new JButton("Botón " + (100+1));
//    
//  panelBotones.add(boton1);
	
		caja1poke = new ArrayList<JButton>();
		caja2poke = new ArrayList<JButton>();
		caja3poke = new ArrayList<JButton>();
		

		for (int i = 0; i < 36; i++) {
			JButton caja1pokrr = new JButton();
			caja1pokrr.setText("Botón " + (i + 1));

			ImageIcon icono = new ImageIcon("2 GEN/" + (i + 1) + ".png");
			caja1pokrr.setIcon(icono);
			caja1pokrr.setActionCommand("Boton caja 1 "+(i + 1));
			
			caja1poke.add(caja1pokrr);
			caja1.add(caja1poke.get(i));
	
		}


		for (int i = 36; i < 72; i++) {
			JButton caja2pokrr = new JButton();
			caja2pokrr.setText("Botón " + (i + 1));

			ImageIcon icono = new ImageIcon("2 GEN/" + (i + 1) + ".png");
			caja2pokrr.setIcon(icono);
			caja2pokrr.setActionCommand("Boton caja 2 "+((i-36) + 1));
			
			caja2poke.add(caja2pokrr);
			caja2.add(caja2poke.get(i-36));
		}
//
		for (int i = 72; i < 100; i++) {
			JButton caja1pokrr = new JButton();
			caja1pokrr.setText("Botón " + (i + 1));

			ImageIcon icono = new ImageIcon("2 GEN/" + (i + 1) + ".png");
			caja1pokrr.setIcon(icono);
			caja1pokrr.setActionCommand("Boton caja 3 "+((i-72) + 1));
			
			caja3poke.add(caja1pokrr);
			caja3.add(caja3poke.get(i-72));
		}

		



		// Agregamos la matriz de botones al JScrollPane

		
		caja1.setVisible(true);
		caja2.setVisible(false);
		caja3.setVisible(false);

		add(caja1);
		add(caja2);
		add(caja3);

		// Configuramos el tamaño y hacemos visible el JFrame
		setSize(1000, 300);
		setVisible(true);
	}

	
	public void agregar() {

		
	
	}
	/**
	 * @return the panelBotones
	 */
	public JPanel getPanelBotones() {
		return caja1;
	}

	/**
	 * @param panelBotones the panelBotones to set
	 */
	public void setPanelBotones(JPanel panelBotones) {
		this.caja1 = panelBotones;
	}


	/**
	 * @return the caja1
	 */
	public JPanel getCaja1() {
		return caja1;
	}


	/**
	 * @param caja1 the caja1 to set
	 */
	public void setCaja1(JPanel caja1) {
		this.caja1 = caja1;
	}


	/**
	 * @return the caja2
	 */
	public JPanel getCaja2() {
		return caja2;
	}


	/**
	 * @param caja2 the caja2 to set
	 */
	public void setCaja2(JPanel caja2) {
		this.caja2 = caja2;
	}


	/**
	 * @return the caja3
	 */
	public JPanel getCaja3() {
		return caja3;
	}


	/**
	 * @param caja3 the caja3 to set
	 */
	public void setCaja3(JPanel caja3) {
		this.caja3 = caja3;
	}


	/**
	 * @return the aux1
	 */
	public int getAux1() {
		return aux1;
	}


	/**
	 * @param aux1 the aux1 to set
	 */
	public void setAux1(int aux1) {
		this.aux1 = aux1;
	}


	/**
	 * @return the caja1poke
	 */
	public ArrayList<JButton> getCaja1poke() {
		return caja1poke;
	}


	/**
	 * @param caja1poke the caja1poke to set
	 */
	public void setCaja1poke(ArrayList<JButton> caja1poke) {
		this.caja1poke = caja1poke;
	}


	/**
	 * @return the caja2poke
	 */
	public ArrayList<JButton> getCaja2poke() {
		return caja2poke;
	}


	/**
	 * @param caja2poke the caja2poke to set
	 */
	public void setCaja2poke(ArrayList<JButton> caja2poke) {
		this.caja2poke = caja2poke;
	}


	/**
	 * @return the caja3poke
	 */
	public ArrayList<JButton> getCaja3poke() {
		return caja3poke;
	}


	/**
	 * @param caja3poke the caja3poke to set
	 */
	public void setCaja3poke(ArrayList<JButton> caja3poke) {
		this.caja3poke = caja3poke;
	}



}
