package co.edu.unbosque.model;

import java.io.IOException;
import java.util.ArrayList;

public class PokemonDAO {

		private ArrayList<PokemonDTO> lista;
		private ArrayList<PokemonDTO> pc;
		private ArrayList<PokemonDTO> caja1;
		private ArrayList<PokemonDTO> caja2;
		private ArrayList<PokemonDTO> caja3;
		
		/**
		 * Archivo donde se guardara la informacion
		 */
		private Archivo archivo;

		public PokemonDAO(Archivo archivo) {
			this.archivo = archivo;
			lista = new ArrayList<PokemonDTO>();
			pc = new ArrayList<PokemonDTO>();
			caja1 = new ArrayList<PokemonDTO>();
			caja2 = new ArrayList<PokemonDTO>();
			caja3 = new ArrayList<PokemonDTO>();

			lista = archivo.leerArchivo();
		}

		public void guardar(int id, String nombre, int id_general, String tipo, String ps, String ataque, String defensa,
				String ataque_especial, String defensa_especial, String velocidad, String mote, String movimientos,
				int nivel) throws Exception {

			
			if (lista.size()<6) {
				
				PokemonDTO a = new PokemonDTO( id,  nombre,  id_general,  tipo,  ps,  ataque,  defensa,
						ataque_especial,  defensa_especial,  velocidad,  mote,  movimientos,
						nivel);
				lista.add(a);
				archivo.escribirEnArchivo(lista);
			}else {

				System.out.println("Tu Tienes ya 6 pokemones");
			

				throw new Exception("No ingresar caracteres especiales, ni numeros en el nombre");

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

		/**
		 * @return the caja1
		 */
		public ArrayList<PokemonDTO> getCaja1() {
			return caja1;
		}

		/**
		 * @param caja1 the caja1 to set
		 */
		public void setCaja1(ArrayList<PokemonDTO> caja1) {
			this.caja1 = caja1;
		}

		/**
		 * @return the caja2
		 */
		public ArrayList<PokemonDTO> getCaja2() {
			return caja2;
		}

		/**
		 * @param caja2 the caja2 to set
		 */
		public void setCaja2(ArrayList<PokemonDTO> caja2) {
			this.caja2 = caja2;
		}

		/**
		 * @return the caja3
		 */
		public ArrayList<PokemonDTO> getCaja3() {
			return caja3;
		}

		/**
		 * @param caja3 the caja3 to set
		 */
		public void setCaja3(ArrayList<PokemonDTO> caja3) {
			this.caja3 = caja3;
		}

		public ArrayList<PokemonDTO> getLista() {
			return lista;
		}

		public void setLista(ArrayList<PokemonDTO> lista) {
			this.lista = lista;
		}

		/**
		 * @return the pc
		 */
		public ArrayList<PokemonDTO> getPc() {
			return pc;
		}

		/**
		 * @param pc the pc to set
		 */
		public void setPc(ArrayList<PokemonDTO> pc) {
			this.pc = pc;
		}

		/**
		 * @return the archivo
		 */
		public Archivo getArchivo() {
			return archivo;
		}

		/**
		 * @param archivo the archivo to set
		 */
		public void setArchivo(Archivo archivo) {
			this.archivo = archivo;
		}

}

