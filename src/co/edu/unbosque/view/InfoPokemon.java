package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//import co.edu.unbosque.modelo.Modelo_fachada;
/**
 * 
 * @author KEVIN
 * @author NICOLAS
 * @author JOSE
 * 
 *  * JPanel encargado de la informacion de los pokemones
 *
 */
public class InfoPokemon extends JPanel {
	/**
	 * Atributo tipo JLabel Muestra la imformacion de la id y id general del pokemon
	 * 
	 */
	private JLabel id_text, id_general_text;
	/**
	 * Atributo tipo JLabel Muestra la imformacion del nombre, id numerico y id general numerico del pokemon y su imagen
	 * 
	 */
	private JLabel nombre_pokemon, id, id_general, imagen_pokemon;
	/**
	 * Atributo tipo JButton que se encarga de ir al menu 
	 * 
	 */
	private JButton b_atras;
	/**
	 * Atributo tipo JLabel Muestra la imformacion del tipo
	 * 
	 */
	private JLabel tipo;
	/**
	 * Atributo tipo JLabel Muestra la imformacion de la categoria
	 * 
	 */
	private JLabel categoria;
	/**
	 * Atributo tipo JLabel Muestra la imformacion de la habilidad numerica
	 * 
	 */
	private JLabel habilidad;
	/**
	 * Atributo tipo JLabel Muestra la imformacion de la habilidad
	 * 
	 */
	private JLabel habilidad_text;
	/**
	 * Atributo tipo JLabel Muestra la imformacion de la debilidad numerica
	 * 
	 */
	private JLabel debilidad;
	/**
	 * Atributo tipo JLabel Muestra la imformacion de la debilidad 
	 * 
	 */
	private JLabel debilidad_text;
	/**
	 * Atributo tipo JLabel Muestra la imformacion del peso numerico
	 * 
	 */
	private JLabel peso;
	/**
	 * Atributo tipo JLabel Muestra la imformacion de la altura numerico
	 * 
	 */
	private JLabel altura;
	/**
	 * Atributo tipo JLabel Muestra la imformacion del habitad numerico
	 * 
	 */
	private JLabel habitad;
	/**
	 * Atributo tipo JLabel Muestra la imformacion del color
	 * 
	 */
	private JLabel color;
	/**
	 * Atributo tipo JLabel Muestra la imformacion del peso
	 * 
	 */
	private JLabel peso_text;
	/**
	 * Atributo tipo JLabel Muestra el texto del peso
	 * 
	 */
	private JLabel altura_text;
	/**
	 * Atributo tipo JLabel Muestra el texto de la altura
	 * 
	 */
	private JLabel tipo_text;
	/**
	 * Atributo tipo JLabel Muestra el texto del tipo
	 * 
	 */
	private JLabel categoria_text;
	/**
	 * Atributo tipo JLabel Muestra el texto de la categoria
	 * 
	 */
	private JLabel habitad_text;
	/**
	 * Atributo tipo JLabel Muestra el texto del habitad
	 * 
	 */
	private JLabel color_text;
	/**
	 * Atributo tipo ImageIcon Muestra la imagen de los pokemones
	 * 
	 */
	private ImageIcon imagen;
	/**
	 * Atributo tipo String que se ecnarga de guardar la ruta de la imagen
	 */
	private String file_img;

	/**
	 * Metodo constructor <b>pre</b> La existencia de los atributos <br>
	 * <b>post</b> se instancian los atributos <br>
	 */

