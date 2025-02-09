package com.spring.controller;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FieUploadController 
{     
	/* steps to upoad files in MVC
	 * 1) add Dependencies of Commons IO of version 2.7 above and Commons FileUplopad
	 *                         
	 * 2) Configuring Multipart View Resolver in Servlet-spring.xml file
	 * and declare Bean of CommonsMultipartResolver which is implementation class of 
	 * Multipart View Resolver.
	 * 
	 * */
	
	
	  @RequestMapping("/Fileform")
	  public String showUploadForm() 
	  {
		 String str=null;
		 System.out.println(str.charAt(0));
		  return "fileForm";
	  }
	  
	  @RequestMapping(value ="/uploadimage",method = RequestMethod.POST)
	  public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession ses,Model model)
//	  public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpServletRequest ses)
	  {
		  System.out.println("File Handler");
		  System.out.println(file.getSize());
		  System.out.println(file.getContentType());
		  System.out.println(file.getName());
		  System.out.println(file.getOriginalFilename());
		  System.out.println(file.getStorageDescription());
		  
		  
		  //To upload File on Server
		  
		  //fetching data from client
		byte[] bytes = file.getBytes();
		String realPath =ses.getServletContext().getRealPath("/WEB-INF/resources/serverimges/")+file.getOriginalFilename();
		
		try 
		{
			FileOutputStream fout=new FileOutputStream(realPath);
			fout.write(bytes);
			fout.close();
			System.out.println("file Uploaded");
			model.addAttribute("msg","uploaded Successfully");
			model.addAttribute("filename",file.getOriginalFilename());
		} catch (Exception e)
		{
			System.out.println(e);
			System.out.println("uploading Error");
			model.addAttribute("msg","Can Not uploaded ");
		}
		System.out.println(realPath);
		//saving file to server
		return "filesuccess";
	  }
}
