package co.edu.unbosque.view;

import javax.swing.ImageIcon;

/**
 * 
 * @author KEVIN
 * @author ANGEL
 * @author SANTIAGO
 * @author SHARICK
 * 
 * Aqu√≠ lo que hemos hecho es crear unos jpain que nos permitiran mostrar unos peque√±os mensajes 
 * al usuario
 *
 */

public class JPane extends javax.swing.JOptionPane {
	
	public int mostrarInformacionIcono(String mensaje,ImageIcon icono) {
		int opcion = JPane.showConfirmDialog(null, mensaje, "TÌtulo del mensaje", JPane.YES_NO_OPTION, JPane.INFORMATION_MESSAGE, icono);
		
		if (opcion == 0) {
		  return 0;
		} else  {
			  return 1;
		}
	}

	
	public void mostrarInfoIco(String mensaje,ImageIcon icono) {

		JPane.showMessageDialog(null, mensaje, "TÌtulo del mensaje", JPane.INFORMATION_MESSAGE, icono);

	}
	
	public String tomarDato(String mensaje) {

		String entrada = JPane.showInputDialog(null, mensaje);
		return entrada;

	}
	public void mostrarInformacion(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "Ventana de Informacion", JPane.INFORMATION_MESSAGE);
	}

//	public void mostrarError(String mensaje) {
//		JPane.showMessageDialog(null, mensaje, "Ventana de Advertencia", JPane.ERROR_MESSAGE);
//	}

	public void mostrarError(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "Ventana de Error", JPane.ERROR_MESSAGE);
	}

	public void mostrarOk(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "Oyeeeee", JPane.PLAIN_MESSAGE);
	}

	public int mostrarYoN(String mensaje) {
		return JPane.showConfirmDialog(null, mensaje, "Wait...", JPane.YES_NO_OPTION,
				JPane.QUESTION_MESSAGE);
	}

	public void mostrarYes_Option(String mensaje) {
		JPane.showMessageDialog(null, mensaje, "", JPane.YES_OPTION);

	}
}
