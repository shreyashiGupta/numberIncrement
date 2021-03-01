package com.glaucous.numberIncrement.ExceptionHandling;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class NumberIncrementExceptionController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<NumberIncrementException> somethingWentWrong(Exception exception)
	{
		return new ResponseEntity<>(new NumberIncrementException(Instant.now(),exception.getMessage(),
			HttpStatus.SERVICE_UNAVAILABLE.toString()), 
			HttpStatus.SERVICE_UNAVAILABLE);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<NumberIncrementException> errorWhileSaving(Exception exception)
	{
		return new ResponseEntity<>(new NumberIncrementException(Instant.now(),exception.getMessage(),
			HttpStatus.BAD_REQUEST.toString()), 
			HttpStatus.BAD_REQUEST);
		
	}
}
