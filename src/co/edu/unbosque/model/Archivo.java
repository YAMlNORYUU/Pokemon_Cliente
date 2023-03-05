package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Claase de archivo de tipo .dat para los candidatos

 * @author Nicolas Machado

 */
public class Archivo {

    /**
     * Atributo para la salida de informacion
     */
    private ObjectInputStream entrada;
    
    /**
     * Atributo para la entrada de informacion
     */
    private ObjectOutputStream salida;

    /**
     * El archivo de destino
     */
    private File archivo = new File("PokeIniciales/ayudadios.dat");

    /**
     * Metodo constructor
     * <b>pre</b> La existencia del archivo <br>
     * <b>post</b> Archivo inicilizado y/o creado<br>
     * @throws IOException 
     */
    public Archivo(){
        if (archivo.exists()) {
			
        }else {
        	try {
        	archivo.createNewFile();
				if (archivo.createNewFile() == false) {
				  	archivo.createNewFile();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    /**
     * Metodo que escribe en el archivo seleccionado
     * <b>pre</b> La existencia del archivo <br>
     * <b>post</b> El archivo es escrito con la informacion deseada <br>
     * @param candidato La informacion de contactos que se desea escribir
     */
    public void escribirEnArchivo(ArrayList<PokemonDTO> candidato) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream(archivo));
            salida.writeObject(candidato);
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metodo para leer el archivo selecionado
     * <b>pre</b> La existencia del archivo <br>
     * <b>post</b> El archivo leido y cargado <br>
     * @return La informacion del archivo
     */
    public ArrayList<PokemonDTO> leerArchivo() {
        ArrayList<PokemonDTO> contactos = new ArrayList<PokemonDTO>();
        if (archivo.length() != 0) {
            try {
                entrada = new ObjectInputStream(new FileInputStream(archivo));
                contactos = (ArrayList<PokemonDTO>) entrada.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
        return contactos;
    }

    /**
     * Obtiene la herramienta de entrada
     * @return the entrada
     */
    public ObjectInputStream getEntrada() {
        return entrada;
    }

    /**
     * Asigna la entrada
     * @param entrada the entrada to set
     */
    public void setEntrada(ObjectInputStream entrada) {
        this.entrada = entrada;
    }

    /**
     * Obtiene la herramienta de ssalida
     * @return the salida
     */
    public ObjectOutputStream getSalida() {
        return salida;
    }

    /**
     * Asigna la salida
     * @param salida the salida to set
     */
    public void setSalida(ObjectOutputStream salida) {
        this.salida = salida;
    }

    /**
     * Obtiene el archivo
     * @return the archivo
     */
    public File getArchivo() {
        return archivo;
    }

    /**
     * Asigna el archivo
     * @param archivo the archivo to set
     */
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

   

}
