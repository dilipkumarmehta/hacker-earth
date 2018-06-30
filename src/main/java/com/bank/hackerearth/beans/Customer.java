package com.bank.hackerearth.beans;

import java.util.List;

public class Customer {
	private int messageId;
	private List<Account> accounts;

	public Customer() {

	}

	public Customer(int messageId, List<Account> accounts) {
		super();
		this.messageId = messageId;
		this.accounts = accounts;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [messageId=" + messageId + ", accounts=" + accounts + "]";
	}

	
}
