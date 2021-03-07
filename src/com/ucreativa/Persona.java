/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
abstract class Persona implements Actor {
	
	private String personaNombre;
	private String personaApellido;
	private String personaCasa;
	/**
	 * 
	 */
	/**
	 * @return the personaNombre
	 */
	public String getPersonaNombre() {
		return personaNombre;
	}
	/**
	 * @param personaNombre the personaNombre to set
	 */
	public void setPersonaNombre(String personaAtributo1) {
		this.personaNombre = personaAtributo1;
	}
	/**
	 * @return the personaApellido
	 */
	public String getPersonaApellido() {
		return personaApellido;
	}
	/**
	 * @param personaApellido the personaApellido to set
	 */
	public void setPersonaApellido(String personaAtributo2) {
		this.personaApellido = personaAtributo2;
	}
	/**
	 * @return the personaCasa
	 */
	public String getPersonaCasa() {
		return personaCasa;
	}
	/**
	 * @param personaCasa the personaCasa to set
	 */
	public void setPersonaCasa(String personaAtributo3) {
		this.personaCasa = personaAtributo3;
	}
	/**
	 * @param personaNombre
	 * @param personaApellido
	 * @param personaCasa
	 */
	public Persona(String personaAtributo1, String personaAtributo2, String personaAtributo3) {
		super();
		this.personaNombre = personaAtributo1;
		this.personaApellido = personaAtributo2;
		this.personaCasa = personaAtributo3;
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
		return "Persona [personaNombre=" + personaNombre + ", personaApellido=" + personaApellido
				+ ", personaCasa=" + personaCasa + "]";
	}
	
	
	
	
}
