package com.springweb.restapi.repo;

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.restapi.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
