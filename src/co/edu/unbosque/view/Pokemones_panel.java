package co.edu.unbosque.view;
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
/**
 * Panel que se ecnarga de mostrar el ArryList de pokemones
 * 
 * @author Kevin
 * @author Nicolas
 * @author jose
 */

public class Pokemones_panel extends JPanel {
	/**
	 * Atributo tipo JLabel Que muestran la informacion de las cajas y el fondo del
	 * panel
	 */
	private JLabel titulo, subtitulo,fondo_grid;
	/**
	 * Atributo tipo JButton Que muestran los botones para regresar al menu, y pasar
	 * a la siguiente pagina o volver a la anterior y eliminar
	 */
	private JButton b_atras, b_atras_caja, b_siguiente_caja,b_guardar, eliminar;
	/**
	 * JPanel de informacion de pokemones principales del usuario
	 */
	private Iniciales iniciales;
	/**
	 * JPanel de ArrayList de botones que muestra las imagenes de los pokemones
	 */
	private Botonera caja;
	/**
	 * Metodo constructor <b>pre</b> La existencia de los atributos <br>
	 * <b>post</b> se instancian los atributos <br>
	 */

	public Pokemones_panel() {

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


		
		b_guardar = new JButton("Guardar");
		b_guardar.setForeground(Color.white);
		b_guardar.setBackground(Color.decode("#C81F32"));
		b_guardar.setFont(new Font("Arial", Font.BOLD, 10));
		b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_guardar.setBounds(800, 600, 150, 50);
		b_guardar.setActionCommand("Guardar");
		b_guardar.setVisible(true);
		
		
		eliminar = new JButton("Eliminar");
		eliminar.setForeground(Color.white);
		eliminar.setBackground(Color.decode("#C81F32"));
		eliminar.setFont(new Font("Arial", Font.BOLD, 10));
		eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		eliminar.setBounds(600, 600, 150, 50);
		eliminar.setActionCommand("Eliminar");
		eliminar.setVisible(true);

		subtitulo = new JLabel("Caja 1");
		subtitulo.setBounds(500, 20, 300, 100);
		subtitulo.setFont(new Font("Arial", Font.BOLD, 50));


		iniciales = new Iniciales();
		caja = new Botonera();
	
		JScrollPane scroll1 = new JScrollPane(caja);
		scroll1.setBounds(320, 100, 840, 440);
		scroll1.getViewport().setOpaque(false);
		scroll1.setOpaque(false);
		scroll1.setBorder(null);
	 
		
	    add(scroll1);
	    
	    JScrollPane scroll2 = new JScrollPane(iniciales);
		scroll2.setBounds(80, 100, 200, 440);
		scroll2.getViewport().setOpaque(false);
		scroll2.setOpaque(false);
		scroll2.setBorder(null);
	 
		
	    add(scroll2);
	    
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
		
		titulo = new JLabel("2 GENERACION");
		titulo.setBounds(460, 0, 300, 100);
		titulo.setFont(new Font("Arial", Font.BOLD, 30));


		fondo_grid = new JLabel();
		fondo_grid.setBounds(260, 180, 655, 400);
		ImageIcon fondo2 = new ImageIcon("fondo_grid.png");
		Icon icono = new ImageIcon(fondo2.getImage().getScaledInstance(fondo_grid.getWidth(), fondo_grid.getHeight(),
				Image.SCALE_DEFAULT));
		fondo_grid.setIcon(icono);

		add(b_guardar);
		add(fondo_grid);
		add(eliminar);
		add(subtitulo);
		add(b_atras);
		add(b_atras_caja);
		add(fondo_grid);
		add(b_siguiente_caja);
	}
	/**
	 * @return the titulo
	 */
	public JLabel getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the subtitulo
	 */
	public JLabel getSubtitulo() {
		return subtitulo;
	}
	/**
	 * @param subtitulo the subtitulo to set
	 */
	public void setSubtitulo(JLabel subtitulo) {
		this.subtitulo = subtitulo;
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
	 * @return the b_atras
	 */
	public JButton getB_atras() {
		return b_atras;
	}
	/**
	 * @param b_atras the b_atras to set
	 */
	public void setB_atras(JButton b_atras) {
		this.b_atras = b_atras;
	}
	/**
	 * @return the b_atras_caja
	 */
	public JButton getB_atras_caja() {
		return b_atras_caja;
	}
	/**
	 * @param b_atras_caja the b_atras_caja to set
	 */
	public void setB_atras_caja(JButton b_atras_caja) {
		this.b_atras_caja = b_atras_caja;
	}
	/**
	 * @return the b_siguiente_caja
	 */
	public JButton getB_siguiente_caja() {
		return b_siguiente_caja;
	}
	/**
	 * @param b_siguiente_caja the b_siguiente_caja to set
	 */
	public void setB_siguiente_caja(JButton b_siguiente_caja) {
		this.b_siguiente_caja = b_siguiente_caja;
	}
	/**
	 * @return the eliminar
	 */
	public JButton getEliminar() {
		return eliminar;
	}
	/**
	 * @param eliminar the eliminar to set
	 */
	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}
	/**
	 * @return the iniciales
	 */
	public Iniciales getIniciales() {
		return iniciales;
	}
	/**
	 * @param iniciales the iniciales to set
	 */
	public void setIniciales(Iniciales iniciales) {
		this.iniciales = iniciales;
	}
	/**
	 * @return the caja
	 */
	public Botonera getCaja() {
		return caja;
	}
	/**
	 * @param caja the caja to set
	 */
	public void setCaja(Botonera caja) {
		this.caja = caja;
	}
	/**
	 * @return the b_guardar
	 */
	public JButton getB_guardar() {
		return b_guardar;
	}
	/**
	 * @param b_guardar the b_guardar to set
	 */
	public void setB_guardar(JButton b_guardar) {
		this.b_guardar = b_guardar;
	}

	

}
