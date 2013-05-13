package org.rferlo.listacompra.modelo;


/**
 * @author rferlo
 * 
 */
public class Unidad {
	
	/**
	 * El nombre largo de la unidad
	 */
	private String nombre;
	
	/**
	 * La abreviatura de la unidad 
	 */
	private String abreviatura;
	
	
	public String getAbreviatura() {
		return abreviatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