	public InfoPokemon() {

		setLayout(null);
		setBounds(0, 0, 1280, 720);

		file_img = "2 GEN/1.png";

		imagen_pokemon = new JLabel();
		imagen_pokemon.setBounds(200, 0, 500, 500);
		imagen = new ImageIcon(file_img);

		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imagen_pokemon.getWidth(),
				imagen_pokemon.getHeight(), Image.SCALE_DEFAULT));
		imagen_pokemon.setIcon(icono);

		b_atras = new JButton("Atras");
		b_atras.setForeground(Color.white);
		b_atras.setBackground(Color.decode("#C81F32"));
		b_atras.setFocusable(false);
		b_atras.setFont(new Font("Arial", Font.BOLD, 10));
		b_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_atras.setBounds(300, 600, 150, 50);
		b_atras.setActionCommand("atras_info");
		b_atras.setVisible(true);

		nombre_pokemon = new JLabel("sudowoodo");
		nombre_pokemon.setBounds(640, 50, 500, 100);
		nombre_pokemon.setFont(new Font("Arial", Font.BOLD, 40));

		id = new JLabel("1");
		id.setBounds(650, 130, 40, 59);
		id.setFont(new Font("Arial", Font.BOLD, 20));

		id_text = new JLabel(" = " + "ID DEL POKEMON");
		id_text.setBounds(690, 110, 400, 100);
		id_text.setFont(new Font("Arial", Font.BOLD, 20));

		id_general_text = new JLabel(" = " + "ID NACIONAL");
		id_general_text.setBounds(690, 160, 400, 100);
		id_general_text.setFont(new Font("Arial", Font.BOLD, 20));

		id_general = new JLabel("2");
		id_general.setBounds(650, 160, 400, 100);
		id_general.setFont(new Font("Arial", Font.BOLD, 20));

		tipo = new JLabel(" = TIPO");
		tipo.setBounds(978, 232, 319, 28);
		tipo.setFont(new Font("Arial", Font.BOLD, 20));

		tipo_text = new JLabel("Fantasma,Siniestro,Electrico,Hielo,Roca");
		tipo_text.setHorizontalAlignment(SwingConstants.RIGHT);
		tipo_text.setFont(new Font("Arial", Font.BOLD, 20));
		tipo_text.setBounds(538, 232, 430, 28);
		tipo_text.getHorizontalAlignment();

		categoria = new JLabel(" = CATEGORIA");
		categoria.setFont(new Font("Arial", Font.BOLD, 20));
		categoria.setBounds(935, 281, 319, 28);

		habilidad = new JLabel("HABILIDAD:");
		habilidad.setFont(new Font("Arial", Font.BOLD, 20));
		habilidad.setBounds(731, 325, 319, 28);

		habilidad_text = new JLabel("Iluminacion,Absorbe electricidad");
		habilidad_text.setHorizontalAlignment(SwingConstants.CENTER);
		habilidad_text.setFont(new Font("Arial", Font.BOLD, 20));
		habilidad_text.setBounds(630, 349, 319, 28);
		habilidad_text.getHorizontalAlignment();

		debilidad = new JLabel("DEBILIDAD:");
		debilidad.setFont(new Font("Arial", Font.BOLD, 20));
		debilidad.setBounds(731, 390, 319, 28);

		debilidad_text = new JLabel("Fantasmas,Fuego, Volador, Hielo, Sinietro, Veneno, Bicho");
		debilidad_text.setFont(new Font("Arial", Font.BOLD, 17));
		debilidad_text.setHorizontalAlignment(SwingConstants.CENTER);
		debilidad_text.setBounds(556, 400, 476, 79);
		debilidad_text.getHorizontalAlignment();

		peso = new JLabel(" = PESO");
		peso.setFont(new Font("Arial", Font.BOLD, 20));
		peso.setBounds(655, 502, 319, 28);

		peso_text = new JLabel("100,5 kg");
		peso_text.setFont(new Font("Arial", Font.BOLD, 20));
		peso_text.setBounds(575, 487, 79, 59);

		altura = new JLabel(" = ALTURA");
		altura.setFont(new Font("Arial", Font.BOLD, 20));
		altura.setBounds(800, 502, 319, 28);

		altura_text = new JLabel("5,5 m");
		altura_text.setFont(new Font("Arial", Font.BOLD, 20));
		altura_text.setBounds(752, 487, 53, 59);

		habitad = new JLabel(" = HABITAD");
		habitad.setFont(new Font("Arial", Font.BOLD, 20));
		habitad.setBounds(772, 606, 319, 28);

		habitad_text = new JLabel("Agua salada");
		habitad_text.setHorizontalAlignment(SwingConstants.CENTER);
		habitad_text.setFont(new Font("Arial", Font.BOLD, 20));
		habitad_text.setBounds(554, 606, 334, 28);

		categoria_text = new JLabel("Serpiente ferrea");
		categoria_text.setHorizontalAlignment(SwingConstants.RIGHT);
		categoria_text.setFont(new Font("Arial", Font.BOLD, 20));
		categoria_text.setBounds(538, 280, 387, 28);
		categoria_text.getHorizontalAlignment();

		color = new JLabel(" = COLOR");
		color.setFont(new Font("Arial", Font.BOLD, 20));
		color.setBounds(771, 556, 319, 28);

		color_text = new JLabel("Amarillo");
		color_text.setHorizontalAlignment(SwingConstants.RIGHT);
		color_text.setFont(new Font("Arial", Font.BOLD, 20));
		color_text.setBounds(434, 556, 334, 28);

		add(tipo);
		add(color);
		add(habitad);
		add(altura);
		add(peso);
		add(debilidad_text);
		add(debilidad);
		add(habilidad);
		add(categoria);
		add(habilidad_text);
		add(peso_text);
		add(altura_text);
		add(tipo_text);
		add(categoria_text);
		add(habitad_text);
		add(color_text);
		add(id_general_text);
		add(id_text);
		add(nombre_pokemon);
		add(id);
		add(b_atras);
		add(id_general);

		setVisible(false);
	}
	
	/**
	 * @return the id_text
	 */
	public JLabel getId_text() {
		return id_text;
	}
	/**
	 * @param id_text the id_text to set
	 */
	public void setId_text(JLabel id_text) {
		this.id_text = id_text;
	}
	/**
	 * @return the id_general_text
	 */
	public JLabel getId_general_text() {
		return id_general_text;
	}
	/**
	 * @param id_general_text the id_general_text to set
	 */
	public void setId_general_text(JLabel id_general_text) {
		this.id_general_text = id_general_text;
	}
	/**
	 * @return the nombre_pokemon
	 */
	public JLabel getNombre_pokemon() {
		return nombre_pokemon;
	}
	/**
	 * @param nombre_pokemon the nombre_pokemon to set
	 */
	public void setNombre_pokemon(JLabel nombre_pokemon) {
		this.nombre_pokemon = nombre_pokemon;
	}
	/**
	 * @return the id
	 */
	public JLabel getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(JLabel id) {
		this.id = id;
	}
	/**
	 * @return the id_general
	 */
	public JLabel getId_general() {
		return id_general;
	}
	/**
	 * @param id_general the id_general to set
	 */
	public void setId_general(JLabel id_general) {
		this.id_general = id_general;
	}
	/**
	 * @return the imagen_pokemon
	 */
	public JLabel getImagen_pokemon() {
		return imagen_pokemon;
	}
	/**
	 * @param imagen_pokemon the imagen_pokemon to set
	 */
	public void setImagen_pokemon(JLabel imagen_pokemon) {
		this.imagen_pokemon = imagen_pokemon;
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
	 * @return the tipo
	 */
	public JLabel getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(JLabel tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the categoria
	 */
	public JLabel getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(JLabel categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the habilidad
	 */
	public JLabel getHabilidad() {
		return habilidad;
	}
	/**
	 * @param habilidad the habilidad to set
	 */
	public void setHabilidad(JLabel habilidad) {
		this.habilidad = habilidad;
	}
	/**
	 * @return the habilidad_text
	 */
	public JLabel getHabilidad_text() {
		return habilidad_text;
	}
	/**
	 * @param habilidad_text the habilidad_text to set
	 */
	public void setHabilidad_text(JLabel habilidad_text) {
		this.habilidad_text = habilidad_text;
	}
	/**
	 * @return the debilidad
	 */
	public JLabel getDebilidad() {
		return debilidad;
	}
	/**
	 * @param debilidad the debilidad to set
	 */
	public void setDebilidad(JLabel debilidad) {
		this.debilidad = debilidad;
	}
	/**
	 * @return the debilidad_text
	 */
	public JLabel getDebilidad_text() {
		return debilidad_text;
	}
	/**
	 * @param debilidad_text the debilidad_text to set
	 */
	public void setDebilidad_text(JLabel debilidad_text) {
		this.debilidad_text = debilidad_text;
	}
	/**
	 * @return the peso
	 */
	public JLabel getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(JLabel peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public JLabel getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(JLabel altura) {
		this.altura = altura;
	}
	/**
	 * @return the habitad
	 */
	public JLabel getHabitad() {
		return habitad;
	}
	/**
	 * @param habitad the habitad to set
	 */
	public void setHabitad(JLabel habitad) {
		this.habitad = habitad;
	}
	/**
	 * @return the color
	 */
	public JLabel getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(JLabel color) {
		this.color = color;
	}
	/**
	 * @return the peso_text
	 */
	public JLabel getPeso_text() {
		return peso_text;
	}
	/**
	 * @param peso_text the peso_text to set
	 */
	public void setPeso_text(JLabel peso_text) {
		this.peso_text = peso_text;
	}
	/**
	 * @return the altura_text
	 */
	public JLabel getAltura_text() {
		return altura_text;
	}
	/**
	 * @param altura_text the altura_text to set
	 */
	public void setAltura_text(JLabel altura_text) {
		this.altura_text = altura_text;
	}
	/**
	 * @return the tipo_text
	 */
	public JLabel getTipo_text() {
		return tipo_text;
	}
	/**
	 * @param tipo_text the tipo_text to set
	 */
	public void setTipo_text(JLabel tipo_text) {
		this.tipo_text = tipo_text;
	}
	/**
	 * @return the categoria_text
	 */
	public JLabel getCategoria_text() {
		return categoria_text;
	}
	/**
	 * @param categoria_text the categoria_text to set
	 */
	public void setCategoria_text(JLabel categoria_text) {
		this.categoria_text = categoria_text;
	}
	/**
	 * @return the habitad_text
	 */
	public JLabel getHabitad_text() {
		return habitad_text;
	}
	/**
	 * @param habitad_text the habitad_text to set
	 */
	public void setHabitad_text(JLabel habitad_text) {
		this.habitad_text = habitad_text;
	}
	/**
	 * @return the color_text
	 */
	public JLabel getColor_text() {
		return color_text;
	}
	/**
	 * @param color_text the color_text to set
	 */
	public void setColor_text(JLabel color_text) {
		this.color_text = color_text;
	}
	/**
	 * @return the imagen
	 */
	public ImageIcon getImagen() {
		return imagen;
	}
	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}
	/**
	 * @return the file_img
	 */
	public String getFile_img() {
		return file_img;
	}
	/**
	 * @param file_img the file_img to set
	 */
	public void setFile_img(String file_img) {
		this.file_img = file_img;
	}
	
}
