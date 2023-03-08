package co.edu.unbosque.view;
/*
 * @author ANGEL
 * @author SANTIAGO
 * @author SHARICK
 * 
 * Aquí lo que hemos hecho es crear un cojuto de label, botones, campos de texto y traer a lista pokemon a esta ventana, para su diseño en si.
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Pokemones_panel extends JPanel {

	private JLabel titulo, subtitulo,fondo_grid;
	private JButton b_atras, b_atras_caja, b_siguiente_caja;
	private InfoPokemon info_pokemon;
	private Iniciales iniciales;
	private Botonera caja;
	public Pokemones_panel() {

		iniciales = new Iniciales();

        JScrollPane scroll2 = new JScrollPane(iniciales);
        scroll2.setBounds(80, 100, 200, 440);
        scroll2.getViewport().setOpaque(false);
        scroll2.setOpaque(false);
        scroll2.setBorder(null);


        add(scroll2);
        
		setSize(1200, 700);
		setLayout(null);
		setVisible(false);

		b_atras = new JButton("Atras");
		b_atras.setForeground(Color.white);
		b_atras.setBackground(Color.decode("#C81F32"));
		b_atras.setFont(new Font("Arial", Font.BOLD, 10));
		b_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_atras.setBounds(300, 600, 150, 50);
		b_atras.setActionCommand("atras_lista");
		b_atras.setVisible(true);

		subtitulo = new JLabel("Caja 1");
		subtitulo.setBounds(500, 20, 300, 100);
		subtitulo.setFont(new Font("Arial", Font.BOLD, 50));


		caja = new Botonera();
	
		JScrollPane scroll = new JScrollPane(caja);
		scroll.setBounds(320, 100, 840, 440);
		scroll.getViewport().setOpaque(false);
		scroll.setOpaque(false);
		scroll.setBorder(null);
	 
		
	    add(scroll);
	    
		ImageIcon icono1 = new ImageIcon("Flecha izquierda.png");		
		b_atras_caja= new JButton("");
		b_atras_caja.setOpaque(false);
		b_atras_caja.setContentAreaFilled(false);
		b_atras_caja.setBorderPainted(false);
		b_atras_caja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_atras_caja.setBounds(200, 50, 150, 50);
		b_atras_caja.setActionCommand("atras_caja");
		b_atras_caja.setVisible(true);
		b_atras_caja.setIcon(icono1);
		
		ImageIcon icono2 = new ImageIcon("Flecha derecha.png");		
		b_siguiente_caja = new JButton("");
		b_siguiente_caja.setIcon(icono2);
		b_siguiente_caja.setOpaque(false);
		b_siguiente_caja.setContentAreaFilled(false);
		b_siguiente_caja.setBorderPainted(false);
		b_siguiente_caja.setFont(new Font("Arial", Font.BOLD, 10));
		b_siguiente_caja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_siguiente_caja.setBounds(800, 50, 150, 50);
		b_siguiente_caja.setActionCommand("siguiente_caja");
		b_siguiente_caja.setVisible(true);
		
		info_pokemon = new InfoPokemon();
		
		titulo = new JLabel("2 GENERACION");
		titulo.setBounds(460, 0, 300, 100);
		titulo.setFont(new Font("Arial", Font.BOLD, 30));


		fondo_grid = new JLabel();
		fondo_grid.setBounds(260, 180, 655, 400);
		ImageIcon fondo2 = new ImageIcon("fondo_grid.png");
		Icon icono = new ImageIcon(fondo2.getImage().getScaledInstance(fondo_grid.getWidth(), fondo_grid.getHeight(),
				Image.SCALE_DEFAULT));
		fondo_grid.setIcon(icono);

		add(fondo_grid);
		add(subtitulo);
		add(b_atras);
		add(b_atras_caja);
		add(fondo_grid);
		add(b_siguiente_caja);
	}

	public JButton getB_atras_caja() {
		return b_atras_caja;
	}

	public void setB_atras_caja(JButton b_atras_caja) {
		this.b_atras_caja = b_atras_caja;
	}

	public JButton getB_siguiente_caja() {
		return b_siguiente_caja;
	}

	public void setB_siguiente_caja(JButton b_siguiente_caja) {
		this.b_siguiente_caja = b_siguiente_caja;
	}

	/**
	 * @return the fondo_grid
	 */
	public JLabel getFondo_grid() {
		return fondo_grid;
	}

	/**
	 * @param fondo_grid the fondo_grid to set
	 */
	public void setFondo_grid(JLabel fondo_grid) {
		this.fondo_grid = fondo_grid;
	}

	/**
	 * @return the caja
	 */
	public Botonera getCaja() {
		return caja;
	}

	public InfoPokemon getInfo_pokemon() {
		return info_pokemon;
	}

	public void setInfo_pokemon(InfoPokemon info_pokemon) {
		this.info_pokemon = info_pokemon;
	}

	/**
	 * @param caja the caja to set
	 */
	public void setCaja(Botonera caja) {
		this.caja = caja;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getB_atras() {
		return b_atras;
	}

	public JLabel getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(JLabel subtitulo) {
		this.subtitulo = subtitulo;
	}

	public void setB_atras(JButton b_atras) {
		this.b_atras = b_atras;
	}

}
