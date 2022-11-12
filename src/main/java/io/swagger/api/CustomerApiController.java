package io.swagger.api;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Customer;
import io.swagger.service.customerService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-24T07:46:52.134Z")

@RestController
public class CustomerApiController implements CustomerApi {

	private static final Logger log = LoggerFactory.getLogger(CustomerApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private customerService service;
	

	@org.springframework.beans.factory.annotation.Autowired
	public CustomerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
		String accept = request.getHeader("Accept");
		try {
			if (accept != null && accept.contains("application/json")) {
				return new ResponseEntity<Customer>(service.saveCustomer(customer), HttpStatus.CREATED);
			}
		} catch (Exception e) {

			// return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
			throw new DuplicateKeyException(String.valueOf(e));
		}
		
		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<Object> deleteCustomer(
			@ApiParam(value = "Identifier of the Customer", required = true) @PathVariable("id") Long id) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				Optional<Customer> customer = service.findCustomerById(id);
				if (customer.isPresent()) {
					service.deleteCustomer(customer.get().getId());
					return  ResponseEntity.ok("Customer Deleted");
				} 	
				
			} catch (Exception e) {
				return new ResponseEntity<>("Bad Request",HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>("Customer Not Present In Database",HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<List<Customer>> listCustomer() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				List<Customer> customerList = service.getCustomerDetails();
				System.out.println("customerList-->" + customerList);
				if (customerList.isEmpty() && customerList.size() == 0) {
					return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
				}

				return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<Customer>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<Customer>>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<Customer> retrieveCustomer(@PathVariable("id") Long id) {
		Optional<Customer> custCheck = service.findCustomerById(id);
		try {
			if (custCheck.isPresent()) {
				return new ResponseEntity<Customer>(custCheck.get(), HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
	}

//	@Override
//	public ResponseEntity<List<Customer>> listCustomerWithSorting(@PathVariable String field) {
//		try {
//			List<Customer> customerList = service.getCustomerDetailsWithFields(field);
//			System.out.println("customerList-->" + customerList);
//			if (customerList.isEmpty() && customerList.size() == 0) {
//				return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
//			}
//
//			return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
//		} catch (Exception e) {
//			log.error("Couldn't serialize response for content type application/json", e);
//			return new ResponseEntity<List<Customer>>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//
//	}

	@Override
	public ResponseEntity<List<Customer>> listCustomerWithSLimit(@PathVariable int limit) {
		try {
			List<Customer> customerList = service.getCustomerWithLimit(limit);
			System.out.println("customerList-->" + customerList);
			if (customerList.isEmpty() && customerList.size() == 0) {
				return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<List<Customer>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Customer> patchCustomer(@PathVariable("id") Long id,
			@RequestBody Map<Object, Object> objectMap) {
		String accept = request.getHeader("Accept");
		try {
			if (accept != null && accept.contains("application/json")) {
				return new ResponseEntity<Customer>(service.updateCustomerDetailsPartially(id, objectMap),
						HttpStatus.OK);
			}
		} catch (Exception e) {

			return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<Customer> updateCustomer(@Valid @RequestBody Customer customer) {
		String accept = request.getHeader("Accept");
		try {
			if (accept != null && accept.contains("application/json")) {
				return new ResponseEntity<Customer>(service.updateCustomerDetails(customer), HttpStatus.OK);
			}
		} catch (Exception e) {

			// return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
			return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	}

	/*
	 * @Override public ResponseEntity<List<Customer>> listCustomerWithSLimit(int
	 * limit) { try { List<Customer> customerList =
	 * service.getCustomerWithLimit(limit); System.out.println("customerList-->" +
	 * customerList); if (customerList.isEmpty() && customerList.size() == 0) {
	 * return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT); }
	 * 
	 * return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK); }
	 * catch (Exception e) {
	 * log.error("Couldn't serialize response for content type application/json",
	 * e); return new
	 * ResponseEntity<List<Customer>>(HttpStatus.INTERNAL_SERVER_ERROR); } }
	 */

}
