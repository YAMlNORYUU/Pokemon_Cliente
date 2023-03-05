package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel3 extends JPanel {
	private JLabel n;
	
	public Panel3() {
		setLayout(null);
		setBackground(Color.red);
		setVisible(true);
		inicializarcomponentes();
		
	}

	private void inicializarcomponentes() {
		n = new JLabel();
		add(n);
		
	}

	public JLabel getN() {
		return n;
	}

	public void setN(JLabel n) {
		this.n = n;
	}
	
	

}