package com.example.lesson07.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lesson07.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	// Spring Data JPA 
	// JpaRepository안에 내장되있는 메소드
	// save(객체)
	
	// findById()
}
