package com.bank.hackerearth.service;

import org.springframework.stereotype.Service;

import com.bank.hackerearth.beans.Customer;

@Service
public interface AccountBalanceService {

	public Customer getBalance(Integer messageId);
}
