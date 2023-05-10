package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String helloWorldForm()
	{
		return "hello-world-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "hello-world";
	}
	/*
	 * @RequestMapping("/processFormVersion2") public String
	 * processFormVersion2(HttpServletRequest request,Model model) {
	 * model.addAttribute("message",request.getParameter("StudentName").toUpperCase(
	 * )+" Yo"); return "hello-world"; }
	 */
	
	@RequestMapping("/processFormVersion2")
	public String processFormVersion2(@RequestParam("StudentName") String theStudentName,Model model)
	{
		model.addAttribute("message",theStudentName.toUpperCase()+" Yo");
		return "hello-world";
	}
	
	

}
