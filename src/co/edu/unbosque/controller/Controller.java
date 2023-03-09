package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Archivo;
import co.edu.unbosque.model.PokemonDAO;
import co.edu.unbosque.view.Ventana_general;




public class Controller implements ActionListener{
	private PokemonDAO dao;
	int operacao = 0;
	int local = 12345;
	int aux11  = 1;
	private Archivo archivo;


	private Ventana_general vp;

	public Controller() {
		archivo = new Archivo();
		vp = new Ventana_general();
		dao = new PokemonDAO(archivo);
		asignarOyentes();


	}
	
	public void Iniciales6() {
		
		for (int i = 0; i < 6; i++) {
			//
						Socket socket = null;
						try {
							socket = new Socket("127.0.0.1", local);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						/*
						 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
						 * um novo processo. Permitindo assim a conexão de vário clientes com o
						 * servidor.
						 */
						Cliente c = new Cliente(1, socket, dao.getLista(), dao,1);
			
						c.run();
		}
	}
	

	
	public void bolsillo() {
		for (int i = 0; i < 6; i++) {
			
			ImageIcon icono = new ImageIcon("2 GEN/" + (dao.getLista().get(i).getId() ) + ".png");
		vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(i).setText(dao.getLista().get(i).getNombre());
		vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(i).setIcon(icono);
		}

	}

	public void asignarOyentes() {

		vp.getV_principal().getB_ingresar().addActionListener(this);
		vp.getV_principal().getB_salir().addActionListener(this);
		vp.getV_principal().getPanel_pokemones().getB_atras().addActionListener(this);
		vp.getV_principal().getPanel_pokemones().getB_atras_caja().addActionListener(this);
		vp.getV_principal().getPanel_pokemones().getB_siguiente_caja().addActionListener(this);
		vp.getV_principal().getInfo_pokemon().getB_atras().addActionListener(this);

		vp.getV_principal().getPanel_pokemones().getEliminar().addActionListener(this);
		for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().size(); i++) {
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(i).addActionListener(this);
	
		}
		for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().size(); i++) {
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(i).addActionListener(this);
	
		}
		for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().size(); i++) {
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(i).addActionListener(this);
	
		}
		for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().size(); i++) {
			vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(i).addActionListener(this);
	
		}


	}



	/**
	 * Archivo para guardar informacion de los candidatos
	 */



	public void cargarBase() throws UnknownHostException, IOException {

	

		for (int i = 0; i < 100; i++) {

			Socket socket = new Socket("127.0.0.1", local);
			/*
			 * Cria um novo objeto Cliente com a conexão socket para que seja executado em
			 * um novo processo. Permitindo assim a conexão de vário clientes com o
			 * servidor.
			 */
			Cliente c = new Cliente(2, socket, dao.getLista(), dao,aux11);

			c.run();
			aux11++;

		}
		



	}
	public void iniciar() throws UnknownHostException, IOException {
		vp.getV_principal().setVisible(true);
		vp.getV_principal().getMenu().setVisible(true);
		cargarBase();
		repartirCajas();

	}

	public void repartirCajas() {

		for (int i = 0; i < 36; i++) {

			dao.getCaja1().add(dao.getPc().get(i));


			vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(i).setText(dao.getCaja1().get(i).getNombre());





		}
		for (int i = 36; i < 72; i++) {

			dao.getCaja2().add(dao.getPc().get(i));
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(i-36).setText(dao.getCaja2().get(i-36).getNombre());


		}
		for (int i = 72; i < 100; i++) {

			dao.getCaja3().add(dao.getPc().get(i));
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(i-72).setText(dao.getCaja3().get(i-72).getNombre());


		}


	}

		

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		if (comando.equals("INGRESAR")) {
			
		
			
			int aux1 = vp.getJp().mostrarYoN("Quieres iniciar con 6 pokemones");

if (aux1==0) {
	Iniciales6();
	
	bolsillo();
	vp.getV_principal().getPanel_pokemones().setVisible(true);
	vp.getV_principal().getMenu().setVisible(false);
}else {
	vp.getV_principal().getPanel_pokemones().setVisible(true);
	vp.getV_principal().getMenu().setVisible(false);
	
	for (int i = 0; i < vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().size(); i++) {
		
		ImageIcon icono = new ImageIcon("2 GEN/" + (0 ) + ".png");
		vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(i).setIcon(icono);
	}
}

		}
		for (int j = 0; j < dao.getCaja1().size(); j++) {

			if (comando.equals("Boton caja 1 "+(j + 1))) {



				if (dao.getLista().size()==6) {
					ImageIcon icono = new ImageIcon("2 GEN/" + (dao.getCaja1().get(j).getId() ) + ".png");
					
					vp.getJp().mostrarInfoIco(dao.getCaja1().get(j).info(), icono);
				}else {
					
					ImageIcon icono = new ImageIcon("2 GEN/" + (dao.getCaja1().get(j).getId() ) + ".png");
					
					int aux =	vp.getJp().mostrarInformacionIcono(dao.getCaja1().get(j).info()+"\n"+"Quiere meterlo a tu bolsillo", icono);
					
					if (aux == 0) {
						
						
					
						dao.getLista().add(dao.getCaja1().get(j));
				
						ImageIcon icono1 = new ImageIcon("2 GEN/" + (dao.getCaja1().get(j).getId() ) + ".png");

						
						vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(dao.getLista().size()-1).setText(dao.getCaja1().get(j).getNombre());
						vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(dao.getLista().size()-1).setIcon(icono1);

					
					
						
//						vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().remove(j);
//						vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().remove(j);
						
						vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(j).setText("");
						ImageIcon icono12 = new ImageIcon("2 GEN/" + (0 ) + ".png");
						vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(j).setIcon(icono12);
						
						vp.getV_principal().getPanel_pokemones().getCaja().repaint();
						vp.getJp().mostrarInformacion("Agregado al bolsillo");
					} else if (aux == 1) {
					
						
					}
				}



			
			
			
			
			
			
			}
		}
		for (int j = 0; j < dao.getCaja2().size(); j++) {

			if (comando.equals("Boton caja 2 "+(j + 1))) {


				if (dao.getLista().size()==6) {
					ImageIcon icono = new ImageIcon("2 GEN/" + (dao.getCaja2().get(j).getId() ) + ".png");
					
					vp.getJp().mostrarInfoIco(dao.getCaja2().get(j).info(), icono);
				}else {
					
					ImageIcon icono = new ImageIcon("2 GEN/" + (dao.getCaja2().get(j).getId() ) + ".png");
					
					int aux =	vp.getJp().mostrarInformacionIcono(dao.getCaja2().get(j).info()+"\n"+"Quiere meterlo a tu bolsillo", icono);
					
					if (aux == 0) {
						
						
					
						dao.getLista().add(dao.getCaja2().get(j));
				
						ImageIcon icono1 = new ImageIcon("2 GEN/" + (dao.getCaja2().get(j).getId() ) + ".png");

						
						vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(dao.getLista().size()-1).setText(dao.getCaja2().get(j).getNombre());
						vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(dao.getLista().size()-1).setIcon(icono1);

					
						vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(j).setText("");
						ImageIcon icono12 = new ImageIcon("2 GEN/" + (0 ) + ".png");
						vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(j).setIcon(icono12);
						
						vp.getV_principal().getPanel_pokemones().getCaja().repaint();
						vp.getJp().mostrarInformacion("Agregado al bolsillo");
					} else if (aux == 1) {
					
						
					}
				}



			
			
			
			
			
			
			}
		}
		for (int j = 0; j < dao.getCaja3().size(); j++) {

			if (comando.equals("Boton caja 3 "+(j + 1))) {

				if (dao.getLista().size()==6) {
					ImageIcon icono = new ImageIcon("2 GEN/" + (dao.getCaja3().get(j).getId() ) + ".png");
					
					vp.getJp().mostrarInfoIco(dao.getCaja3().get(j).info(), icono);
				}else {
					
					ImageIcon icono = new ImageIcon("2 GEN/" + (dao.getCaja3().get(j).getId() ) + ".png");
					
					int aux =	vp.getJp().mostrarInformacionIcono(dao.getCaja3().get(j).info()+"\n"+"Quiere meterlo a tu bolsillo", icono);
					
					if (aux == 0) {
						
						
					
						dao.getLista().add(dao.getCaja3().get(j));
				
						ImageIcon icono1 = new ImageIcon("2 GEN/" + (dao.getCaja3().get(j).getId() ) + ".png");

						
						vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(dao.getLista().size()-1).setText(dao.getCaja3().get(j).getNombre());
						vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(dao.getLista().size()-1).setIcon(icono1);

					
						
						vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(j).setText("");
						ImageIcon icono12 = new ImageIcon("2 GEN/" + (0 ) + ".png");
						vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(j).setIcon(icono12);
						
						
						
						vp.getV_principal().getPanel_pokemones().getCaja().repaint();
						vp.getJp().mostrarInformacion("Agregado al bolsillo");
					} else if (aux == 1) {
						
						
						
						
						
					}
				}



			
			
			
			
			
			
			}
		}
		
		for (int j = 0; j < dao.getLista().size(); j++) {
			
			if (comando.equals("bolsillo"+(j + 1))) {
				
				System.out.println(j);
				System.out.println(dao.getLista().get(j).getNombre());
				ImageIcon icono1 = new ImageIcon("2 GEN/" + (dao.getLista().get(j).getId() ) + ".png");

				int aux =	vp.getJp().mostrarInformacionIcono(dao.getLista().get(j).info()+"\n"+"Quieres Meterlo a la pc", icono1);
			
				if (aux == 0) {
					
			String aux1 = vp.getJp().tomarDato("En que caja quiere meterlo");
			try {
			int aux11 = Integer.parseInt(aux1);
				
		
		if (aux11 == 1) {
			dao.getCaja1().add(dao.getLista().get(j));
			dao.getLista().remove(j);
			vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(j).setText("");
			vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(j).setIcon(null);
			vp.getV_principal().getPanel_pokemones().getCaja().agregar(1);
			
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(dao.getCaja1().size()-1).setText(dao.getCaja1().get(dao.getCaja1().size()-1).getNombre());
			ImageIcon icono12 = new ImageIcon("2 GEN/" + (dao.getCaja1().get(dao.getCaja1().size()-1).getId() ) + ".png");
	
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(dao.getCaja1().size()-1).setIcon(icono12);
			
		for (int i = 0; i < dao.getLista().size(); i++) {
//			
//			vp.getV_principal().getPanel_pokemones()
			
			
		}
			vp.getV_principal().getPanel_pokemones().getCaja().repaint();
			System.out.println(aux11);
	
			
			
		}else if (aux11 == 2) {
			dao.getCaja2().add(dao.getLista().get(j));
			dao.getLista().remove(j);
			vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(j).setText("");
			vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(j).setIcon(null);
			vp.getV_principal().getPanel_pokemones().getCaja().agregar(2);
			
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(dao.getCaja2().size()-1).setText(dao.getCaja2().get(dao.getCaja2().size()-1).getNombre());
			ImageIcon icono12 = new ImageIcon("2 GEN/" + (dao.getCaja2().get(dao.getCaja2().size()-1).getId() ) + ".png");
	
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(dao.getCaja2().size()-1).setIcon(icono12);
			
			dao.eliminar(dao.getCaja2().get(dao.getCaja2().size()-1).getNombre(), dao.getLista());
			vp.getV_principal().getPanel_pokemones().getCaja().repaint();
		
		
		}else if (aux11 == 3) {
			
			dao.getCaja3().add(dao.getLista().get(j));
			dao.getLista().remove(j);
			vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(j).setText("");
			vp.getV_principal().getPanel_pokemones().getIniciales().getInicial().get(j).setIcon(null);
			vp.getV_principal().getPanel_pokemones().getCaja().agregar(3);
			
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(dao.getCaja3().size()-1).setText(dao.getCaja3().get(dao.getCaja3().size()-1).getNombre());
			ImageIcon icono12 = new ImageIcon( + (dao.getCaja3().get(dao.getCaja3().size()-1).getId() ) + ".png");
	
			vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(dao.getCaja3().size()-1).setIcon(icono12);
			
			dao.eliminar(dao.getCaja3().get(dao.getCaja3().size()-1).getNombre(), dao.getLista());
			vp.getV_principal().getPanel_pokemones().getCaja().repaint();
			
			
		}
			} catch (Exception e2) {
			vp.getJp().mostrarError("Digitaste algo mal");
			}
				} else if (aux == 1) {
				
					
				}
				
				
				
				
				}
		}



		if (comando.equals("atras_lista")) {
			vp.getV_principal().getPanel_pokemones().setVisible(false);
			vp.getV_principal().getMenu().setVisible(true);
		

		}

		if (comando.equals("atras_caja")) {

            if (vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().isVisible()) {
                vp.getV_principal().getPanel_pokemones().getB_atras_caja().setEnabled(false);
                vp.getV_principal().getPanel_pokemones().getB_atras_caja().setVisible(true);
         
            }else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().isVisible()){
                vp.getV_principal().getPanel_pokemones().getB_atras_caja().setEnabled(false);
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(false);
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().setVisible(true);
                vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 1");;
            
            }else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().isVisible()) {
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().setVisible(false);
                vp.getV_principal().getPanel_pokemones().getB_atras_caja().setEnabled(true);
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(true);
                vp.getV_principal().getPanel_pokemones().getB_siguiente_caja().setEnabled(true);
                vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 2");;
            
            }
        

        }
		
