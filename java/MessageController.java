package com.industries.seanimus.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.industries.seanimus.domain.Message;
import com.industries.seanimus.services.MessageService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@RequestMapping("/message/all")
	public HttpEntity<List<Message>> getMessages() {
		return new ResponseEntity<List<Message>>(messageService.getAllMesages(), HttpStatus.OK);

	}
	
	@RequestMapping("/message/add")
	public void addMessages(@RequestBody ArrayList<Message> messages) {
		System.out.println("Messages received: " + messages.size());
		for (Message message : messages) {
			System.out.println(message);
		}
	}
	
}
