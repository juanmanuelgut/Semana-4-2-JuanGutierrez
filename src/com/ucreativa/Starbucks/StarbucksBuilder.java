package com.ucreativa.Starbucks;

public class StarbucksBuilder {
	
	private String starbucksBuilderAtributo1;
	private String starbucksBuilderAtributo2;
	private String starbucksBuilderAtributo3;
	
	/**
	 * @return the starbucksBuilderAtributo1
	 */
	public String getStarbucksBuilderAtributo1() {
		return starbucksBuilderAtributo1;
	}

	/**
	 * @param starbucksBuilderAtributo1 the starbucksBuilderAtributo1 to set
	 */
	public void setStarbucksBuilderAtributo1(String starbucksBuilderAtributo1) {
		this.starbucksBuilderAtributo1 = starbucksBuilderAtributo1;
	}

	/**
	 * @return the starbucksBuilderAtributo2
	 */
	public String getStarbucksBuilderAtributo2() {
		return starbucksBuilderAtributo2;
	}

	/**
	 * @param starbucksBuilderAtributo2 the starbucksBuilderAtributo2 to set
	 */
	public void setStarbucksBuilderAtributo2(String starbucksBuilderAtributo2) {
		this.starbucksBuilderAtributo2 = starbucksBuilderAtributo2;
	}

	/**
	 * @return the starbucksBuilderAtributo3
	 */
	public String getStarbucksBuilderAtributo3() {
		return starbucksBuilderAtributo3;
	}

	/**
	 * @param starbucksBuilderAtributo3 the starbucksBuilderAtributo3 to set
	 */
	public void setStarbucksBuilderAtributo3(String starbucksBuilderAtributo3) {
		this.starbucksBuilderAtributo3 = starbucksBuilderAtributo3;
	}

	/**
	 * @param starbucksBuilderAtributo1
	 * @param starbucksBuilderAtributo2
	 * @param starbucksBuilderAtributo3
	 */
	public StarbucksBuilder(String starbucksBuilderAtributo1, String starbucksBuilderAtributo2,
			String starbucksBuilderAtributo3) {
		super();
		this.starbucksBuilderAtributo1 = starbucksBuilderAtributo1;
		this.starbucksBuilderAtributo2 = starbucksBuilderAtributo2;
		this.starbucksBuilderAtributo3 = starbucksBuilderAtributo3;
	}
	
	public String starbucksBuilderMetodo1() {
		return "Metodo 1 StarbucksBuilder";
	}
	
	public String starbucksBuilderMetodo2() {
		return "Metodo 2 StarbucksBuilder";
	}
	
	public String starbucksBuilderMetodo3() {
		return "Metodo 3 StarbucksBuilder";
	}
	
	@Override
	public String toString() {
		return "StarbucksBuilder [starbucksBuilderAtributo1=" + starbucksBuilderAtributo1
				+ ", starbucksBuilderAtributo2=" + starbucksBuilderAtributo2 + ", starbucksBuilderAtributo3="
				+ starbucksBuilderAtributo3 + "]";
	}

	

}
