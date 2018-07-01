package com.bank.hackerearth.controller;

public class MessageNotFountException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	String messageDesc;

	public MessageNotFountException(String message, String messageDesc) {
		super();
		this.message = message;
		this.messageDesc = messageDesc;
	}

	@Override
	public String toString() {
		return "MessageNotFountException [message=" + message + ", messageDesc=" + messageDesc + "]";
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
