package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

/**
 * 
 * @author KEVIN
 * @author NICOLAS
 * @author JOSE
 * 
 *         Clase encargada de las informacion visual de los 6 pokemones
 *         iniciales
 *
 */
public class Iniciales extends JPanel {
	/**
	 * Atributo tipo JPanel Muestra la imformacion general del pokemon
	 * 
	 */
	JPanel bolsillo;

	/**
	 * Atributo de tipo ArrayList que guarda los pokemones del usuario
	 */

	ArrayList<JButton> inicial;

	/**
	 * Metodo constructor <b>pre</b> La existencia de los atributos <br>
	 * <b>post</b> se instancian los atributos <br>
	 */
	public Iniciales() {

		// Creamos la matriz de botones
		bolsillo = new JPanel(new GridLayout(0, 1));

		inicial = new ArrayList<JButton>();

		for (int i = 0; i < 6; i++) {
			JButton caja1pokrr = new JButton();
			caja1pokrr.setText("                ");
//			caja1pokrr.setText("bolsillo"+(i + 1));

			caja1pokrr.setActionCommand("bolsillo" + (i + 1));

			inicial.add(caja1pokrr);
			bolsillo.add(inicial.get(i));

		}

		bolsillo.setVisible(true);

		add(bolsillo);

		// Configuramos el tamaño y hacemos visible el JFrame
		setSize(1000, 300);
		setVisible(true);
	}

	/**
	 * @return the bolsillo
	 */
	public JPanel getBolsillo() {
		return bolsillo;
	}

	/**
	 * @param bolsillo the bolsillo to set
	 */
	public void setBolsillo(JPanel bolsillo) {
		this.bolsillo = bolsillo;
	}

	/**
	 * @return the inicial
	 */
	public ArrayList<JButton> getInicial() {
		return inicial;
	}

	/**
	 * @param inicial the inicial to set
	 */
	public void setInicial(ArrayList<JButton> inicial) {
		this.inicial = inicial;
	}

}
