/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Bicicleta extends Vehiculo{

	private String bicicletaMarco;
	private String bicicletaPedales;
	private String bicicletaPlatos;
	/**
	 * @return the bicicletaMarco
	 */
	public String getBicicletaMarco() {
		return bicicletaMarco;
	}
	/**
	 * @param bicicletaMarco the bicicletaMarco to set
	 */
	public void setBicicletaMarco(String bicicletaAtributo1) {
		this.bicicletaMarco = bicicletaAtributo1;
	}
	/**
	 * @return the bicicletaPedales
	 */
	public String getBicicletaPedales() {
		return bicicletaPedales;
	}
	/**
	 * @param bicicletaPedales the bicicletaPedales to set
	 */
	public void setBicicletaPedales(String bicicletaPedales) {
		this.bicicletaPedales = bicicletaPedales;
	}
	/**
	 * @return the bicicletaAtributo3
	 */
	public String getBicicletaPlatos() {
		return bicicletaPlatos;
	}
	/**
	 * @param bicicletaAtributo3 the bicicletaAtributo3 to set
	 */
	public void setBicicletaPlatos(String bicicletaPlatos) {
		this.bicicletaPlatos = bicicletaPlatos;
	}
	/**
	 * @param vehiculoatributo1
	 * @param vehiculoatributo2
	 * @param vehiculoatributo3
	 * @param bicicletaMarco
	 * @param bicicletaPedales
	 * @param bicicletaAtributo3
	 */
	public Bicicleta(String vehiculoatributo1, String vehiculoatributo2, String vehiculoatributo3, String bicicletaAtributo1,
			String bicicletaAtributo2, String bicicletaAtributo3) {
		super(vehiculoatributo1, vehiculoatributo2, vehiculoatributo3);
		this.bicicletaMarco = bicicletaAtributo1;
		this.bicicletaPedales = bicicletaAtributo2;
		this.bicicletaPlatos = bicicletaAtributo3;
	}
	
	public void bicicletaMetodo1() {
		
	}
	
	public String bicicletaMetodo2() {
		
		return "A Pedalear!";
		
	}
	
	public void bicicletaMetodo3() {
		
	}
	@Override
	public String toString() {
		return "Bicicleta [bicicletaMarco=" + bicicletaMarco + ", bicicletaPedales=" + bicicletaPedales
				+ ", bicicletaPlatos=" + bicicletaPlatos + "]";
	}	

}
