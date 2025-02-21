package com.adventurelandVillage.service;
import java.util.List;

import com.adventurelandVillage.exception.CustomerException;
import com.adventurelandVillage.exception.LoginException;
import com.adventurelandVillage.model.Customer;
import com.adventurelandVillage.model.LoginDTO;


public interface CustomerService {
	public Customer insertCustomer(Customer customer);
	public Customer updateCustomer(Customer customer,String key)throws CustomerException,LoginException;
	public String deleteCustomer(Long customerId,String key)throws CustomerException,LoginException;
	public List<Customer> viewCustomers(String key)throws LoginException;
	public Customer viewCustomer(Long customerId,String key)throws CustomerException,LoginException;
	public Customer validateCustomer(String key, LoginDTO loginDto)throws CustomerException,LoginException;
	
}
