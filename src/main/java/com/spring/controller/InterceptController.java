package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptController 
{
	
    @RequestMapping("/incept")
	public String home()
	{
    	System.out.println("in InterceptController");
		return "interceptForm";
	}
    
    
    //Handling request
    @RequestMapping(path = ("/welcome"))
    public String welcome(@RequestParam("username") String name,Model m)
    {
    	System.out.println(name);
    	m.addAttribute("name",name);
    	return "welcome";
    }
	
}
