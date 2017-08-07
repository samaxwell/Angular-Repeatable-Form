package com.industries.seanimus.domain;

public class Message {
	
	private String from;
	private String message;
	
	public Message() {}

	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [from=" + from + ", message=" + message + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Message) {
			Message newMessage = (Message) obj;
			if (newMessage.getFrom().equals(getFrom()) 
					&& newMessage.getFrom().equals(getMessage()) ){
				return true;
			}
		}
		return false;
	}

	
}
