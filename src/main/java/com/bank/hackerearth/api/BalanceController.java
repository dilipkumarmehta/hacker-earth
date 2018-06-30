package com.bank.hackerearth.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.hackerearth.beans.Account;
import com.bank.hackerearth.beans.Customer;

@RestController
public class BalanceController {

	@RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer getBalance(@PathVariable(value = "customerId") String customerId) {
		List<Account> accounts = new ArrayList<Account>();
		Account account = new Account(123, "saving", 1234);
		Account account1 = new Account(123, "saving", 1234);
		accounts.add(account);
		accounts.add(account1);
		Customer cust = new Customer(123, accounts);
		return cust;

	}

}
