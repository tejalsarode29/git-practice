package com.example.gitpractice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gitpractice.Repository.StudentRepository;
import com.example.gitpractice.model.Student;

@RestController
@RequestMapping
public class StudentController {
	@Autowired
	StudentRepository stuRepo;
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Optional<Student>> getstudentById(@PathVariable (value = "id") long id){
		Optional<Student> lst1 = stuRepo.findById(id);
		return ResponseEntity.ok().body(lst1);
	}

}
