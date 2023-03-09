
package co.edu.unbosque.view;
/**
 * 
 * @author KEVIN
 * @author jose
 * @author nicolas
 * 
 * instanciar el modelo vista
 *
 */
public class Ventana_general {
	/**
	 * Ventana Principal del programa
	 */
	private Ventanaprincipal v_principal;
	/**
	 * Clase que se encarga de las Ventanas emergentes del programa
	 */
	private JPane jp;
	/**
	 * Metodo constructor <b>pre</b> La existencia de los atributos <br>
	 * <b>post</b> se instancian los atributos <br>
	 */
	public Ventana_general() {

		v_principal = new Ventanaprincipal();
		jp = new JPane();

	}
	/**
	 * @return the v_principal
	 */
	public Ventanaprincipal getV_principal() {
		return v_principal;
	}
	/**
	 * @param v_principal the v_principal to set
	 */
	public void setV_principal(Ventanaprincipal v_principal) {
		this.v_principal = v_principal;
	}
	/**
	 * @return the jp
	 */
	public JPane getJp() {
		return jp;
	}
	/**
	 * @param jp the jp to set
	 */
	public void setJp(JPane jp) {
		this.jp = jp;
	}


}
