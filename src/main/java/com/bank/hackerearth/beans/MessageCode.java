package com.bank.hackerearth.beans;

public enum MessageCode {
	INVALID_MESSAGE_ID("0001","Invalid message ID ,please verify message the ID"),
	NO_DATA_FOUND("404","No Data Found For Message Id");
	
	private String statusCode;
	private String statusDescription;
	
	
	
	private MessageCode(String statusCode, String statusDescription) {
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	
	
	

}
