package org.iit.se.booklib.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.iit.se.booklib.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> getStudents() {

		String sql = "SELECT * FROM STUDENT";

		List<Student> students = new ArrayList<Student>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		if (CollectionUtils.isNotEmpty(rows)) {
			for (Map row : rows) {
				Student student = new Student();
				student.setUserId((String) (row.get("userId")));
				student.setParentName((String) (row.get("parent_name")));
				student.setParentContact((String) (row.get("parent_contact")));
				student.setDueAmount((String) (row.get("due_amount")));
				students.add(student);
			}
		}
		return students;
	}

	@Override
	public List<Student> getStudentById(String UserId) {

		String sql = "SELECT * FROM STUDENT WHERE userId = '" + UserId + "'";

		List<Student> students = new ArrayList<Student>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		if (CollectionUtils.isNotEmpty(rows)) {
			for (Map row : rows) {
				Student student = new Student();
				student.setUserId((String) (row.get("userId")));
				student.setParentName((String) (row.get("parent_name")));
				student.setParentContact((String) (row.get("parent_contact")));
				student.setDueAmount((String) (row.get("due_amount")));
				students.add(student);
			}
		}
		return students;
	}

}
