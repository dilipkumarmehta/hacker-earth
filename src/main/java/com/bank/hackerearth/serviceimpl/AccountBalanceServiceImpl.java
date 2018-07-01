package com.bank.hackerearth.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

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
		if (findOne == null) {
			throw new MessageNotFountException("404", "Not Found");
		}
		return findOne;
	}
}
