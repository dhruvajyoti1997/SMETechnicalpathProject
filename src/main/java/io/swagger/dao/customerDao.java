package io.swagger.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.model.Customer;

@Repository
public interface customerDao  extends JpaRepository<Customer, Long>{
	
	
	  @Query( value ="select customer_name, customer_status from customer order by customer_id  limit :limit",nativeQuery = true) 
	  public List<Customer> getAllUserLimitData(@Param("limit") int limit);
}
