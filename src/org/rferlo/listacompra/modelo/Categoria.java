package org.rferlo.listacompra.modelo;

/**
 * @author rferlo
 * Categoría a la que pertenecen los elementos
 * Nota: Cada elemento puede pertenecer a N categorías
 */
public class Categoria {

	/**
	 * Nombre de la categoría 
	 */
	private String nombre;
	
	/**
	 * Abreviatura de la categoría 
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
