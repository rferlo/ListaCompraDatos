package org.rferlo.listacompra.modelo;

/**
 * @author rferlo
 * Categorķa a la que pertenecen los elementos
 * Nota: Cada elemento puede pertenecer a N categorķas
 */
public class Categoria {

	/**
	 * Nombre de la categorķa 
	 */
	private String nombre;
	
	/**
	 * Abreviatura de la categorķa 
	 */
	private String abreviatura;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	
	
	
	
}
