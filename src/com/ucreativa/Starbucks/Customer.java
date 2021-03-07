/**
 * 
 */
package com.ucreativa.Starbucks;

/**
 * @author juangutierrez
 *
 */
public class Customer {
	
	private String customerAtributo1;
	private String customerAtributo2;
	private String customerAtributo3;
	
	/**
	 * @return the customerAtributo1
	 */
	public String getCustomerAtributo1() {
		return customerAtributo1;
	}

	/**
	 * @param customerAtributo1 the customerAtributo1 to set
	 */
	public void setCustomerAtributo1(String customerAtributo1) {
		this.customerAtributo1 = customerAtributo1;
	}

	/**
	 * @return the customerAtributo2
	 */
	public String getCustomerAtributo2() {
		return customerAtributo2;
	}

	/**
	 * @param customerAtributo2 the customerAtributo2 to set
	 */
	public void setCustomerAtributo2(String customerAtributo2) {
		this.customerAtributo2 = customerAtributo2;
	}

	/**
	 * @return the customerAtributo3
	 */
	public String getCustomerAtributo3() {
		return customerAtributo3;
	}

	/**
	 * @param customerAtributo3 the customerAtributo3 to set
	 */
	public void setCustomerAtributo3(String customerAtributo3) {
		this.customerAtributo3 = customerAtributo3;
	}

	/**
	 * @param customerAtributo1
	 * @param customerAtributo2
	 * @param customerAtributo3
	 */
	public Customer(String customerAtributo1, String customerAtributo2, String customerAtributo3) {
		super();
		this.customerAtributo1 = customerAtributo1;
		this.customerAtributo2 = customerAtributo2;
		this.customerAtributo3 = customerAtributo3;
	}

	public String customerMetodo1() {
		
		return "Metodo 1";
		
	} 
	
	public String customerMetodo2() {
		
		return "Metodo 2";
		
	}
	
	public String customerMetodo3() {
		
		return "Metodo 3";
		
	}

	@Override
	public String toString() {
		return "Customer [customerAtributo1=" + customerAtributo1 + ", customerAtributo2=" + customerAtributo2
				+ ", customerAtributo3=" + customerAtributo3 + "]";
	} 
	
	

}
