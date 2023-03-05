package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel2 extends JPanel {
	private JLabel n;
	
	public Panel2() {
		setLayout(null);
		setBackground(Color.BLUE);
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