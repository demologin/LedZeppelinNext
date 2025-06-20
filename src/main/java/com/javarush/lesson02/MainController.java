package com.javarush.lesson02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
    public String viewIndexPage(Model model) {
        model.addAttribute("header", "Maven Generate War");
    	return "lesson02/index";
	}
}