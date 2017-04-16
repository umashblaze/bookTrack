package org.iit.se.booklib.service;

import java.util.List;
import org.iit.se.booklib.dao.StudentDao;
import org.iit.se.booklib.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager {

	@Autowired
	StudentDao studentDao;

	public Student getStudentByName(String userName) {
		List<Student> students = studentDao.getStudentById(userName);
		return students.get(0);
	}

	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

}
