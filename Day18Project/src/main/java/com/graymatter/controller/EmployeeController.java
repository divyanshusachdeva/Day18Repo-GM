package com.graymatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Employee;

@Controller
//@RequestMapping("/empctrl")

public class EmployeeController {

	@RequestMapping("/doLogin")
	public String doLogin() {
		return "login";
		
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String uname, @RequestParam String pwd) {
		ModelAndView mv = new ModelAndView("welcome");
		
		if(uname.equals("divyanshu") && pwd.equals("123"))
		{
			System.out.println(uname);
		
		mv = new ModelAndView("addemp");
		//mv.addObject("uname", uname);
		}
		
		else {
			mv = new ModelAndView("login");
		}
		return mv;
		
	
	}
	
	
	@RequestMapping("/employee")
	public ModelAndView getEmpInfo() {
		Employee emp = new Employee("Divyanshu", 1029, 75000);
		ModelAndView mv = new ModelAndView("employee");
		
		mv.addObject("emp1", emp);
//		mv.addObject("emp");
		return mv;
	}
	
	@RequestMapping("/employee/add")
	public ModelAndView addEmp(@RequestParam String empName, @RequestParam String empId, @RequestParam String empSal) {
		
		Employee e = new Employee(empName, Integer.parseInt(empId), Double.parseDouble(empSal));
		ModelAndView mv = new ModelAndView("employee");
		mv.addObject("emp1",e);
		
		return mv;
		
	}
	
}
