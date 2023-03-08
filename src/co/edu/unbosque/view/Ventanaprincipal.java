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
 * Panel destinado a que el usuario escoja que funcion va a usar por medio de la ventana, donde creamos 
 * botosnes, ventanas, paneles y demas cosas necesarias, aqui realizamos el diseño del pane principal 
 * añadiendo sus  respectivos botones, imagenes, etc.
 *
 * @author Kevin
 * @author Gabriel
 */
public class Ventanaprincipal extends JFrame {

	JButton b_ingresar;
	JButton b_salir;
	JPanel menu;
	JLabel fondo_menu, lugia, ho_oh;
	Pokemones_panel panel_pokemones;

	public Iniciales getIniciales() {
		return iniciales;
	}

	public void setIniciales(Iniciales iniciales) {
		this.iniciales = iniciales;
	}

	Iniciales iniciales;

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */
	public Ventanaprincipal() {
		setSize(1200, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		panel_pokemones = new Pokemones_panel();
		iniciales = new Iniciales();
		
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
	 * @param b_guardar,b_eliminar,b_listar,b_salir
	 * @return b_guardar,b_eliminar,b_listar,b_salir
	 */

	public Pokemones_panel getPanel_pokemones() {
		return panel_pokemones;
	}

	public void setPanel_pokemones(Pokemones_panel panel_pokemones) {
		this.panel_pokemones = panel_pokemones;
	}

	public JLabel getFondo_menu() {
		return fondo_menu;
	}

	public void setFondo_menu(JLabel fondo_menu) {
		this.fondo_menu = fondo_menu;
	}

	public JButton getB_ingresar() {
		return b_ingresar;
	}

	public void setB_ingresar(JButton b_ingresar) {
		this.b_ingresar = b_ingresar;
	}

	public JLabel getLugia() {
		return lugia;
	}

	public void setLugia(JLabel lugia) {
		this.lugia = lugia;
	}

	public JLabel getHo_oh() {
		return ho_oh;
	}

	public void setHo_oh(JLabel ho_oh) {
		this.ho_oh = ho_oh;
	}

	public JPanel getMenu() {
		return menu;
	}

	public void setMenu(JPanel menu) {
		this.menu = menu;
	}

	public JButton getB_salir() {
		return b_salir;
	}

	public void setB_salir(JButton b_salir) {
		this.b_salir = b_salir;
	}

}
