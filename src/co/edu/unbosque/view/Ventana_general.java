
package co.edu.unbosque.view;
/**
 * 
 * @author KEVIN
 * @author ANGEL
 * @author SANTIAGO
 * @author SHARICK
 * 
 * Aquí lo que hemos hecho es crear un jp e inicializarlo con sus setters y sus getters
 *
 */
public class Ventana_general {

	private Ventanaprincipal v_principal;
	private JPane jp;

	public Ventana_general() {

		v_principal = new Ventanaprincipal();
		jp = new JPane();

	}

	public JPane getJp() {
		return jp;
	}

	public void setJp(JPane jp) {
		this.jp = jp;
	}

	public Ventanaprincipal getV_principal() {
		return v_principal;
	}

	public void setV_principal(Ventanaprincipal v_principal) {
		this.v_principal = v_principal;
	}

}
