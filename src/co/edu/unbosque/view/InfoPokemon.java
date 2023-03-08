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

public class InfoPokemon extends JPanel {
	private JLabel id_text, id_general_text;
	private JLabel nombre_pokemon, id, id_general, imagen_pokemon;
	private JButton b_atras;
	private JLabel tipo;
	private JLabel categoria;
	private JLabel habilidad;
	private JLabel habilidad_text;
	private JLabel debilidad;
	private JLabel debilidad_text;
	private JLabel peso;
	private JLabel altura;
	private JLabel habitad;
	private JLabel color;
	private JLabel peso_text;
	private JLabel altura_text;
	private JLabel tipo_text;
	private JLabel categoria_text;
	private JLabel habitad_text;
	private JLabel color_text;
	private ImageIcon imagen;
	private String file_img;

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
	public void cambiar_01() {
		imagen_pokemon = new JLabel();
		imagen_pokemon.setBounds(200, 0, 500, 500);
		imagen = new ImageIcon(file_img);

		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imagen_pokemon.getWidth(),
				imagen_pokemon.getHeight(), Image.SCALE_DEFAULT));
		imagen_pokemon.setIcon(icono);
		add(imagen_pokemon);

	}
	public void quitar_01() {
		remove(imagen_pokemon);	
	}

	public JLabel getNombre_pokemon() {
		return nombre_pokemon;
	}

	public void setNombre_pokemon(JLabel nombre_pokemon) {
		this.nombre_pokemon = nombre_pokemon;
	}

	public JLabel getId() {
		return id;
	}

	public void setId(JLabel id) {
		this.id = id;
	}

	public JLabel getId_general() {
		return id_general;
	}

	public void setId_general(JLabel id_general) {
		this.id_general = id_general;
	}

	public JLabel getId_text() {
		return id_text;
	}

	public void setId_text(JLabel id_text) {
		this.id_text = id_text;
	}

	public JLabel getId_general_text() {
		return id_general_text;
	}

	public void setId_general_text(JLabel id_general_text) {
		this.id_general_text = id_general_text;
	}

	public JButton getB_atras() {
		return b_atras;
	}

	public void setB_atras(JButton b_atras) {
		this.b_atras = b_atras;
	}

	public JLabel getImagen_pokemon() {
		return imagen_pokemon;
	}

	public JLabel getTipo() {
		return tipo;
	}

	public void setTipo(JLabel tipo) {
		this.tipo = tipo;
	}

	public JLabel getCategoria() {
		return categoria;
	}

	public void setCategoria(JLabel categoria) {
		this.categoria = categoria;
	}

	public JLabel getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(JLabel habilidad) {
		this.habilidad = habilidad;
	}

	public JLabel getHabilidad_text() {
		return habilidad_text;
	}

	public void setHabilidad_text(JLabel habilidad_text) {
		this.habilidad_text = habilidad_text;
	}

	public JLabel getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(JLabel debilidad) {
		this.debilidad = debilidad;
	}

	public JLabel getDebilidad_text() {
		return debilidad_text;
	}

	public void setDebilidad_text(JLabel debilidad_text) {
		this.debilidad_text = debilidad_text;
	}

	public JLabel getPeso() {
		return peso;
	}

	public void setPeso(JLabel peso) {
		this.peso = peso;
	}

	public JLabel getAltura() {
		return altura;
	}

	public void setAltura(JLabel altura) {
		this.altura = altura;
	}

	public JLabel getHabitad() {
		return habitad;
	}

	public void setHabitad(JLabel habitad) {
		this.habitad = habitad;
	}

	public JLabel getColor() {
		return color;
	}

	public void setColor(JLabel color) {
		this.color = color;
	}

	public JLabel getPeso_text() {
		return peso_text;
	}

	public void setPeso_text(JLabel peso_text) {
		this.peso_text = peso_text;
	}

	public JLabel getAltura_text() {
		return altura_text;
	}

	public void setAltura_text(JLabel altura_text) {
		this.altura_text = altura_text;
	}

	public JLabel getTipo_text() {
		return tipo_text;
	}

	public void setTipo_text(JLabel tipo_text) {
		this.tipo_text = tipo_text;
	}

	public JLabel getCategoria_text() {
		return categoria_text;
	}

	public void setCategoria_text(JLabel categoria_text) {
		this.categoria_text = categoria_text;
	}

	public JLabel getHabitad_text() {
		return habitad_text;
	}

	public void setHabitad_text(JLabel habitad_text) {
		this.habitad_text = habitad_text;
	}

	public JLabel getColor_text() {
		return color_text;
	}

	public void setColor_text(JLabel color_text) {
		this.color_text = color_text;
	}

	public void setImagen_pokemon(JLabel imagen_pokemon) {
		this.imagen_pokemon = imagen_pokemon;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	public String getFile_img() {
		return file_img;
	}

	public void setFile_img(String file_img) {
		this.file_img = file_img;
	}

}
