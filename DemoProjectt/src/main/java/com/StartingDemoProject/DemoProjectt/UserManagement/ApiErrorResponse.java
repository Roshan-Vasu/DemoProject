package com.StartingDemoProject.DemoProjectt.UserManagement;

public class ApiErrorResponse {

	private int code;
	private String message;
	
	public ApiErrorResponse(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}	
	
}
