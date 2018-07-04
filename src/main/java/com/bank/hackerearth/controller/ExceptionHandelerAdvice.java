package com.bank.hackerearth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bank.hackerearth.beans.Message;
import com.bank.hackerearth.beans.MessageCode;

@ControllerAdvice

public class ExceptionHandelerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MessageNotFountException.class)
	public ResponseEntity<Message> messageIdNotFount(MessageNotFountException ex) {

		Message msg = new Message(MessageCode.NO_DATA_FOUND.getStatusCode(),
				MessageCode.NO_DATA_FOUND.getStatusDescription() + " : " + ex.getMessage());
		new ResponseEntity<Message>(msg, HttpStatus.NOT_FOUND);
		return null;

	}

	@ExceptionHandler(InvalidMessageIdException.class)
	public ResponseEntity<Message> invalidMessageId(InvalidMessageIdException ex) {
		Message msg = new Message(MessageCode.INVALID_MESSAGE_ID.getStatusCode(),
				MessageCode.INVALID_MESSAGE_ID.getStatusDescription() + " : " + ex.getMessage());
		return new ResponseEntity<Message>(msg, HttpStatus.NOT_FOUND);

	}
}
