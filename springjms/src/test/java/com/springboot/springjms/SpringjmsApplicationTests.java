package com.springboot.springjms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.springjms.jms.Sender;

@SpringBootTest
class SpringjmsApplicationTests {
	
	@Autowired
	Sender sender;

	@Test
	void sendAndRecieve() {
		sender.send("Thi is test message");
		
	}

}
