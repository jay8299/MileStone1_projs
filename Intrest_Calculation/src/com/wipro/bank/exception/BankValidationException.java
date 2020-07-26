package com.wipro.bank.exception;

public class BankValidationException extends Exception 
{
	public BankValidationException(String s)
	{
		super(s);
	}
   public String toString() {
	   return "Invalid";
   }
	
}
