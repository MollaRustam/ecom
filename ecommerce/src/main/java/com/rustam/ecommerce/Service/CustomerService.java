package com.rustam.ecommerce.Service;

import com.rustam.ecommerce.Entity.Customer;

public interface CustomerService {
	Customer registerCustomer(Customer customer);
	Customer loginCustomer(String email,String password);
}
