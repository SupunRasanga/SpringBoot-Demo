package com.giz.infoseekdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.giz.infoseekdemo.domain.Student;
import com.giz.infoseekdemo.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping(path = "{studentId}")
	public Optional<Student> getStudentById(@PathVariable long studentId){
		return studentService.getStudentById(studentId);
	}
	
	@PutMapping(path = "{studentId}")
	public Student updateStudent(@PathVariable long studentId,@RequestBody Student student) {
		return studentService.updateStudent(studentId, student);
	}
	
	@DeleteMapping(path = "{studentId}")
	public void delete(@PathVariable long studentId) {
		 studentService.deleteStudent(studentId);
	}
	
	@GetMapping(path = "/name")
	public <List> Object getByLastNameAndFirstName(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName){
		return studentService.getByFirstNameAndLastName(firstName, lastName);
	}
	
	@GetMapping(path = "/age1")
	public <List> Object getByAgeBetween(@RequestParam(value = "from") long from, @RequestParam(value = "to") long to){
		return studentService.getByAgeBetween(from, to);
	}
	
	@GetMapping(path = "/age2")
	public <List> Object getByAgeLessThan(@RequestParam(value = "age") long age){
		return studentService.getByAgeLessThan(age);
	}
}
