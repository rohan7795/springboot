package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;

@Service
public class ServiceImpl implements ServiceC{
	
	@Autowired
	Dao dao;

}
