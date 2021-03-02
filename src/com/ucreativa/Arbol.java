/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */

public class Arbol extends Vegetal implements Actor{
	private int numeroDeHojas;
	private String nombreArbol;
	private String atributo3;

	/**
	 * @return the numeroDeHojas
	 */
	public int getNumeroDeHojas() {
		return numeroDeHojas;
	}

	/**
	 * @param numeroDeHojas the numeroDeHojas to set
	 */
	public void setNumeroDeHojas(int numeroDeHojas) {
		this.numeroDeHojas = numeroDeHojas;
	}

	/**
	 * @return the nombreArbol
	 */
	public String getNombreArbol() {
		return nombreArbol;
	}

	/**
	 * @param nombreArbol the nombreArbol to set
	 */
	public void setNombreArbol(String nombreArbol) {
		this.nombreArbol = nombreArbol;
	}

	/**
	 * @return the atributo3
	 */
	public String getAtributo3() {
		return atributo3;
	}

	/**
	 * @param atributo3 the atributo3 to set
	 */
	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}
	
	

	/**
	 * @param vegetalAtributo1
	 * @param vegetalAtributo2
	 * @param vegetalAtributo3
	 * @param numeroDeHojas
	 * @param nombreArbol
	 * @param atributo3
	 */
	public Arbol(String vegetalAtributo1, String vegetalAtributo2, String vegetalAtributo3, int numeroDeHojas,
			String nombreArbol, String atributo3) {
		super(vegetalAtributo1, vegetalAtributo2, vegetalAtributo3);
		this.numeroDeHojas = numeroDeHojas;
		this.nombreArbol = nombreArbol;
		this.atributo3 = atributo3;
	}
	
	/**
	 * @return
	 */
	public String arbolMetodo1(){
		return "Árbol Método 1";
	}
	
	/**
	 * @return
	 */
	public String arbolMetodo2(){
		return "Árbol Método 2";
	}
	
	/**
	 * @return
	 */
	public String arbolMetodo3(){
		return "Árbol Método 3";
	}

	/**
	 *
	 */
	@Override
	public void salirAEscena() {
		System.out.println("Estoy en escena!!");
	}

	/**
	 *
	 */
	@Override
	public void paticiparEnObra() {
		System.out.println("Ser o no ser esa es la cuestión");
	}
	
	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "Arbol [numeroDeHojas=" + numeroDeHojas + ", nombreArbol=" + nombreArbol + ", atributo3=" + atributo3
				+ "]";
	}

	@Override
	public void actorMetodo1(String parametro1, String parametro2) {
		// TODO Auto-generated method stub
		
	}

	

	
	

}
