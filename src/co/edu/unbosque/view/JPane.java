package co.edu.unbosque.view;

import javax.swing.ImageIcon;


/**
 * 
 * @author KEVIN
 * @author NICOLAS
 * @author JOSE
 * 
 * Clase encargada de los mensajes emergentes
 *
 */

public class JPane extends javax.swing.JOptionPane {
	/**
	 * Metodo que se encarga de mostar el icono por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */
	public int mostrarInformacionIcono(String mensaje,ImageIcon icono) {
		int opcion = JPane.showConfirmDialog(null, mensaje, "Título del mensaje", JPane.YES_NO_OPTION, JPane.INFORMATION_MESSAGE, icono);
		
		if (opcion == 0) {
		  return 0;
		} else  {
			  return 1;
		}
	}

	/**
	 * Metodo que se encarga de mostar el mensaje ingresado y el icono por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */
	public void mostrarInfoIco(String mensaje,ImageIcon icono) {

		JPane.showMessageDialog(null, mensaje, "Título del mensaje", JPane.INFORMATION_MESSAGE, icono);

	}
	/**
	 * Metodo que se encarga de ingresar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */
	public String tomarDato(String mensaje) {

		String entrada = JPane.showInputDialog(null, mensaje);
		return entrada;

	}
	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */
	public void mostrarInformacion(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "Ventana de Informacion", JPane.INFORMATION_MESSAGE);
	}


	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un JOptionPane
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */
	public void mostrarError(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "Ventana de Error", JPane.ERROR_MESSAGE);
	}
	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */
	public void mostrarOk(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "Oyeeeee", JPane.PLAIN_MESSAGE);
	}
	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje tipo int por medio del JOptionPane
	 */
	public int mostrarYoN(String mensaje) {
		return JPane.showConfirmDialog(null, mensaje, "Wait...", JPane.YES_NO_OPTION,
				JPane.QUESTION_MESSAGE);
	}
	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */
	public void mostrarYes_Option(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "", JPane.YES_OPTION);

	}
}
