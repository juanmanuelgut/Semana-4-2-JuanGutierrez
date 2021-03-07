package com.ucreativa.Starbucks;

public class CoffeeBuilder extends StarbucksBuilder{

	private String coffeeBuilderAtributo1;
	private String coffeeBuilderAtributo2;
	private String coffeeBuilderAtributo3;
	/**
	 * @return the coffeeBuilderAtributo1
	 */
	public String getCoffeeBuilderAtributo1() {
		return coffeeBuilderAtributo1;
	}
	/**
	 * @param coffeeBuilderAtributo1 the coffeeBuilderAtributo1 to set
	 */
	public void setCoffeeBuilderAtributo1(String coffeeBuilderAtributo1) {
		this.coffeeBuilderAtributo1 = coffeeBuilderAtributo1;
	}
	/**
	 * @return the coffeeBuilderAtributo2
	 */
	public String getCoffeeBuilderAtributo2() {
		return coffeeBuilderAtributo2;
	}
	/**
	 * @param coffeeBuilderAtributo2 the coffeeBuilderAtributo2 to set
	 */
	public void setCoffeeBuilderAtributo2(String coffeeBuilderAtributo2) {
		this.coffeeBuilderAtributo2 = coffeeBuilderAtributo2;
	}
	/**
	 * @return the coffeeBuilderAtributo3
	 */
	public String getCoffeeBuilderAtributo3() {
		return coffeeBuilderAtributo3;
	}
	/**
	 * @param coffeeBuilderAtributo3 the coffeeBuilderAtributo3 to set
	 */
	public void setCoffeeBuilderAtributo3(String coffeeBuilderAtributo3) {
		this.coffeeBuilderAtributo3 = coffeeBuilderAtributo3;
	}
	/**
	 * @param starbucksBuilderAtributo1
	 * @param starbucksBuilderAtributo2
	 * @param starbucksBuilderAtributo3
	 * @param coffeeBuilderAtributo1
	 * @param coffeeBuilderAtributo2
	 * @param coffeeBuilderAtributo3
	 */
	public CoffeeBuilder(String starbucksBuilderAtributo1, String starbucksBuilderAtributo2,
			String starbucksBuilderAtributo3, String coffeeBuilderAtributo1, String coffeeBuilderAtributo2,
			String coffeeBuilderAtributo3) {
		super(starbucksBuilderAtributo1, starbucksBuilderAtributo2, starbucksBuilderAtributo3);
		this.coffeeBuilderAtributo1 = coffeeBuilderAtributo1;
		this.coffeeBuilderAtributo2 = coffeeBuilderAtributo2;
		this.coffeeBuilderAtributo3 = coffeeBuilderAtributo3;
	}
	
	public String coffeBuilderMetodo1(String strParametro1) {
		return "metodo 1";
	}
	
	public void coffeBuilderMetodo2(String strParametro1) {
		
	}
	
	public void coffeBuilderMetodo3(String strParametro1) {
		
	}
	@Override
	public String toString() {
		return "CoffeeBuilder [coffeeBuilderAtributo1=" + coffeeBuilderAtributo1 + ", coffeeBuilderAtributo2="
				+ coffeeBuilderAtributo2 + ", coffeeBuilderAtributo3=" + coffeeBuilderAtributo3 + "]";
	}
	
	
	
}
