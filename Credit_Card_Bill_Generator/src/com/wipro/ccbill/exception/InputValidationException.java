package com.wipro.ccbill.exception;

public class InputValidationException extends Exception {

	public InputValidationException()
	{
		super();
	}
	
	public String toString() {
		
		return "Invalid Input Data";
		
	}
}
