package org.iit.se.booklib.controller;

import javax.servlet.http.HttpSession;

import org.iit.se.booklib.model.Student;
import org.iit.se.booklib.model.User;
import org.iit.se.booklib.service.UserManager;
import org.iit.se.booklib.service.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class StudentController {
	@Autowired
	UserManager userManager;
	StudentManager studentManager;
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
    public String student(Model model,HttpSession session) {
		if(session.getAttribute("userId")!=null && session.getAttribute("role")!=null &&  session.getAttribute("role").equals("Student")){
			User user = userManager.getUserByName((String) session.getAttribute("userId"));
			model.addAttribute("user",user);
			return "student";
		}else{
			return "login";
		}
     
    }
	
	@RequestMapping(value = "/studentDetails", method = RequestMethod.GET)
    public String studentDetails(Model model,HttpSession session) {
		if(session.getAttribute("userId")!=null && session.getAttribute("role")!=null &&  session.getAttribute("role").equals("Student")){
			User user = userManager.getUserByName((String) session.getAttribute("userId"));
			Student student = studentManager.getStudentByName((String) session.getAttribute("userId"));
			model.addAttribute("user",user);
			model.addAttribute("student",student);
			return "studentDetails";
		}else{
			return "student";
		}
     
    }
}
