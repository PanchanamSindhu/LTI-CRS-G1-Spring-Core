package com.lt.exception;

/**
 * This is the Exception class extends from RuntimeException which returns exception message.
 * 
 * @param args Unused.
 * @return Nothing.
 * 
 *  */
public class LoginFailedException extends RuntimeException {
	
	/**
	 * 
	 * This method return exception message .
	 * return LoginFailedException
	 */
	public LoginFailedException(String errorMessage) {  
	    super(errorMessage); 

	}
}
