package co.edu.unbosque.model;

import java.io.IOException;
import java.util.ArrayList;

public class PokemonDAO {

		private ArrayList<PokemonDTO> lista;
		private ArrayList<PokemonDTO> pc;
		
		/**
		 * Archivo donde se guardara la informacion
		 */
		private Archivo archivo;

		public PokemonDAO(Archivo archivo) {
			this.archivo = archivo;
			lista = new ArrayList<PokemonDTO>();
			pc = new ArrayList<PokemonDTO>();
			lista = archivo.leerArchivo();
		}

		public void guardar(int id, String nombre, int id_general, String tipo, String ps, String ataque, String defensa,
				String ataque_especial, String defensa_especial, String velocidad, String mote, String movimientos,
				int nivel) {

			
			if (lista.size()<6) {
				
				PokemonDTO a = new PokemonDTO( id,  nombre,  id_general,  tipo,  ps,  ataque,  defensa,
						ataque_especial,  defensa_especial,  velocidad,  mote,  movimientos,
						nivel);
				lista.add(a);
				archivo.escribirEnArchivo(lista);
			}else {
				System.out.println("Tu Tienes ya 6 pokemones");
			
			}

		}
		

		public void guardarPc(int id, String nombre, int id_general, String tipo, String ps, String ataque, String defensa,
				String ataque_especial, String defensa_especial, String velocidad, String mote, String movimientos,
				int nivel) {

			
		
				
				PokemonDTO a = new PokemonDTO( id,  nombre,  id_general,  tipo,  ps,  ataque,  defensa,
						ataque_especial,  defensa_especial,  velocidad,  mote,  movimientos,
						nivel);
				pc.add(a);
		
			

		}
		
		
		public PokemonDTO buscarNombre(String nombre, ArrayList<PokemonDTO> lista) {

			PokemonDTO encontrado = null;

			if (!lista.isEmpty()) {
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).getNombre().equals(nombre)) {
						encontrado = lista.get(i);
						return encontrado;
					}
				}
			}
			return encontrado;
		}

		public boolean eliminar(String nombre, ArrayList<PokemonDTO> lista) {

			try {
				PokemonDTO bus = buscarNombre(nombre, lista);
				lista.remove(bus);
				archivo.getArchivo().delete();
				archivo.getArchivo().createNewFile();
				archivo.escribirEnArchivo(lista);

				return true;

			} catch (IOException e) {
				e.printStackTrace();
			}
			return false;
		}

		public boolean modificarMote(String Nombre, String mote, ArrayList<PokemonDTO> lista)
		 {
			try {		
				PokemonDTO bus = buscarNombre(Nombre,  lista );
					bus.setMote(mote);
					archivo.getArchivo().delete();
					archivo.getArchivo().createNewFile();
					archivo.escribirEnArchivo(lista);
					return true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		public String mostrarpokemones() {
			String tempText = "";

			for (int i = 0; i < pc.size(); i++) {
				tempText = tempText.concat(pc.get(i).toString()) + "\n\n";
			}

			return tempText;
		}

		public ArrayList<PokemonDTO> getLista() {
			return lista;
		}

		public void setLista(ArrayList<PokemonDTO> lista) {
			this.lista = lista;
		}

}

