package com.bank.hackerearth.beans;

public class Message {
	private String messgeCode;
	private String messgeDescription;

	public Message(String messgeCode, String messgeDescription) {
		super();
		this.messgeCode = messgeCode;
		this.messgeDescription = messgeDescription;
	}

	public String getMessgeCode() {
		return messgeCode;
	}

	public void setMessgeCode(String messgeCode) {
		this.messgeCode = messgeCode;
	}

	public String getMessgeDescription() {
		return messgeDescription;
	}

	public void setMessgeDescription(String messgeDescription) {
		this.messgeDescription = messgeDescription;
	}

}
