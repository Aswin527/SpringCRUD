package com.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	public AddController() {
		System.out.println("AddController Object Created");
	}
	
	@RequestMapping("/add")
	public ModelAndView add() {
		System.out.println("Add Controller");
		return new ModelAndView("display.jsp");
	}
}
