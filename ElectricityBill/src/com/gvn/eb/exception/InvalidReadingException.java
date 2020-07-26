package com.gvn.eb.exception;

public class InvalidReadingException extends Exception {

	public InvalidReadingException(String s) {
		super(s);
	}
	
	public String toString() {
		return "Incorrect Reading";
	}
}