if (comando.equals("siguiente_caja")) {
            if (vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().isVisible()) {
                vp.getV_principal().getPanel_pokemones().getB_atras_caja().setEnabled(true);
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(true);
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja1().setVisible(false);
                vp.getV_principal().getPanel_pokemones().getB_siguiente_caja().setVisible(true);
                vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 2");
             
            }else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().isVisible()){
                vp.getV_principal().getPanel_pokemones().getB_siguiente_caja().setEnabled(false);
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().setVisible(true);
                vp.getV_principal().getPanel_pokemones().getCaja().getCaja2().setVisible(false);
                vp.getV_principal().getPanel_pokemones().getSubtitulo().setText("Caja 3");
       
            }else if(vp.getV_principal().getPanel_pokemones().getCaja().getCaja3().isVisible()) {
                vp.getV_principal().getPanel_pokemones().getB_siguiente_caja().setVisible(true);
       
            }
        

        }


		if (comando.equals("SALIR")) {
			int op = vp.getJp().mostrarYoN("Desea salir?");
			if (op == 0) {
				System.exit(0);
			} else if (op == 1) {

			}
		}
		
		if (comando.equals("Eliminar")) {
			try {
				
		
			String aux1 = vp.getJp().tomarDato("Esbriba el nombre del pokemon");
			String aux12 = vp.getJp().tomarDato("Digite en que caja esta");
			
			int aux4 =Integer.parseInt(aux12);
			
			switch (aux4) {
			case 1:
			int a11 = dao.eliminar(aux1, dao.getCaja1());
		
				
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(a11).setText("");
				ImageIcon icono12 = new ImageIcon("2 GEN/" + (0 ) + ".png");
				vp.getV_principal().getPanel_pokemones().getCaja().getCaja1poke().get(a11).setIcon(icono12);
				break;
	case 2:
		int a12 = dao.eliminar(aux1, dao.getCaja2());
		
		
		vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(a12).setText("");
		ImageIcon icono122 = new ImageIcon("2 GEN/" + (0 ) + ".png");
		vp.getV_principal().getPanel_pokemones().getCaja().getCaja2poke().get(a12).setIcon(icono122);
				break;

	case 3:
		int a13 = dao.eliminar(aux1, dao.getCaja3());
		
		
		vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(a13).setText("");
		ImageIcon icono121 = new ImageIcon("2 GEN/" + (0 ) + ".png");
		vp.getV_principal().getPanel_pokemones().getCaja().getCaja3poke().get(a13).setIcon(icono121);
		break;


			default:
				vp.getJp().mostrarInformacion("Digitaste algo mal");
				break;
			}
			
			vp.getJp().mostrarInformacion("Eliminado");

			} catch (Exception e2) {
				vp.getJp().mostrarError("Digitaste algo mal");
			}
		}
	}
}
