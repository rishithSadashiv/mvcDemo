package com.cruds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello()
	{
		return "home";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String sayHelloWithName(@RequestParam("firstName")String fname, ModelMap model)
	{
		model.addAttribute("USER_NAME", fname);
		return "home";
	}

}
