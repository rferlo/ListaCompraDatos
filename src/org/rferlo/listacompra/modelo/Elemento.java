package org.rferlo.listacompra.modelo;

import java.util.Vector;

/**
 * @author rferlo
 * Cada uno de los elementos posibles
 * que pueden estar en una lista
 */
public class Elemento {
	
	public static String CADENA_ELEMENTO_VACIO = "*** ELEMENTO VACIO ***";
	/**
	 * El nombre del elemento 
	 */
	private String nombre;
	/**
	 * Categorias a las que pertenece el elemento
	 */
	private Vector<Categoria> categorias;
	

	/**
	 * A�ade una categoria al elemento
	 * @param cat
	 */
	public void anadeCategoria(Categoria cat) {
		// Comprobar si el vector est� instanciado
		if(null == categorias) {
			categorias = new Vector<Categoria>();
		}
		// Si la categoria no es Null a�adirsela.
		if(null != cat) {
			categorias.add(cat);
		} 
	}
	
	/**
	 * Quita una categoria al producto
	 * @param cat	Categoria a quitar
	 */
	public void quitaCategoria(Categoria cat) {
		// Comprobar si el vector est� instanciado
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		// Si el nombre contiene algo lo a�adimos
		if(null != nombre) {
			sb.append(nombre);
		}
		// Si tiene categorias las leemos y
		// las montamos en el formato Nombre/Abrev
		if(null != categorias) {
			sb.append(" (");
			for(Categoria cat: categorias) {
				sb.append(" " + cat.getNombre() + "/" + cat.getAbreviatura());
			}
			sb.append(" )");
		}
		// Comprobamos si hay algo que devolver y 
		// si no el texto predefinido
		if(sb.toString().length() == 0) {
			return Elemento.CADENA_ELEMENTO_VACIO;
		} else {
			return sb.toString();
		}
	}
	
	
	

}
