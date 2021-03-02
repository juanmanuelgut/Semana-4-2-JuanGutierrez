/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Vehiculo implements Actor{
	
	private String vehiculoatributo1;
	private String vehiculoatributo2;
	private String vehiculoatributo3;
	/**
	 * @return the vehiculoatributo1
	 */
	public String getVehiculoatributo1() {
		return vehiculoatributo1;
	}
	/**
	 * @param vehiculoatributo1 the vehiculoatributo1 to set
	 */
	public void setVehiculoatributo1(String vehiculoatributo1) {
		this.vehiculoatributo1 = vehiculoatributo1;
	}
	/**
	 * @return the vehiculoatributo2
	 */
	public String getVehiculoatributo2() {
		return vehiculoatributo2;
	}
	/**
	 * @param vehiculoatributo2 the vehiculoatributo2 to set
	 */
	public void setVehiculoatributo2(String vehiculoatributo2) {
		this.vehiculoatributo2 = vehiculoatributo2;
	}
	/**
	 * @return the vehiculoatributo3
	 */
	public String getVehiculoatributo3() {
		return vehiculoatributo3;
	}
	/**
	 * @param vehiculoatributo3 the vehiculoatributo3 to set
	 */
	public void setVehiculoatributo3(String vehiculoatributo3) {
		this.vehiculoatributo3 = vehiculoatributo3;
	}
	/**
	 * @param vehiculoatributo1
	 * @param vehiculoatributo2
	 * @param vehiculoatributo3
	 */
	public Vehiculo(String vehiculoatributo1, String vehiculoatributo2, String vehiculoatributo3) {
		super();
		this.vehiculoatributo1 = vehiculoatributo1;
		this.vehiculoatributo2 = vehiculoatributo2;
		this.vehiculoatributo3 = vehiculoatributo3;
	}
	
	public String vehiculoMetodo1() {
		return "Método Vehículo 1";
	}

	public String vehiculoMetodo2() {
		return "Método Vehículo 2";
	}
	
	public String vehiculoMetodo3() {
		return "Método Vehículo 3";
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
	
	
}
