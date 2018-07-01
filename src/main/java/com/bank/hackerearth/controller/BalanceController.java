package com.bank.hackerearth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.hackerearth.beans.Customer;
import com.bank.hackerearth.service.AccountBalanceService;

@RestController
public class BalanceController {

	@Autowired
	private AccountBalanceService accountBalanceService;

	@RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public Customer getBalance(@PathVariable(value = "customerId") int customerId) {
		Customer balance = accountBalanceService.getBalance(customerId);
		return balance;

	}

}
