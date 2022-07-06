package com.giz.infoseekdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giz.infoseekdemo.domain.Student;
import com.giz.infoseekdemo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//Post - Create Bank
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	//Get - Get All Students
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	//Get - Get Student By Id
	public Optional<Student> getStudentById(long studentId){
		return studentRepository.findById(studentId);
	}
	
	//Put - Update Student
	public Student updateStudent(long studentId, Student student) {
		Student existingStu = studentRepository.getById(studentId);
		if(existingStu != null) {
		   existingStu.setFirstName(student.getFirstName());
		   existingStu.setLastName(student.getLastName());
		   existingStu.setStatus(student.getStatus());
		   existingStu.setContactNumber(student.getContactNumber());
		   existingStu.setAge(student.getAge());
		}
		return studentRepository.save(existingStu);
	}
	
	//Delete - Delete Student
	public void deleteStudent(long studentId) {
		studentRepository.deleteById(studentId);
	}
	
	//Get - Get Student By First And Last Name
	public List<Student> getByFirstNameAndLastName(String firstName, String lastName){
			return studentRepository.findByFirstNameAndLastName(firstName, lastName);
	}
	//Get - Get Students By Between Age	
	public List<Student> getByAgeBetween(long from, long to){
			return studentRepository.findByAgeBetween(from, to);
	}	
	//Get - Get Students By Less Than Age
	public List<Student> getByAgeLessThan(long age){
		return studentRepository.findByAgeLessThan(age);
}
		
}
