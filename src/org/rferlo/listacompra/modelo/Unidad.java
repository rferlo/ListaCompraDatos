package org.rferlo.listacompra.modelo;


/**
 * @author rferlo
 * Unidades para asignar a los elementos
 */
public class Unidad {
	
	/**
	 * El nombre largo de la unidad
	 */
	private String nombre;
	/**
	 * El nombre en plurar de la unidad
	 */
	private String plural;
	/**
	 * La abreviatura de la unidad 
	 */
	private String abreviatura;
	
	
	/************************************
	* CONSTRUCTORES                     *
	*************************************/
	public Unidad(String nombre, String plural, String abreviatura) {
		this.nombre = nombre;
		this.plural = plural;
		this.abreviatura = abreviatura;
	}
	
	/************************************
	* GETTERS Y SETTERS                 *
	*************************************/
	
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
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if(null != nombre) 
			sb.append(nombre);
		if(null != plural)
			sb.append("/" + plural);
		if(null != abreviatura)
			sb.append(" (" + abreviatura + ")");

		return sb.toString();
	}
	

}
