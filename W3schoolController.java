package com.main;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3School")
public class W3schoolController {
	 @RequestMapping(value = "/bootstrap",method = RequestMethod.GET)
	public String bootStrap() {
		return "Bootstrap is a free, open-source framework that uses HTML, CSS, and JavaScript";
		
	}
	
	 @RequestMapping(value = "/java",method = RequestMethod.PUT)
		public String java() {
			return "Java is Object Oriented Language...";
			
		}
	 
	 @RequestMapping(value = "/html",method = RequestMethod.POST)
		public String html() {
			return "html is for front end language";
			
		}
	 
	 @RequestMapping(value = "/css",method = RequestMethod.DELETE)
		public String css() {
			return "Css is the language we use to style an html document ";
			
		}
	 
	 @RequestMapping(value = "/javaScript",method = RequestMethod.DELETE)
		public String javaScript() {
			return "JavaScript is the programming language of the web ";
			
		}
	 
	 @RequestMapping(value = "/sql",method = RequestMethod.DELETE)
		public String sql() {
			return "SQL is a standard language for storing,manupulating and retrieving data in databases";
			
		}
	 
	 
	 
	 
		
	 
	 
	

}
