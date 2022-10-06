package io.swagger.globalException;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@ResponseBody
public class globalExceptionHandler {
	
	@ExceptionHandler(DuplicateKeyException.class)
	public ResponseEntity<String> duplicateValueHandler(DuplicateKeyException ex, WebRequest req){
		return new ResponseEntity<String>("The Customer Id is already present in the DataBase !!", HttpStatus.BAD_REQUEST);
		
	}
	
}
