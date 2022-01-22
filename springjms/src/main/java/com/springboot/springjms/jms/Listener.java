package com.springboot.springjms.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	
	@JmsListener(destination = "${springjms.queue}")
	public void recieve(String message) {
		System.out.println(message);
		
	}
}
