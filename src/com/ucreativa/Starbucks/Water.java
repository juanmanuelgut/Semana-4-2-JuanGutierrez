/**
 * 
 */
package com.ucreativa.Starbucks;

/**
 * @author juangutierrez
 *
 */
public class Water {

	private String waterAtributo1;
	private String waterAtributo2;
	private String waterAtributo3;

	//getters y setters
	/**
	 * @return the waterAtributo1
	 */
	public String getWaterAtributo1() {
		return waterAtributo1;
	}

	/**
	 * @param waterAtributo1 the waterAtributo1 to set
	 */
	public void setWaterAtributo1(String waterAtributo1) {
		this.waterAtributo1 = waterAtributo1;
	}

	/**
	 * @return the waterAtributo2
	 */
	public String getWaterAtributo2() {
		return waterAtributo2;
	}

	/**
	 * @param waterAtributo2 the waterAtributo2 to set
	 */
	public void setWaterAtributo2(String waterAtributo2) {
		this.waterAtributo2 = waterAtributo2;
	}

	/**
	 * @return the waterAtributo3
	 */
	public String getWaterAtributo3() {
		return waterAtributo3;
	}

	/**
	 * @param waterAtributo3 the waterAtributo3 to set
	 */
	public void setWaterAtributo3(String waterAtributo3) {
		this.waterAtributo3 = waterAtributo3;
	}

	
	//Constructor
	/**
	 * @param waterAtributo1
	 * @param waterAtributo2
	 * @param waterAtributo3
	 */
	public Water(String waterAtributo1, String waterAtributo2, String waterAtributo3) {
		super();
		this.waterAtributo1 = waterAtributo1;
		this.waterAtributo2 = waterAtributo2;
		this.waterAtributo3 = waterAtributo3;
	}
	
	
	
	public String metodoWater1() {
		
		return "Método Water 1";
		
	}
	
	public String metodoWater2() {
		
		return "Método Water 2";
		
	}

	public String metodoWater3() {
	
		return "Método Water 3";
	
	}

	@Override
	public String toString() {
		return "Water [waterAtributo1=" + waterAtributo1 + ", waterAtributo2=" + waterAtributo2 + ", waterAtributo3="
				+ waterAtributo3 + "]";
	}

	
	
}
