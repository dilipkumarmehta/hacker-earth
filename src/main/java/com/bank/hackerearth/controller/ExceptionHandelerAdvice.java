package com.bank.hackerearth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bank.hackerearth.beans.Message;

@ControllerAdvice
public class ExceptionHandelerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MessageNotFountException.class)
	public ResponseEntity<Message> messageIdNotFount(MessageNotFountException ex) {

		Message msg = new Message("404", "Message id is not Found");

		return new ResponseEntity<Message>(msg, HttpStatus.NOT_FOUND);

	}
}
