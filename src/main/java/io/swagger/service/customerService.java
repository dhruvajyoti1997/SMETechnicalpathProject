package io.swagger.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.swagger.model.Customer;

public interface customerService {

	public Customer saveCustomer(Customer customer);

	public List<Customer> getCustomerDetails();

	public List<Customer> getCustomerDetailsWithFields(String field);

	public Optional<Customer> findCustomerById(Long id);

	public Optional<Customer> deleteCustomer(Long id);

	public List<Customer> getCustomerWithLimit(int limit);

	public Customer updateCustomerDetailsPartially(Long id, Map<Object, Object> objectMap);
	
	public Customer updateCustomerDetails(Customer customer);

	public List<Customer> getLimitedCustomerData(int limit, int offset);

}
