package com.Jpa.M2M.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jpa.M2M.entity.Student;
import com.Jpa.M2M.repository.CourseRepository;
import com.Jpa.M2M.repository.StudentRepository;

@RestController
@RequestMapping("/students/courses")
public class StudentCourseController {
	
	@Autowired
	
	private StudentRepository studentRepository;
	private  CourseRepository courseRepository;
	public StudentCourseController(StudentRepository studentRepository, CourseRepository courseRepository) {
		super();
		this.studentRepository = studentRepository;
		this.courseRepository = courseRepository;
	}
	
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student ) {
		return studentRepository.save(student);
		
	}
	
	@GetMapping
	public List<Student> findAllStudents(){
		return studentRepository.findAll();
		
	}
	

}
