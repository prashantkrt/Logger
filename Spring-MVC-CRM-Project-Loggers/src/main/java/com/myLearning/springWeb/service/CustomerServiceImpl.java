package com.myLearning.springWeb.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myLearning.springWeb.controller.CustomerController;
import com.myLearning.springWeb.dao.ICustomerDao;
import com.myLearning.springWeb.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService{

	private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private ICustomerDao repo;
	
	@Override
	public List<Customer> getCustomers() {	
		log.debug("getCustomers() method is invoked");
		Iterable<Customer> itr = repo.findAll();
		return (List<Customer>)itr;
	}

	@Override
	public void registerCustomer(Customer customer) {
		log.debug("registerCustomer() method is invoked");
		repo.save(customer);		
	}

	@Override
	public Optional<Customer> getCustomer(Integer id) {		
		Optional<Customer> customer = repo.findById(id);
		return customer;
	}

	@Override
	public void deleteCustomer(Integer id) {		
		repo.deleteById(id);		
	}

	@Override
	public Customer updateCustomer(Integer id) {
		Optional<Customer> customer = repo.findById(id);		
		return customer.get();
	}

}
