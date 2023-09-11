package com.rustam.ecommerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Customer {
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	*/
	private String customerName;
	
	private String email;
	
	private String password;

	public Customer() {
		
	}

	public Customer( String customerName, String email, String password) {
		super();
		//this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.password = password;
	}

	/*public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}*/

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", password=" + password + "]";
	}*/
	
}
