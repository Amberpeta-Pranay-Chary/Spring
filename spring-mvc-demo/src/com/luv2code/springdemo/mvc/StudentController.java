package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
		
		
		@RequestMapping("/showForm")
		public String showForm(Model model)
		{
			model.addAttribute("student",new Student());
			return "student-form";
		}
		
		@RequestMapping("/processForm")
		public String processForm(@ModelAttribute("student") Student theStudent)
		{
			//logs
		//	String f=theStudent.getFirstName();
			//System.out.println("Student First Name : "+theStudent.getLastName()+" \nStudent Last Name : "+theStudent.getLastName());
			return "student-confirmation";
		}
}
