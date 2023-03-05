package co.edu.unbosque.model;

public class PokemonDTO {
	private int id;
	private String nombre;
	private int id_general;
	private String tipo;
	private String ps;
	private String ataque;
	private String defensa;
	private String ataque_especial;
	private String defensa_especial;
	private String velocidad;
	private String mote;
	private String movimientos;
	private int nivel;

	public PokemonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PokemonDTO(int id, String nombre, int id_general, String tipo, String ps, String ataque, String defensa,
			String ataque_especial, String defensa_especial, String velocidad, String mote, String movimientos,
			int nivel) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.id_general = id_general;
		this.tipo = tipo;
		this.ps = ps;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataque_especial = ataque_especial;
		this.defensa_especial = defensa_especial;
		this.velocidad = velocidad;
		this.mote = mote;
		this.movimientos = movimientos;
		this.nivel = nivel;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the id_general
	 */
	public int getId_general() {
		return id_general;
	}

	/**
	 * @param id_general the id_general to set
	 */
	public void setId_general(int id_general) {
		this.id_general = id_general;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the ps
	 */
	public String getPs() {
		return ps;
	}

	/**
	 * @param ps the ps to set
	 */
	public void setPs(String ps) {
		this.ps = ps;
	}

	/**
	 * @return the ataque
	 */
	public String getAtaque() {
		return ataque;
	}

	/**
	 * @param ataque the ataque to set
	 */
	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}

	/**
	 * @return the defensa
	 */
	public String getDefensa() {
		return defensa;
	}

	/**
	 * @param defensa the defensa to set
	 */
	public void setDefensa(String defensa) {
		this.defensa = defensa;
	}

	/**
	 * @return the ataque_especial
	 */
	public String getAtaque_especial() {
		return ataque_especial;
	}

	/**
	 * @param ataque_especial the ataque_especial to set
	 */
	public void setAtaque_especial(String ataque_especial) {
		this.ataque_especial = ataque_especial;
	}

	/**
	 * @return the defensa_especial
	 */
	public String getDefensa_especial() {
		return defensa_especial;
	}

	/**
	 * @param defensa_especial the defensa_especial to set
	 */
	public void setDefensa_especial(String defensa_especial) {
		this.defensa_especial = defensa_especial;
	}

	/**
	 * @return the velocidad
	 */
	public String getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return the mote
	 */
	public String getMote() {
		return mote;
	}

	/**
	 * @param mote the mote to set
	 */
	public void setMote(String mote) {
		this.mote = mote;
	}

	/**
	 * @return the movimientos
	 */
	public String getMovimientos() {
		return movimientos;
	}

	/**
	 * @param movimientos the movimientos to set
	 */
	public void setMovimientos(String movimientos) {
		this.movimientos = movimientos;
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	}

