package com.giz.infoseekdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giz.infoseekdemo.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	List<Student> findByAgeBetween(long from, long to);
	
	List<Student> findByAgeLessThan(long age);
}
