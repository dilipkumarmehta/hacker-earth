package com.bank.hackerearth.validator;

import org.springframework.stereotype.Service;

import com.bank.hackerearth.controller.InvalidMessageIdException;

@Service
public class Validator {

	public void isIdValid(String messageId) {
		if (messageId.length() == 2) {
			System.out.println("**********************");
			throw new InvalidMessageIdException(messageId);
		}

	}

}
