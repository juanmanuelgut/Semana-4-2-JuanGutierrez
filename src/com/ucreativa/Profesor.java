/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Profesor extends Persona {
	
	private String profesorAtributo1;
	private String profesorAtributo2;
	private String profesorAtributo3;
	/**
	 * @return the profesorAtributo1
	 */
	public String getProfesorAtributo1() {
		return profesorAtributo1;
	}
	/**
	 * @param profesorAtributo1 the profesorAtributo1 to set
	 */
	public void setProfesorAtributo1(String profesorAtributo1) {
		this.profesorAtributo1 = profesorAtributo1;
	}
	/**
	 * @return the profesorAtributo2
	 */
	public String getProfesorAtributo2() {
		return profesorAtributo2;
	}
	/**
	 * @param profesorAtributo2 the profesorAtributo2 to set
	 */
	public void setProfesorAtributo2(String profesorAtributo2) {
		this.profesorAtributo2 = profesorAtributo2;
	}
	/**
	 * @return the profesorAtributo3
	 */
	public String getProfesorAtributo3() {
		return profesorAtributo3;
	}
	/**
	 * @param profesorAtributo3 the profesorAtributo3 to set
	 */
	public void setProfesorAtributo3(String profesorAtributo3) {
		this.profesorAtributo3 = profesorAtributo3;
	}
	/**
	 * @param personaAtributo1
	 * @param personaAtributo2
	 * @param personaAtributo3
	 * @param profesorAtributo1
	 * @param profesorAtributo2
	 * @param profesorAtributo3
	 */
	public Profesor(String personaAtributo1, String personaAtributo2, String personaAtributo3, String profesorAtributo1,
			String profesorAtributo2, String profesorAtributo3) {
		super(personaAtributo1, personaAtributo2, personaAtributo3);
		this.profesorAtributo1 = profesorAtributo1;
		this.profesorAtributo2 = profesorAtributo2;
		this.profesorAtributo3 = profesorAtributo3;
	}
	
	public String profesorMetodo1() {
		
		return "Método Profesor 1";
		
	}
	
	public String profesorMetod21() {
		
		return "Método Profesor 2";
		
	}
	
	public String profesorMetodo3() {
		
		return "Método Profesor 3";
		
	}
	@Override
	String personaMetodo1() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	String personaMetodo2() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	String personaMetodo3() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Profesor [profesorAtributo1=" + profesorAtributo1 + ", profesorAtributo2=" + profesorAtributo2
				+ ", profesorAtributo3=" + profesorAtributo3 + "]";
	}
	
	
	

}
