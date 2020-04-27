package com.springboot.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.springmvc.model.Alien;

@Controller
public class HomeController {

	@ModelAttribute
	public void addModel(Model m) {
		m.addAttribute("name", "Shashank");
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("addAlien")
	public String add(@ModelAttribute("alien") Alien a) {
		return "result";
	}
}
