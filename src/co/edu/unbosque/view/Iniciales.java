package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class Iniciales extends JPanel {
    JPanel bolsillo;



    ArrayList<JButton> inicial;




    public Iniciales() {

        // Creamos la matriz de botones
        bolsillo = new JPanel(new GridLayout(0, 1));



        inicial = new ArrayList<JButton>();



        for (int i = 0; i < 6; i++) {
            JButton caja1pokrr = new JButton();
            caja1pokrr.setText("Botón " + (i + 1));

            ImageIcon icono = new ImageIcon("2 GEN/" + (i + 1) + ".png");
            caja1pokrr.setIcon(icono);
            caja1pokrr.setActionCommand("Boton caja 1 "+(i + 1));

            inicial.add(caja1pokrr);
            bolsillo.add(inicial.get(i));

        }







        bolsillo.setVisible(true);


        add(bolsillo);


        // Configuramos el tamaño y hacemos visible el JFrame
        setSize(1000, 300);
        setVisible(true);
    }



    /*
     * @return the bolsillo
     */
    public JPanel getBolsillo() {
        return bolsillo;
    }


    /*
     * @param bolsillo the bolsillo to set
     */
    public void setBolsillo(JPanel bolsillo) {
        this.bolsillo = bolsillo;
    }


    /*
     * @return the inicial
     */
    public ArrayList<JButton> getInicial() {
        return inicial;
    }


    /*
     * @param inicial the inicial to set
     */
    public void setInicial(ArrayList<JButton> inicial) {
        this.inicial = inicial;
    }



}