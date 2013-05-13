package org.rferlo.listacompra.modelo;

import java.util.Vector;

/**
 * @author rferlo
 * Cada uno de los elementos posibles
 * que pueden estar en una lista
 */
public class Elemento {
	
	/**
	 * El nombre del elemento 
	 */
	private String nombre;
	/**
	 * Categorias a las que pertenece el elemento
	 */
	private Vector<Categoria> categorias;
	

	/**
	 * Añade una categoria al elemento
	 * @param cat
	 */
	public void anadeCategoria(Categoria cat) {
		// Comprobar si el vector está instanciado
		if(null == categorias) {
			categorias = new Vector<Categoria>();
		}
		// Si la categoria no es Null añadirsela.
		if(null != cat) {
			categorias.add(cat);
		} 
	}
	
	/**
	 * Quita una categoria al producto
	 * @param cat	Categoria a quitar
	 */
	public void quitaCategoria(Categoria cat) {
		// Comprobar si el vector está instanciado
		if(null != categorias) {
			categorias.remove(cat);
		}
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Vector<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	
	
	

}
