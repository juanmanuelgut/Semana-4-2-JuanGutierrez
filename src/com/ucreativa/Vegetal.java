/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Vegetal {
	
	private String vegetalAtributo1;
	private String vegetalAtributo2;
	private String vegetalAtributo3;
	/**
	 * @return the vegetalAtributo1
	 */
	public String getVegetalAtributo1() {
		return vegetalAtributo1;
	}
	/**
	 * @param vegetalAtributo1 the vegetalAtributo1 to set
	 */
	public void setVegetalAtributo1(String vegetalAtributo1) {
		this.vegetalAtributo1 = vegetalAtributo1;
	}
	/**
	 * @return the vegetalAtributo2
	 */
	public String getVegetalAtributo2() {
		return vegetalAtributo2;
	}
	/**
	 * @param vegetalAtributo2 the vegetalAtributo2 to set
	 */
	public void setVegetalAtributo2(String vegetalAtributo2) {
		this.vegetalAtributo2 = vegetalAtributo2;
	}
	/**
	 * @return the vegetalAtributo3
	 */
	public String getVegetalAtributo3() {
		return vegetalAtributo3;
	}
	/**
	 * @param vegetalAtributo3 the vegetalAtributo3 to set
	 */
	public void setVegetalAtributo3(String vegetalAtributo3) {
		this.vegetalAtributo3 = vegetalAtributo3;
	}
	/**
	 * 
	 */
	public Vegetal(String vegetalAtributo1, String vegetalAtributo2, String vegetalAtributo3) {
		super();
		this.vegetalAtributo1 = vegetalAtributo1;
		this.vegetalAtributo2 = vegetalAtributo2;
		this.vegetalAtributo3 = vegetalAtributo3;
	}
	
	public String vegetalMetodo1(int parametro1) {
		return "Método 1";
	}
	
	/**
	 * @param vegetalAtributo1
	 * @param vegetalAtributo2
	 * @param vegetalAtributo3
	 */

	public String vegetalMetodo2(int parametro1) {
		return "Método 2";
	}
	
	public String vegetalMetodo3(int parametro1) {
		return "Método 3";
	}
	
	
	@Override
	public String toString() {
		return "Vegetal [vegetalAtributo1=" + vegetalAtributo1 + ", vegetalAtributo2=" + vegetalAtributo2
				+ ", vegetalAtributo3=" + vegetalAtributo3 + "]";
	}
	
	

}
