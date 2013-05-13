package org.rferlo.listacompra.modelo;

/**
 * @author rferlo
 * Categorķa a la que pertenecen los elementos
 * Nota: Cada elemento puede pertenecer a N categorķas
 */
public class CategoriaElementos implements Categoria{

	/**
	 * Nombre de la categorķa 
	 */
	private String nombre;
	
	/**
	 * Abreviatura de la categorķa 
	 */
	private String abreviatura;

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getAbreviatura() {
		return abreviatura;
	}

	@Override
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	@Override
	public boolean empiezapor(String cadena) {
		if(null != nombre) {
			if(nombre.startsWith(cadena)) {
				return true;
			} else {
				if(null != abreviatura) {
					return abreviatura.startsWith(cadena);
				}
			}
		}
		return false;
	}

	@Override
	public boolean contiene(String cadena) {
		if(null != nombre) {
			if(nombre.contains(cadena)) {
				return true;
			} else {
				if(null != abreviatura) {
					return abreviatura.contains(cadena);
				}
			}
		}
		return false;
	}

	
	
	
}
