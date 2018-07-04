package com.bank.hackerearth.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "customerAccount")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	//@XmlElement
	private String messageId;
	//@XmlElement
	private List<Account> accounts;

	public Customer() {

	}

	public Customer(String messageId, List<Account> accounts) {
		super();
		this.messageId = messageId;
		this.accounts = accounts;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	
}
