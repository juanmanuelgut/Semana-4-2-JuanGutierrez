package com.ucreativa.Starbucks;

public class TeaBuilder extends StarbucksBuilder{

	private String teaBuilderAtributo1;
	private String teaBuilderAtributo2;
	private String teaBuilderAtributo3;
	/**
	 * @return the teaBuilderAtributo1
	 */
	public String getTeaBuilderAtributo1() {
		return teaBuilderAtributo1;
	}
	/**
	 * @param teaBuilderAtributo1 the teaBuilderAtributo1 to set
	 */
	public void setTeaBuilderAtributo1(String teaBuilderAtributo1) {
		this.teaBuilderAtributo1 = teaBuilderAtributo1;
	}
	/**
	 * @return the teaBuilderAtributo2
	 */
	public String getTeaBuilderAtributo2() {
		return teaBuilderAtributo2;
	}
	/**
	 * @param teaBuilderAtributo2 the teaBuilderAtributo2 to set
	 */
	public void setTeaBuilderAtributo2(String teaBuilderAtributo2) {
		this.teaBuilderAtributo2 = teaBuilderAtributo2;
	}
	/**
	 * @return the teaBuilderAtributo3
	 */
	public String getTeaBuilderAtributo3() {
		return teaBuilderAtributo3;
	}
	/**
	 * @param teaBuilderAtributo3 the teaBuilderAtributo3 to set
	 */
	public void setTeaBuilderAtributo3(String teaBuilderAtributo3) {
		this.teaBuilderAtributo3 = teaBuilderAtributo3;
	}
	/**
	 * @param starbucksBuilderAtributo1
	 * @param starbucksBuilderAtributo2
	 * @param starbucksBuilderAtributo3
	 * @param teaBuilderAtributo1
	 * @param teaBuilderAtributo2
	 * @param teaBuilderAtributo3
	 */
	public TeaBuilder(String starbucksBuilderAtributo1, String starbucksBuilderAtributo2,
			String starbucksBuilderAtributo3, String teaBuilderAtributo1, String teaBuilderAtributo2,
			String teaBuilderAtributo3) {
		super(starbucksBuilderAtributo1, starbucksBuilderAtributo2, starbucksBuilderAtributo3);
		this.teaBuilderAtributo1 = teaBuilderAtributo1;
		this.teaBuilderAtributo2 = teaBuilderAtributo2;
		this.teaBuilderAtributo3 = teaBuilderAtributo3;
	}
	
	public String teaBuilderMetodo1(String strParametro1) {
		
		return "metodo 1";
		
	}
	
	public void teaBuilderMetodo2(String strParametro1) {
		
	}
	
	public void teaBuilderMetodo3(String strParametro1) {
		
	}
	@Override
	public String toString() {
		return "TeaBuilder [teaBuilderAtributo1=" + teaBuilderAtributo1 + ", teaBuilderAtributo2="
				+ teaBuilderAtributo2 + ", teaBuilderAtributo3=" + teaBuilderAtributo3 + "]";
	}

}
