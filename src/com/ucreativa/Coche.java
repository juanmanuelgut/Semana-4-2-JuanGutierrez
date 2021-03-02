/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Coche extends Vehiculo{

	private String cocheAtributo1;
	private String cocheAtributo2;
	private String cocheAtributo3;
	/**
	 * @return the cocheAtributo1
	 */
	public String getCocheAtributo1() {
		return cocheAtributo1;
	}
	/**
	 * @param cocheAtributo1 the cocheAtributo1 to set
	 */
	public void setCocheAtributo1(String cocheAtributo1) {
		this.cocheAtributo1 = cocheAtributo1;
	}
	/**
	 * @return the cocheAtributo2
	 */
	public String getCocheAtributo2() {
		return cocheAtributo2;
	}
	/**
	 * @param cocheAtributo2 the cocheAtributo2 to set
	 */
	public void setCocheAtributo2(String cocheAtributo2) {
		this.cocheAtributo2 = cocheAtributo2;
	}
	/**
	 * @return the cocheAtributo3
	 */
	public String getCocheAtributo3() {
		return cocheAtributo3;
	}
	/**
	 * @param cocheAtributo3 the cocheAtributo3 to set
	 */
	public void setCocheAtributo3(String cocheAtributo3) {
		this.cocheAtributo3 = cocheAtributo3;
	}
	/**
	 * @param vehiculoatributo1
	 * @param vehiculoatributo2
	 * @param vehiculoatributo3
	 * @param cocheAtributo1
	 * @param cocheAtributo2
	 * @param cocheAtributo3
	 */
	public Coche(String vehiculoatributo1, String vehiculoatributo2, String vehiculoatributo3, String cocheAtributo1,
			String cocheAtributo2, String cocheAtributo3) {
		super(vehiculoatributo1, vehiculoatributo2, vehiculoatributo3);
		this.cocheAtributo1 = cocheAtributo1;
		this.cocheAtributo2 = cocheAtributo2;
		this.cocheAtributo3 = cocheAtributo3;
	}
	
	public void cocheMetodo1() {
		
	}
	
	public void cocheMetodo2() {
		
	}
	
	public void cocheMetodo3() {
		
	}

}
