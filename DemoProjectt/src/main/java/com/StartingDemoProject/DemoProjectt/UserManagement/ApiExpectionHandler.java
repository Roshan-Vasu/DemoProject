package com.StartingDemoProject.DemoProjectt.UserManagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApiExpectionHandler {
	
	@ExceptionHandler({NoHandlerFoundException.class})
	public ResponseEntity<ApiErrorResponse> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpServletRequest httpServletRequest){
		ApiErrorResponse apiErrorResponse = new ApiErrorResponse(404, "Name Not Found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).contentType(MediaType.APPLICATION_JSON).body(apiErrorResponse);
	}
}
