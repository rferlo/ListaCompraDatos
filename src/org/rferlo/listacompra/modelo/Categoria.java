package org.rferlo.listacompra.modelo;

/**
 * @author rferlo
 * Categor�a a la que pertenecen los elementos
 * Nota: Cada elemento puede pertenecer a N categor�as
 */
public class Categoria {

	/**
	 * Nombre de la categor�a 
	 */
	private String nombre;
	
	/**
	 * Abreviatura de la categor�a 
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
