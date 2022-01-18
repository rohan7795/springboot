package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.assignment.Sum;
import com.example.demo.service.ServiceImpl;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoreApplicationTests {
	
	@Autowired
	ServiceImpl service;
	
	@Autowired
	Sum s;

	@Test
	void testDi() {
		assertNotNull(service);
	
		
	}
	@Test
	void testadd() {
		
		assertEquals(s.TwoSum(3, 4), 7);
		
	}

}
