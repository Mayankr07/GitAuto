package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController 
{
	@RequestMapping("/home")
    public String home() 
    {
//      System.out.println("Going to home View ");
//      String str=null;
//      System.out.println(str.length());
	  return "home"; 
    }
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) 
	{
		String url="http://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return  redirectView;
	}
	 
	
	@RequestMapping("/user/{userId}") // URI path Variable  /user/{userId}
	public String userDetails(@PathVariable("userId") int id)
	{
		System.out.println(id);
		return "home";
	}
	
	//Handling Exception in Spring MVC and displaying proper Error Page
	
	
//	specify @ExceptionHandler annotation on handler to get execute when Exception occure
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) //to send status no on error page
//	@ExceptionHandler(value =  NullPointerException.class)
//	public  String exceptionNullPointerExceptionHanler(Model m) 
//	{
//		m.addAttribute("msg","Null Pointer Exception Occured");
//		return "error_page";
//	}
//	
//	@ExceptionHandler(value =  NumberFormatException.class)
//	public  String exceptionNumberFormatExceptionHanler(Model m) 
//	{
//		m.addAttribute("msg","Number Format Exception Occured");
//		return "error_page";
//	}
//	
//	//generic Exception
//	
//	@ExceptionHandler(value =  Exception.class)
//	public  String generalExceptionHanler(Model m) 
//	{
//		m.addAttribute("msg","Somathing Went Wrong");
//		return "error_page";
//	}
}
