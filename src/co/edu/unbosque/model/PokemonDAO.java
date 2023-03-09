package co.edu.unbosque.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase PokemonDAO donde se encuentra el CRUD
 * 
 * @author NICOLAS
 * @author JOSE
 * @author KEVIN
 */
public class PokemonDAO {
	/**
	 * Atributo de tipo ArrayList que guarda los pokemones del usuario
	 */
	private ArrayList<PokemonDTO> lista;
	/**
	 * Atributo de tipo ArrayList que guarda los pokemones del pc
	 */
	private ArrayList<PokemonDTO> pc;
	/**
	 * Atributo de tipo ArrayList que guarda los pokemones de la caja 1
	 */
	private ArrayList<PokemonDTO> caja1;
	/**
	 * Atributo de tipo ArrayList que guarda los pokemones de la caja 2
	 */
	private ArrayList<PokemonDTO> caja2;
	/**
	 * Atributo de tipo ArrayList que guarda los pokemones de la caja 3
	 */
	private ArrayList<PokemonDTO> caja3;

	/**
	 * Archivo donde se guardara la informacion
	 */
	private Archivo archivo;

	/**
	 * Metodo constructor <b>pre</b> Archivo archivo <br>
	 * <b>post</b> se instancian los atributos <br>
	 */
	public PokemonDAO(Archivo archivo) {
		this.archivo = archivo;
		lista = new ArrayList<PokemonDTO>();
		pc = new ArrayList<PokemonDTO>();
		caja1 = new ArrayList<PokemonDTO>();
		caja2 = new ArrayList<PokemonDTO>();
		caja3 = new ArrayList<PokemonDTO>();

		lista = archivo.leerArchivo();
	}

	/**
	 * Metodo para guardar un nuevo pokemon <b> pre </b> <b> post </b> El nuevo
	 * pokemon es agregado a la lista del ususario<br>
	 * 
	 * @param id               El id a agregar
	 * @param nombre           El nombre a agregar
	 * @param id_general       la id_general a agregar
	 * @param tipo             El tipo a agregar
	 * @param ps               La ps a agregar
	 * @param ataque           La ataque a agregar
	 * @param defensa          La defensa a agregar
	 * @param ataque_especial  La ataque_especial a agregar
	 * @param defensa_especial La defensa_especial a agregar
	 * @param velocidad        La velocidad a agregar
	 * @param mote             La mote a agregar
	 * @param movimientos      La movimientos a agregar
	 * @param nivel            La nivel a agregar
	 * @return Un valor de verdad que indica si el pokemon fue agregado
	 *
	 */
	public void guardar(int id, String nombre, int id_general, String tipo, String ps, String ataque, String defensa,
			String ataque_especial, String defensa_especial, String velocidad, String mote, String movimientos,
			int nivel) throws Exception {

		if (lista.size() < 6) {

			PokemonDTO a = new PokemonDTO(id, nombre, id_general, tipo, ps, ataque, defensa, ataque_especial,
					defensa_especial, velocidad, mote, movimientos, nivel);
			lista.add(a);

		} else {

			System.out.println("Tu Tienes ya 6 pokemones");

		}

	}

	/**
	 * Metodo para agregar un nuevo pokemon en la pc <b> pre </b> <b> post </b> El
	 * nuevo pokemon es agregado a la lista del pc<br>
	 * 
	 * @param id               El id a agregar
	 * @param nombre           El nombre a agregar
	 * @param id_general       la id_general a agregar
	 * @param tipo             El tipo a agregar
	 * @param ps               La ps a agregar
	 * @param ataque           La ataque a agregar
	 * @param defensa          La defensa a agregar
	 * @param ataque_especial  La ataque_especial a agregar
	 * @param defensa_especial La defensa_especial a agregar
	 * @param velocidad        La velocidad a agregar
	 * @param mote             La mote a agregar
	 * @param movimientos      La movimientos a agregar
	 * @param nivel            La nivel a agregar
	 * @return Un valor de verdad que indica si el pokemon fue agregado
	 *
	 */

	public void guardarPc(int id, String nombre, int id_general, String tipo, String ps, String ataque, String defensa,
			String ataque_especial, String defensa_especial, String velocidad, String mote, String movimientos,
			int nivel) {

		PokemonDTO a = new PokemonDTO(id, nombre, id_general, tipo, ps, ataque, defensa, ataque_especial,
				defensa_especial, velocidad, mote, movimientos, nivel);
		pc.add(a);

	}

	/**
	 * Metodo para buscar un pokemon por el nombre <b> pre </b> La lista no debe
	 * estar vacia <br>
	 * <b> post </b> El pokemon es encontrado <br>
	 * 
	 * @param nombre la edad que se busca
	 * @param lista  La lista a buscar
	 * @return La informacion del pokemon encontrado
	 */

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

	public int buscar(String aux, String aux1, int xd) {
		int aux12 = 0;
		for (int i = 0; i < xd; i++) {

			if (aux.equals(aux1)) {
				return i;

			}
		}
		return aux12;

	}
	
	/**
	 * Metodo para eliminar por la nombre <b> pre </b> La existencia del pokemon
	 * <br>
	 * <b> post </b> El pokemon es eliminado <br>
	 * 
	 * @param nombre El nombre por el que se va a buscar
	 * @param lista  La lista de donde se va a eliminar el pokemon
	 * @return Un valor de verdad que indica si el pokemon fue eliminado
	 */
	public int eliminar(String nombre, ArrayList<PokemonDTO> lista) {

		int aux12 = 0;
		for (int i = 0; i < lista.size(); i++) {

			if (nombre.equals(lista.get(i).getNombre())) {
				return i;

			}
		}
		return aux12;

	}
	public boolean eliminarPos(String nombre, ArrayList<PokemonDTO> lista) {

		try {

			PokemonDTO bus = buscarNombre(nombre, lista);
			lista.remove(bus);

			return true;

		} catch (Exception e2) {
			e2.printStackTrace();
			return false;
		}

	}

	/**
	 * Metodo para modificar el mote de un pokemon por la busqueda del mismo <b> pre
	 * </b> La existencia del pokemon <br>
	 * <b> post </b> El mote es modificado <br>
	 * 
	 * @param Nombre El nombre por el que se va a buscar
	 * @param mote   El mote por el que se va a modificar
	 * @param lista  La lista de donde se va a modificar
	 * @return Un valor de verdad que indica si se modifico la informacion deseada
	 * 
	 */
	public boolean modificarMote(String Nombre, String mote, ArrayList<PokemonDTO> lista) {
		try {
			PokemonDTO bus = buscarNombre(Nombre, lista);
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
	/**
	 * Metodo para mostrar los pokemones del usuario <b> pre </b> La existencia del
	 * archivo <br>
	 * <b> post </b> Muestra los pokemones del usuario <br>
	 * 
	 * @return La informacion del pokemon
	 */
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
