/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Coche extends Vehiculo{

	private String cocheMarca;
	private String cocheTransmicion;
	private String cocheMarcaAceite;
	/**
	 * @return the cocheMarca
	 */
	public String getCocheMarca() {
		return cocheMarca;
	}
	/**
	 * @param cocheMarca the cocheMarca to set
	 */
	public void setCocheMarca(String cocheAtributo1) {
		this.cocheMarca = cocheAtributo1;
	}
	/**
	 * @return the cocheTransmicion
	 */
	public String getCocheTransmicion() {
		return cocheTransmicion;
	}
	/**
	 * @param cocheTransmicion the cocheTransmicion to set
	 */
	public void setCocheTransmicion(String cocheAtributo2) {
		this.cocheTransmicion = cocheAtributo2;
	}
	/**
	 * @return the cocheMarcaAceite
	 */
	public String getCocheMarcaAceite() {
		return cocheMarcaAceite;
	}
	/**
	 * @param cocheMarcaAceite the cocheMarcaAceite to set
	 */
	public void setCocheMarcaAceite(String cocheAtributo3) {
		this.cocheMarcaAceite = cocheAtributo3;
	}
	/**
	 * @param vehiculoatributo1
	 * @param vehiculoatributo2
	 * @param vehiculoatributo3
	 * @param cocheMarca
	 * @param cocheTransmicion
	 * @param cocheMarcaAceite
	 */
	public Coche(String vehiculoatributo1, String vehiculoatributo2, String vehiculoatributo3, String cocheAtributo1,
			String cocheAtributo2, String cocheAtributo3) {
		super(vehiculoatributo1, vehiculoatributo2, vehiculoatributo3);
		this.cocheMarca = cocheAtributo1;
		this.cocheTransmicion = cocheAtributo2;
		this.cocheMarcaAceite = cocheAtributo3;
	}
	
	public String cocheMetodo1() {
		
		return "Vamonos!!!!!";
		
	}
	
	public void cocheMetodo2() {
		
	}
	
	public void cocheMetodo3() {
		
	}
	
	@Override
	public String toString() {
		return "Coche [cocheMarca=" + cocheMarca + ", cocheTransmicion=" + cocheTransmicion + ", cocheMarcaAceite="
				+ cocheMarcaAceite + "]";
	}
	
	

}
