package com.lt.exception;

public class PaymentDeclineException extends RuntimeException {
	public PaymentDeclineException(String errorMessage) {
		super(errorMessage);
	}

}
