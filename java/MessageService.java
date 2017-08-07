package com.industries.seanimus.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.industries.seanimus.domain.Message;

@Service
public class MessageService {

	private List<Message> messages = new ArrayList<>();

	public List<Message> getAllMesages() {
		return messages;
	}
	
	
	@PostConstruct
	public void loadMessages() {
		Message m1 = new Message();
		Message m2 = new Message();
		Message m3 = new Message();
		Message m4 = new Message();
		
		m1.setFrom("Sean");
		m1.setMessage("Howdy :)");
		
		m2.setFrom("Katie");
		m2.setMessage("Hello everyone!");
		
		m3.setFrom("Markus");
		m3.setMessage("Hi from Markus");
		
		m4.setFrom("Wes");
		m4.setMessage("Hello from Wes");
		
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
	}

}
