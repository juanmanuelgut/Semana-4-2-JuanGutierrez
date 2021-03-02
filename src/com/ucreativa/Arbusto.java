/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Arbusto extends Vegetal implements Actor{
	
	private String arbustoAtributo1;
	private String arbustoAtributo2;
	private String arbustoAtributo3;
	/**
	 * 
	 */
	/**
	 * @return the arbustoAtributo1
	 */
	public String getArbustoAtributo1() {
		return arbustoAtributo1;
	}
	/**
	 * @param arbustoAtributo1 the arbustoAtributo1 to set
	 */
	public void setArbustoAtributo1(String arbustoAtributo1) {
		this.arbustoAtributo1 = arbustoAtributo1;
	}
	/**
	 * @return the arbustoAtributo2
	 */
	public String getArbustoAtributo2() {
		return arbustoAtributo2;
	}
	/**
	 * @param arbustoAtributo2 the arbustoAtributo2 to set
	 */
	public void setArbustoAtributo2(String arbustoAtributo2) {
		this.arbustoAtributo2 = arbustoAtributo2;
	}
	/**
	 * @return the arbustoAtributo3
	 */
	public String getArbustoAtributo3() {
		return arbustoAtributo3;
	}
	/**
	 * @param arbustoAtributo3 the arbustoAtributo3 to set
	 */
	public void setArbustoAtributo3(String arbustoAtributo3) {
		this.arbustoAtributo3 = arbustoAtributo3;
	}
	/**
	 * @param vegetalAtributo1
	 * @param vegetalAtributo2
	 * @param vegetalAtributo3
	 * @param arbustoAtributo1
	 * @param arbustoAtributo2
	 * @param arbustoAtributo3
	 */
	public Arbusto(String vegetalAtributo1, String vegetalAtributo2, String vegetalAtributo3, String arbustoAtributo1,
			String arbustoAtributo2, String arbustoAtributo3) {
		super(vegetalAtributo1, vegetalAtributo2, vegetalAtributo3);
		this.arbustoAtributo1 = arbustoAtributo1;
		this.arbustoAtributo2 = arbustoAtributo2;
		this.arbustoAtributo3 = arbustoAtributo3;
	}
	
	/**
	 * @return
	 */
	public String arbustoMetodo1(){
		return "Arbusto Método 1";
	}
	
	/**
	 * @return
	 */
	public String arbustoMetodo2(){
		return "Arbusto Método 2";
	}
	
	/**
	 * @return
	 */
	public String arbustoMetodo3(){
		return "Arbusto Método 3";
	}
	@Override
	public void salirAEscena() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paticiparEnObra() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actorMetodo1(String parametro1, String parametro2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Arbusto [arbustoAtributo1=" + arbustoAtributo1 + ", arbustoAtributo2=" + arbustoAtributo2
				+ ", arbustoAtributo3=" + arbustoAtributo3 + "]";
	}
	
}
