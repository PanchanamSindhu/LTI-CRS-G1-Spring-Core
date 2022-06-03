package com.lt.exception;

public class PaymentDeclineException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * This method return exception message .
	 * return PaymentDeclineException
	 */
	public PaymentDeclineException(String errorMessage) {
		super(errorMessage);
	}

}
