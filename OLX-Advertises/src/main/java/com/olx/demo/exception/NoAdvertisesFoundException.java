package com.olx.demo.exception;

public class NoAdvertisesFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	String message;

	public NoAdvertisesFoundException(String message) {
		super(message);
		this.message = message;
	}

	public NoAdvertisesFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoAdvertisesFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoAdvertisesFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
