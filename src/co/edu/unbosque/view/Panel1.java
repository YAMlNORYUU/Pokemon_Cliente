package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel1 extends JPanel {
	private JLabel n;
	private JButton j;
	
	public Panel1() {
		setLayout(null);
		setBackground(Color.GRAY);
		setVisible(true);
		inicializarcomponentes();
		
	}

	private void inicializarcomponentes() {
		n = new JLabel();
		add(n);
		
		j = new JButton("Mi novia no deja juagr en pool");
		add(j);
		setVisible(true);
		j.setBackground(Color.orange);
		j.setBounds(10, 150, 80, 20);
		
	}

	public JLabel getN() {
		return n;
	}

	public void setN(JLabel n) {
		this.n = n;
	}
	
	

}