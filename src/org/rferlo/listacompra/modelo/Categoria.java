package org.rferlo.listacompra.modelo;

/**
 * @author rferlo
 * El interface para las categorias de todo tipo
 */
public interface Categoria {
	
	
	/**
	 * @return Nombre de la categoria
	 */
	public String getNombre();
	/**
	 * @return Abreviatura de la categoria
	 */
	public String getAbreviatura();
	/**
	 * @param Nombre para la categoria
	 */
	public void setNombre(String nombre);
	/**
	 * @param abreviatura de la categoria
	 */
	public void setAbreviatura(String abreviatura);
	/**
	 * @param cadena a comparar
	 * @return true si el nombre o la abreviatura comienza por cadena
	 */
	public boolean empiezapor(String cadena);
	/**
	 * @param cadena a comparar
	 * @return true si el nombre o la abreviatura contienen la cadena
	 */
	public boolean contiene(String cadena);
	

}
