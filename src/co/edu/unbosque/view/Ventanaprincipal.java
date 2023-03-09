package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Ventana principal de la interfaz grafica
 * 
 * @author Kevin
 * @author Nicolas
 * @author jose
 */
public class Ventanaprincipal extends JFrame {

	/**
	 * Atributo tipo JButton el cual indica al usuario que entro al programa
	 */
	JButton b_ingresar;
	/**
	 * Atributo tipo JButton el cual indica al usuario que salio al programa
	 */
	JButton b_salir;
	/**
	 * Panel que muestra el menu
	 */
	JPanel menu;
	/**
	 * Atributo tipo JLabel imagenes gif para ambientar 
	 */
	JLabel fondo_menu, lugia, ho_oh;
	/**
	 * Panel que muestra las cajas de pokemones
	 */
	Pokemones_panel panel_pokemones;
	
	/**
	 * Panel que muestra la informacion de los pokemones
	 */
	InfoPokemon info_pokemon;

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */
	public Ventanaprincipal() {
		setSize(1200, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		info_pokemon = new InfoPokemon();
		panel_pokemones = new Pokemones_panel();
		
		fondo_menu = new JLabel();
		fondo_menu.setBounds(0, 0, 1180, 660);
		ImageIcon fondo2 = new ImageIcon("menu.jpg");
		Icon icono = new ImageIcon(fondo2.getImage().getScaledInstance(fondo_menu.getWidth(), fondo_menu.getHeight(),
				Image.SCALE_DEFAULT));
		fondo_menu.setIcon(icono);
		
		b_ingresar = new JButton("Ingresar");
		b_ingresar.setForeground(Color.black);
		b_ingresar.setBackground(Color.decode("#FFFFFF"));
		b_ingresar.setFont(new Font("Arial", Font.BOLD, 30));
		b_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_ingresar.setBounds(440, 300, 300, 100);
		b_ingresar.setFocusable(false);
		b_ingresar.setActionCommand("INGRESAR");
		b_ingresar.setVisible(true);

		b_salir = new JButton("SALIR");
		b_salir.setForeground(Color.black);
		b_salir.setBackground(Color.decode("#FFFFFF"));
		b_salir.setFont(new Font("Arial", Font.BOLD, 30));
		b_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_salir.setBounds(440, 450, 300, 100);
		b_salir.setFocusable(false);
		b_salir.setActionCommand("SALIR");
		b_salir.setVisible(true);

		menu = new JPanel();
		menu.setBounds(0, 0, 1200, 700);
		menu.setLayout(null);
		menu.add(b_salir);
		menu.setVisible(false);

		lugia = new JLabel();
		lugia.setBounds(850, 220, 200, 200);
		ImageIcon cyndaquil2 = new ImageIcon("lugia.gif");
		icono = new ImageIcon(cyndaquil2.getImage().getScaledInstance(lugia.getWidth(), lugia.getHeight(),
				Image.SCALE_DEFAULT));
		lugia.setIcon(icono);

		ho_oh = new JLabel();
		ho_oh.setBounds(150, 220, 200, 200);
		ImageIcon pichu2 = new ImageIcon("Ho-Oh.gif");
		icono = new ImageIcon(
				pichu2.getImage().getScaledInstance(ho_oh.getWidth(), ho_oh.getHeight(), Image.SCALE_DEFAULT));
		ho_oh.setIcon(icono);

		menu.add(b_ingresar);
		menu.add(lugia);
		menu.add(ho_oh);
		menu.add(fondo_menu);
		add(panel_pokemones);
		add(menu);

	}

	/**
	 * @return the b_ingresar
	 */
	public JButton getB_ingresar() {
		return b_ingresar;
	}

	/**
	 * @param b_ingresar the b_ingresar to set
	 */
	public void setB_ingresar(JButton b_ingresar) {
		this.b_ingresar = b_ingresar;
	}

	/**
	 * @return the b_salir
	 */
	public JButton getB_salir() {
		return b_salir;
	}

	/**
	 * @param b_salir the b_salir to set
	 */
	public void setB_salir(JButton b_salir) {
		this.b_salir = b_salir;
	}

	/**
	 * @return the menu
	 */
	public JPanel getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(JPanel menu) {
		this.menu = menu;
	}

	/**
	 * @return the fondo_menu
	 */
	public JLabel getFondo_menu() {
		return fondo_menu;
	}

	/**
	 * @param fondo_menu the fondo_menu to set
	 */
	public void setFondo_menu(JLabel fondo_menu) {
		this.fondo_menu = fondo_menu;
	}

	/**
	 * @return the lugia
	 */
	public JLabel getLugia() {
		return lugia;
	}

	/**
	 * @param lugia the lugia to set
	 */
	public void setLugia(JLabel lugia) {
		this.lugia = lugia;
	}

	/**
	 * @return the ho_oh
	 */
	public JLabel getHo_oh() {
		return ho_oh;
	}

	/**
	 * @param ho_oh the ho_oh to set
	 */
	public void setHo_oh(JLabel ho_oh) {
		this.ho_oh = ho_oh;
	}

	/**
	 * @return the panel_pokemones
	 */
	public Pokemones_panel getPanel_pokemones() {
		return panel_pokemones;
	}

	/**
	 * @param panel_pokemones the panel_pokemones to set
	 */
	public void setPanel_pokemones(Pokemones_panel panel_pokemones) {
		this.panel_pokemones = panel_pokemones;
	}

	/**
	 * @return the info_pokemon
	 */
	public InfoPokemon getInfo_pokemon() {
		return info_pokemon;
	}

	/**
	 * @param info_pokemon the info_pokemon to set
	 */
	public void setInfo_pokemon(InfoPokemon info_pokemon) {
		this.info_pokemon = info_pokemon;
	}

}
