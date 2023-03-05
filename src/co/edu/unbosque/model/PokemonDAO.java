package co.edu.unbosque.model;

import java.io.IOException;
import java.util.ArrayList;

public class PokemonDAO {

		private ArrayList<PokemonDTO> lista;

		public PokemonDAO() {
			lista = new ArrayList<PokemonDTO>();
		}

		public void guardar(int id, String nombre, int id_general, String tipo, String ps, String ataque, String defensa,
				String ataque_especial, String defensa_especial, String velocidad, String mote, String movimientos,
				int nivel) {

			
			if (lista.size()<6) {
				
				PokemonDTO a = new PokemonDTO( id,  nombre,  id_general,  tipo,  ps,  ataque,  defensa,
						ataque_especial,  defensa_especial,  velocidad,  mote,  movimientos,
						nivel);
				lista.add(a);
			}else {
				System.out.println("porque eres kevin");
			}

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

				return true;

			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		public boolean actualizarMote(int pos, String nom_nuevo) {
			try {
				lista.get(pos).setNombre(nom_nuevo);
				;
				return true;

			} catch (Exception e) {
				return false;
			}
		}

		public String mostrarpokemones() {
			String tempText = "";

			for (int i = 0; i < lista.size(); i++) {
				tempText = tempText.concat(lista.get(i).toString()) + "\n\n";
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

