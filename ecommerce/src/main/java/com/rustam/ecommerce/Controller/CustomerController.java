package com.rustam.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rustam.ecommerce.Entity.Customer;
import com.rustam.ecommerce.Service.CustomerService;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CustomerController {
	//@Autowired
	//private CustomerService customerService;
	
	
	@PostMapping(value="/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerCustomer(@RequestBody String customer) {
        //Customer registeredCustomer = customerService.registerCustomer(customer);
        return "hello world";
    }


    /*@PostMapping("/login")
    public Customer loginCustomer(@RequestParam String email, @RequestParam String password) {
        return customerService.loginCustomer(email, password);
    }*/
	
}