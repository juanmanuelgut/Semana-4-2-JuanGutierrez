/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
abstract class Persona implements Actor {
	
	public String personaAtributo1;
	public String personaAtributo2;
	public String personaAtributo3;
	/**
	 * 
	 */
	/**
	 * @return the personaAtributo1
	 */
	public String getPersonaAtributo1() {
		return personaAtributo1;
	}
	/**
	 * @param personaAtributo1 the personaAtributo1 to set
	 */
	public void setPersonaAtributo1(String personaAtributo1) {
		this.personaAtributo1 = personaAtributo1;
	}
	/**
	 * @return the personaAtributo2
	 */
	public String getPersonaAtributo2() {
		return personaAtributo2;
	}
	/**
	 * @param personaAtributo2 the personaAtributo2 to set
	 */
	public void setPersonaAtributo2(String personaAtributo2) {
		this.personaAtributo2 = personaAtributo2;
	}
	/**
	 * @return the personaAtributo3
	 */
	public String getPersonaAtributo3() {
		return personaAtributo3;
	}
	/**
	 * @param personaAtributo3 the personaAtributo3 to set
	 */
	public void setPersonaAtributo3(String personaAtributo3) {
		this.personaAtributo3 = personaAtributo3;
	}
	/**
	 * @param personaAtributo1
	 * @param personaAtributo2
	 * @param personaAtributo3
	 */
	public Persona(String personaAtributo1, String personaAtributo2, String personaAtributo3) {
		super();
		this.personaAtributo1 = personaAtributo1;
		this.personaAtributo2 = personaAtributo2;
		this.personaAtributo3 = personaAtributo3;
	}
	
	abstract String personaMetodo1();

	abstract String personaMetodo2();
	
	abstract String personaMetodo3() ;
	
	@Override
	public void salirAEscena() {
		// TODO Auto-generated method stub
		System.out.println("Tada!!!");
	}
	@Override
	public void paticiparEnObra() {
		// TODO Auto-generated method stub
		System.out.println("Wilson!!!!!");
	}
	@Override
	public void actorMetodo1(String parametro1, String parametro2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Persona [personaAtributo1=" + personaAtributo1 + ", personaAtributo2=" + personaAtributo2
				+ ", personaAtributo3=" + personaAtributo3 + "]";
	}
	
	
	
	
}
