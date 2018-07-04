package com.bank.hackerearth.controller;

public class InvalidMessageIdException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public String mesageId;

	public InvalidMessageIdException(String mesageId) {
		super();
		this.mesageId = mesageId;
	}

	@Override
	public String getMessage() {

		return mesageId.toString();
	}

}
