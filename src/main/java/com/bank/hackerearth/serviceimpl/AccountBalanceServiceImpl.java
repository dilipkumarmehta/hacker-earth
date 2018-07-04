package com.bank.hackerearth.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.bank.hackerearth.beans.Account;
import com.bank.hackerearth.beans.Customer;
import com.bank.hackerearth.configuraton.MongoDBConnection;
import com.bank.hackerearth.controller.MessageNotFountException;
import com.bank.hackerearth.service.AccountBalanceService;

@Service
public class AccountBalanceServiceImpl implements AccountBalanceService {
	@Autowired
	MongoDBConnection mongoDBConnection;

	@Autowired
	MongoTemplate mongoTemplate;

	@SuppressWarnings("deprecation")
	@Override
	public Customer getBalance(Integer messageId) {
		Customer findOne = null;
		Query query = new Query(Criteria.where("messageId").is(messageId));
		System.out.println(query);

		findOne = mongoTemplate.findOne(query, Customer.class, "Account");

		List<Account> al = new ArrayList<Account>();
		Account a = new Account(1234, "saving", 2345);
		Account a1 = new Account(1235, "saving", 2345);
		Account a2 = new Account(1236, "saving", 2345);
		al.add(a);
		al.add(a1);
		al.add(a2);

		Customer c = new Customer(22, al);
		// mongoTemplate.save(c, "Account");

		if (findOne == null) {
			throw new MessageNotFountException(messageId);
		}
		return findOne;
	}
}
