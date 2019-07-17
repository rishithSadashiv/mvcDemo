package com.cruds.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cruds.entity.Department;
import com.cruds.service.DepartmentService;

@Controller
public class DeptController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="/dept",method=RequestMethod.GET)
	public String showDeptForm(ModelMap model)
	{
		model.addAttribute("DEPT_LIST", departmentService.listDepartments());
		model.addAttribute("command", new Department());
		return "dept";
		//return new ModelAndView("dept","command", new Department());
	}
	
	@RequestMapping(value="/dept",method=RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute("department")Department d)
	{
		System.out.println(d.getDeptId()+":"+d.getDeptName());
		departmentService.create(d);
		return "redirect:dept.html";//redirect is done to avoid duplicate entries to database. It clears the text fields each time.
	}
	
	
	
	
	/*@RequestMapping(value="/dept",method=RequestMethod.GET)
	public String showDeptForm()
	{
			return "dept";
	}*/
	
	/*@RequestMapping(value="/dept",method=RequestMethod.POST)
	public String handleFormSubmit(@RequestParam("deptId") int deptId,@RequestParam("deptName")String deptName)
	{
		System.out.println(deptId+":"+deptName);
		return "redirect:dept.html";
	}*/

}
