package com.springboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.thymeleaf.model.Student;

@Controller
public class HelloControler {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView modelAndView = new ModelAndView("data");
		modelAndView.addObject("message", "Make the best out of the worst and be staisfied");
		return modelAndView;
	}

	@RequestMapping("/student")
	public ModelAndView getStudet() {
		ModelAndView modelAndView = new ModelAndView("student");
		Student attributeValue = new Student();
		attributeValue.setName("Rohan");
		attributeValue.setScore(100);
		modelAndView.addObject("student", attributeValue);
		return modelAndView;
	}

	@RequestMapping("/students")
	public ModelAndView getStudets() {
		ModelAndView modelAndView = new ModelAndView("students");
		Student attributeValue = new Student();
		attributeValue.setName("Rohan");
		attributeValue.setScore(100);

		Student attributeValue2 = new Student();
		attributeValue2.setName("BoB Marley");
		attributeValue2.setScore(100);

		List<Student> list = Arrays.asList(attributeValue, attributeValue2);
		modelAndView.addObject("students", list);
		return modelAndView;
	}

	@RequestMapping("/studentForm")
	public ModelAndView displayStudentForm() {
		ModelAndView modelAndView = new ModelAndView("studentForm");
		Student attributeValue = new Student();
		attributeValue.setName("Rohan");
		attributeValue.setScore(100);
		modelAndView.addObject("student", attributeValue);
		return modelAndView;
	}

	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student s) {
		ModelAndView modelAndView = new ModelAndView("result");
		System.out.println(s.getName());
		System.out.println(s.getScore());
		return modelAndView;
	}
}
