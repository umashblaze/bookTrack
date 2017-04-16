package org.iit.se.booklib.service;

import java.util.List;

import org.iit.se.booklib.model.Student;

public interface StudentManager {

	Student getStudentByName(String userName);
	
	List<Student> getStudents();

}