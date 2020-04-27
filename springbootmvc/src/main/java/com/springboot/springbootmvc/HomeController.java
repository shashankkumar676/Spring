package com.springboot.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
		int result = number1 + number2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", result);
		return mv;
	}
}
