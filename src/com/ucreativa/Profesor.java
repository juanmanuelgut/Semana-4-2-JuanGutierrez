/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Profesor extends Persona {
	
	private String profesorTitulo;
	private String profesorMateria;
	private String profesorAfiliacion;
	/**
	 * @return the profesorTitulo
	 */
	public String getProfesorTitulo() {
		return profesorTitulo;
	}
	/**
	 * @param profesorTitulo the profesorTitulo to set
	 */
	public void setProfesorTitulo(String profesorAtributo1) {
		this.profesorTitulo = profesorAtributo1;
	}
	/**
	 * @return the profesorMateria
	 */
	public String getProfesorMateria() {
		return profesorMateria;
	}
	/**
	 * @param profesorMateria the profesorMateria to set
	 */
	public void setProfesorMateria(String profesorAtributo2) {
		this.profesorMateria = profesorAtributo2;
	}
	/**
	 * @return the profesorAfiliacion
	 */
	public String getProfesorAfiliacion() {
		return profesorAfiliacion;
	}
	/**
	 * @param profesorAfiliacion the profesorAfiliacion to set
	 */
	public void setProfesorAfiliacion(String profesorAtributo3) {
		this.profesorAfiliacion = profesorAtributo3;
	}
	/**
	 * @param personaNombre
	 * @param personaApellido
	 * @param personaCasa
	 * @param profesorTitulo
	 * @param profesorMateria
	 * @param profesorAfiliacion
	 */
	public Profesor(String personaAtributo1, String personaAtributo2, String personaAtributo3, String profesorAtributo1,
			String profesorAtributo2, String profesorAtributo3) {
		super(personaAtributo1, personaAtributo2, personaAtributo3);
		this.profesorTitulo = profesorAtributo1;
		this.profesorMateria = profesorAtributo2;
		this.profesorAfiliacion = profesorAtributo3;
	}
	
	public String profesorMetodo1() {
		
		return "Expecto Patronum!!";
		
	}
	
	public String profesorMetod21() {
		
		return "Confundo";
		
	}
	
	public String profesorMetodo3() {
		
		return "Obliviate!!";
		
	}
	@Override
	String personaMetodo1() {
		// TODO Auto-generated method stub
		return "Avada Kedavra!!";
	}
	@Override
	String personaMetodo2() {
		// TODO Auto-generated method stub
		return "Crucio!!";
	}
	@Override
	String personaMetodo3() {
		// TODO Auto-generated method stub
		return "Expelliarmus!";
	}
	@Override
	public String toString() {
		return "Profesor [profesorTitulo=" + profesorTitulo + ", profesorMateria=" + profesorMateria
				+ ", profesorAfiliacion=" + profesorAfiliacion + "]";
	}
	
	
	

}
