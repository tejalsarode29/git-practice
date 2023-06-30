package com.example.gitpractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gitpractice.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long > {

}
