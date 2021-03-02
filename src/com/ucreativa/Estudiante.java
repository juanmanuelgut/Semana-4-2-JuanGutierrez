/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Estudiante extends Persona {
	
	private String estudianteAtributo1;
	private String estudianteAtributo2;
	private String estudianteAtributo3;
	/**
	 * @return the estudianteAtributo1
	 */
	public String getEstudianteAtributo1() {
		return estudianteAtributo1;
	}
	/**
	 * @param estudianteAtributo1 the estudianteAtributo1 to set
	 */
	public void setEstudianteAtributo1(String estudianteAtributo1) {
		this.estudianteAtributo1 = estudianteAtributo1;
	}
	/**
	 * @return the estudianteAtributo2
	 */
	public String getEstudianteAtributo2() {
		return estudianteAtributo2;
	}
	/**
	 * @param estudianteAtributo2 the estudianteAtributo2 to set
	 */
	public void setEstudianteAtributo2(String estudianteAtributo2) {
		this.estudianteAtributo2 = estudianteAtributo2;
	}
	/**
	 * @return the estudianteAtributo3
	 */
	public String getEstudianteAtributo3() {
		return estudianteAtributo3;
	}
	/**
	 * @param estudianteAtributo3 the estudianteAtributo3 to set
	 */
	public void setEstudianteAtributo3(String estudianteAtributo3) {
		this.estudianteAtributo3 = estudianteAtributo3;
	}
	/**
	 * @param personaAtributo1
	 * @param personaAtributo2
	 * @param personaAtributo3
	 * @param estudianteAtributo1
	 * @param estudianteAtributo2
	 * @param estudianteAtributo3
	 */
	public Estudiante(String personaAtributo1, String personaAtributo2, String personaAtributo3, String estudianteAtributo1,
			String estudianteAtributo2, String estudianteAtributo3) {
		super(personaAtributo1, personaAtributo2, personaAtributo3);
		this.estudianteAtributo1 = estudianteAtributo1;
		this.estudianteAtributo2 = estudianteAtributo2;
		this.estudianteAtributo3 = estudianteAtributo3;
	}
	
	public String estudianteMetodo1() {
		
		return "Método Estudiante 1";
		
	}
	
	public String estudianteMetod21() {
		
		return "Método Estudiante 2";
		
	}
	
	public String estudianteMetodo3() {
		
		return "Método Estudiante 3";
		
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
		return "Estudiante [estudianteAtributo1=" + estudianteAtributo1 + ", estudianteAtributo2=" + estudianteAtributo2
				+ ", estudianteAtributo3=" + estudianteAtributo3 + "]";
	}
	
	
	

}
