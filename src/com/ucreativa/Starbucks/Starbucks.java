package com.ucreativa.Starbucks;

public class Starbucks {
	
	private String size;
	private String drink;
	private String atributo3;

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the drink
	 */
	public String getDrink() {
		return drink;
	}

	/**
	 * @param drink the drink to set
	 */
	public void setDrink(String drink) {
		this.drink = drink;
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
	 * @param size
	 * @param drink
	 * @param atributo3
	 */
	public Starbucks(String size, String drink, String atributo3) {
		super();
		this.size = size;
		this.drink = drink;
		this.atributo3 = atributo3;
	}

	public void metodoStarbucks1(String parametro1) {
			
	}
	
	public void metodoStarbucks2(String parametro1) {
			
	}
	
	public String metodoStarbucks3(String parametro1) {
		
		return "Metodo 3";
			
	}

	@Override
	public String toString() {
		return "Starbucks [size=" + size + ", drink=" + drink + ", atributo3=" + atributo3 + "]";
	}


}
