package com.bank.hackerearth.beans;

public class Message {

	private String statusCode;
	private String failureReason;

	public Message(String statusCode, String failureReason) {
		super();
		this.statusCode = statusCode;
		this.failureReason = failureReason;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

}
