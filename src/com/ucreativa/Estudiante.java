/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Estudiante extends Persona {
	
	private String estudianteMentor;
	private String estudianteVarita;
	private String estudianteNivel;
	/**
	 * @return the estudianteMentor
	 */
	public String getEstudianteMentor() {
		return estudianteMentor;
	}
	/**
	 * @param estudianteMentor the estudianteMentor to set
	 */
	public void setEstudianteMentor(String estudianteAtributo1) {
		this.estudianteMentor = estudianteAtributo1;
	}
	/**
	 * @return the estudianteVarita
	 */
	public String getEstudianteVarita() {
		return estudianteVarita;
	}
	/**
	 * @param estudianteVarita the estudianteVarita to set
	 */
	public void setEstudianteVarita(String estudianteAtributo2) {
		this.estudianteVarita = estudianteAtributo2;
	}
	/**
	 * @return the estudianteNivel
	 */
	public String getEstudianteNivel() {
		return estudianteNivel;
	}
	/**
	 * @param estudianteNivel the estudianteNivel to set
	 */
	public void setEstudianteNivel(String estudianteAtributo3) {
		this.estudianteNivel = estudianteAtributo3;
	}
	/**
	 * @param personaNombre
	 * @param personaApellido
	 * @param personaCasa
	 * @param estudianteMentor
	 * @param estudianteVarita
	 * @param estudianteNivel
	 */
	public Estudiante(String personaAtributo1, String personaAtributo2, String personaAtributo3, String estudianteAtributo1,
			String estudianteAtributo2, String estudianteAtributo3) {
		super(personaAtributo1, personaAtributo2, personaAtributo3);
		this.estudianteMentor = estudianteAtributo1;
		this.estudianteVarita = estudianteAtributo2;
		this.estudianteNivel = estudianteAtributo3;
	}
	
	public String estudianteMetodo1() {
		
		return "Alohomora";
		
	}
	
	public String estudianteMetod21() {
		
		return "Reparo!";
		
	}
	
	public String estudianteMetodo3() {
		
		return "Riddikulus!";
		
	}
	@Override
	String personaMetodo1() {
		// TODO Auto-generated method stub
		return "Wingardium Leviosa!";
	}
	@Override
	String personaMetodo2() {
		// TODO Auto-generated method stub
		return "Accio!";
	}
	@Override
	String personaMetodo3() {
		// TODO Auto-generated method stub
		return "Petrificus Totalus";
	}
	@Override
	public String toString() {
		return "Estudiante [estudianteMentor=" + estudianteMentor + ", estudianteVarita=" + estudianteVarita
				+ ", estudianteNivel=" + estudianteNivel + "]";
	}
	
	
	

}
