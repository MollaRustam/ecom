package com.rustam.ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rustam.ecommerce.Entity.Customer;
//import com.rustam.ecommerce.Repo.CustomerRepo;
@Service
public class CustomerServiceImpl  {
	/*@Autowired
	private CustomerRepo customerRepo;
	
	private PasswordEncoder passwordEncoder; 
	

	@Override
	public Customer registerCustomer(Customer customer) {
		System.out.println(customer); 
		if(customerRepo.findByEmail(customer.getEmail())!=null) {
			throw new IllegalArgumentException("Email is already taken.");
		}
		String hashedPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(hashedPassword);
        
		return customerRepo.save(customer);
	}

	@Override
	public Customer loginCustomer(String email, String password) {
		Customer customer = customerRepo.findByEmail(email);
        if (customer != null && passwordEncoder.matches(password, customer.getPassword())) {
            return customer;
        }
        return null;
	}*/

}
