package org.rferlo.controlador.test;

import org.rferlo.listacompra.controlador.Base;

public class pruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Arrancar el entorno
		Base.InicializaEntorno();
		System.out.println(Base.getListaUnidades());
		
		

	}

}
