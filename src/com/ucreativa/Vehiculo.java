/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Vehiculo implements Actor,ObjetoInerte{
	
	private String vehiculoColor;
	private String vehiculoTraccion;
	private String vehiculoCombustible;
	/**
	 * @return the vehiculoColor
	 */
	public String getVehiculoColor() {
		return vehiculoColor;
	}
	/**
	 * @param vehiculoColor the vehiculoColor to set
	 */
	public void setVehiculoColor(String vehiculoatributo1) {
		this.vehiculoColor = vehiculoatributo1;
	}
	/**
	 * @return the vehiculoTraccion
	 */
	public String getVehiculoTraccion() {
		return vehiculoTraccion;
	}
	/**
	 * @param vehiculoTraccion the vehiculoTraccion to set
	 */
	public void setVehiculoTraccion(String vehiculoatributo2) {
		this.vehiculoTraccion = vehiculoatributo2;
	}
	/**
	 * @return the vehiculoCombustible
	 */
	public String getVehiculoCombustible() {
		return vehiculoCombustible;
	}
	/**
	 * @param vehiculoCombustible the vehiculoCombustible to set
	 */
	public void setVehiculoCombustible(String vehiculoatributo3) {
		this.vehiculoCombustible = vehiculoatributo3;
	}
	/**
	 * @param vehiculoColor
	 * @param vehiculoTraccion
	 * @param vehiculoCombustible
	 */
	public Vehiculo(String vehiculoatributo1, String vehiculoatributo2, String vehiculoatributo3) {
		super();
		this.vehiculoColor = vehiculoatributo1;
		this.vehiculoTraccion = vehiculoatributo2;
		this.vehiculoCombustible = vehiculoatributo3;
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
	
	@Override
	public void objetoInerteMetodo1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void objetoInerteMetodo2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void objetoInerteMetodo3() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Vehiculo [vehiculoColor=" + vehiculoColor + ", vehiculoTraccion=" + vehiculoTraccion
				+ ", vehiculoCombustible=" + vehiculoCombustible + "]";
	}
	
}
