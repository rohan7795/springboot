package com.springweb.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.restapi.entity.Student;
import com.springweb.restapi.repo.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	StudentRepo sr;

	@RequestMapping(value = "/student/", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return sr.findAll();
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int id) {
		return sr.findById(id).get();
	}

	@RequestMapping(value = "/student/", method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student s) {
		return sr.save(s);
	}

	@RequestMapping(value = "/student/", method = RequestMethod.POST)
	public Student createStudent(@RequestBody Student s) {
		return sr.save(s);
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.POST)
	public void createStudent(@PathVariable("id") int id) {
		sr.deleteById(id);
	}
}
