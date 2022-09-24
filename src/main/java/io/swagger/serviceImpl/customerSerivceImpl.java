package io.swagger.serviceImpl;

import java.text.Format.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.validation.Errors;

import io.swagger.dao.customerDao;
import io.swagger.model.Customer;
import io.swagger.service.customerService;

@Service
public class customerSerivceImpl  implements customerService{

	 @Autowired
     private customerDao customerdao;
	 
	 @PersistenceContext
	 EntityManager entityManager;
     
//     public Customer saveCustomer(Customer customer)
//     {
//		return customerdao.save(customer);
//   	  
//     }


	@Override
	public List<Customer> getCustomerDetails() {
		// TODO Auto-generated method stub
		return customerdao.findAll();
	}


	@Override
	public Customer saveCustomer(Customer customer) {
		boolean isExists = customerdao.exists(customer.getId());
		org.springframework.validation.Errors error = null;
		
		if(isExists) {
			error.reject("customer already present");
		}
		return customerdao.save(customer);
	}


	@Override
	public Optional<Customer> findCustomerById(Long id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(customerdao.findOne(id));
	}


	@Override
	public Optional<Customer> deleteCustomer(Long id) {
		if(findCustomerById(id).isPresent()) {
			customerdao.delete(findCustomerById(id).get());
		}
		return null;
		
	}


	
	public List<Customer> getCustomerDetailsWithFields(String field) {
		 return customerdao.findAll(new Sort(field));
		
	}
	
	 public List<Customer> getCustomerWithLimit(int limit)
	 {  //TypedQuery<Customer> query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.name LIKE :name ORDER BY e.id", Customer.class);
		 
		 return customerdao.getAllUserLimitData(limit); 
	 }


	@Override
	public Customer updateCustomerDetailsPartially(Long id, Map<Object, Object> objectMap) {
		// TODO Auto-generated method stub
		final Customer customer = customerdao.findOne(id);
		objectMap.forEach( (key,value) ->
		{
			java.lang.reflect.Field field = ReflectionUtils.findField(Customer.class, (String) key);
			field.setAccessible(true);
			ReflectionUtils.setField(field, customer, value);
		}
				);
		
		return customerdao.save(customer);
	}


	
	 
}
