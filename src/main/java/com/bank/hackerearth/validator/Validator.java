package com.bank.hackerearth.validator;

import org.springframework.stereotype.Service;

import com.bank.hackerearth.controller.InvalidMessageIdException;

@Service
public class Validator {

	public void isIdValid(Integer messageId) {
		if (messageId.SIZE < 2) {
			throw new InvalidMessageIdException(messageId);
		}

	}

}
