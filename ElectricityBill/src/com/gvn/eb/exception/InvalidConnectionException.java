package com.gvn.eb.exception;

public class InvalidConnectionException extends Exception {

	public InvalidConnectionException(String s){
		super(s);
	}
	
	public String toString() {
		return "Invalid Connection Type";
	}
}
