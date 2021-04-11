package com.example.springdev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestApplication {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model) throws Exception {
		System.out.println("TEST");
		return "index";
	}
}
