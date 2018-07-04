package com.bank.hackerearth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.hackerearth.beans.Customer;
import com.bank.hackerearth.service.AccountBalanceService;
import com.bank.hackerearth.validator.Validator;

@RestController
public class BalanceController {

	@Autowired
	private AccountBalanceService accountBalanceService;
	@Autowired
	Validator validator;

	@RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public Customer getBalance(@PathVariable(value = "customerId") String customerId) {
		System.out.println("*******************"+customerId.length());
		validator.isIdValid(customerId);
		Customer balance = accountBalanceService.getBalance(customerId);
		return balance;

	}

}
