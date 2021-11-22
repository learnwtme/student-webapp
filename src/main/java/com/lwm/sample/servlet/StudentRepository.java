package com.lwm.sample.servlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository {
	private Map<String, Student> students;
	private static StudentRepository repository;
	
	private StudentRepository() {
		students = new HashMap<>();
		populateRepository();
	}
	
	public static StudentRepository getInstance() {
		if (repository == null) {
			repository = new StudentRepository();
		}
		return repository;
	}
	
	public void addStudent(Student student) {
		students.put(student.getIndexNumber(), student);
	}
	
	public Student getStudent(String indexNumber) {
		return students.get(indexNumber);
	}
	
	public void populateRepository() {
		Student s1 = new Student();
		s1.setIndexNumber("A-1");
		s1.setName("Alice");
		students.put("A-1", s1);
		
		Student s2 = new Student();
		s2.setIndexNumber("A-2");
		s2.setName("Bob");
		students.put("A-2", s2);
	}

}
