package com.graymatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}

	@RequestMapping("/name")
	public ModelAndView printName (String name) {
		
		ModelAndView mv = new ModelAndView("divyanshu");
		name = "divyanshu";
		
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/username")
	public ModelAndView printUser () {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("username");
		mv.addObject("username", "Divyanshu Sachdeva");
		return mv;
	
	}
}
