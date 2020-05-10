package com.vmware.vmwareassigment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vmware.vmwareassigment.exception.object.ValueNotfoundException;

@ControllerAdvice
public class ControllerException {
	@ExceptionHandler(value = ValueNotfoundException.class)
	public ResponseEntity<Object> exception(ValueNotfoundException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
