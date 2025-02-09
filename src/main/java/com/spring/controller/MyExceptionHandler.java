package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

   //centralize Exceeption Handling

@ControllerAdvice
public class MyExceptionHandler
{
    //Handling Exception in Spring MVC and displaying proper Error Page
	
	
    //specify @ExceptionHandler annotation on handler to get execute when Exception occure
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) //to send status no on error page
	@ExceptionHandler(value =  NullPointerException.class)
	public  String exceptionNullPointerExceptionHanler(Model m) 
	{
		m.addAttribute("msg","Null Pointer Exception Occured");
		return "error_page";
	}
	
	@ExceptionHandler(value =  NumberFormatException.class)
	public  String exceptionNumberFormatExceptionHanler(Model m) 
	{
		m.addAttribute("msg","Number Format Exception Occured");
		return "error_page";
	}
	
	//generic Exception
	
	@ExceptionHandler(value =  Exception.class)
	public  String generalExceptionHanler(Model m) 
	{
		m.addAttribute("msg","Somathing Went Wrong");
		return "error_page";
	}
}
