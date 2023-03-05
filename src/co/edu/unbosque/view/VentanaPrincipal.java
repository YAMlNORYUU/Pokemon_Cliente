package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	private Panel1 p1;
	
	private Panel2 p2;
	
	private Panel3 p3;
	
	
	public VentanaPrincipal() {
		setTitle("Vamo mechita");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.MAGENTA);
		getContentPane().setLayout(new GridLayout(2,9));
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		incomponentes();	
	}

	private void incomponentes() {
		p1 = new Panel1();
		setLayout( new BorderLayout());
		setLayout(new GridLayout(2,1));
		getContentPane().add(p1);
		
		p2 = new Panel2();
		setLayout( new BorderLayout());
		setLayout(new GridLayout(2,1));
		getContentPane().add(p2);
		
		p3 = new Panel3();
		setLayout( new BorderLayout());
		setLayout(new GridLayout(1,2));
		getContentPane().add(p3);
		
		
	}

}
