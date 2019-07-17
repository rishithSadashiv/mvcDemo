package com.cruds.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginForm()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String processLogin(@RequestParam("userName") String uname, @RequestParam("password")String pwd, HttpSession session, RedirectAttributes redirectAttributes)
	{
		if(uname.equals("admin") && pwd.equals("admin"))
		{
			session.setAttribute("USER_NAME", uname);
			return "redirect:dept.html";
		}
		else
		{
			redirectAttributes.addAttribute("ERROR","Invalid Credentials");
			return "redirect:login.html";
		}
	}
	
}
