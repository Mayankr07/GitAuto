package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Entity.Student;

@Controller
public class FormController 
{
	@RequestMapping(path = "/complex")
    public String showForm() 
    {
	  System.out.println("in Complex 1");
	  return "complex_form";  
    }
	
	@RequestMapping(path = "/handleform" ,method = RequestMethod.POST)    //BindingResult used to handle errors
	public String formHandler(@ModelAttribute("stu") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex_form";
		}
		System.out.println(student);
		return "success";
	}
	
}
