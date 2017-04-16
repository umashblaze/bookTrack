package org.iit.se.booklib.dao;

import java.util.List;

import org.iit.se.booklib.model.Student;

public interface StudentDao {
	
	List<Student> getStudents();
	
	List<Student> getStudentById(String UserId);
	
}