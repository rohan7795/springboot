package com.example.demo;

import java.security.interfaces.RSAKey;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Student;
import com.example.demo.entity.repo.StudentRepository;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootdatajpaApplicationTests {

	@Autowired
	private StudentRepository sr;

	@Test
	void testSaveStudent() {
		Student s = new Student();
		s.setId(12);
		s.setName("ROhan");
		s.setTestScore(100);
		sr.save(s);
		
		Student student = sr.findById(12l).get();
		assertNotNull(student);

	}

	@Test
	void tesSaveStudent() {

		Student student = sr.findById(12l).get();

		System.out.println(student);
		// assertNotNull(student);
		sr.deleteById(12l);
		// assertNull(sr.findById(12l).get());

	}

}
