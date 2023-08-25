package com.example.demo.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class welcomeControler {
@GetMapping("/welcome")
	public String welcontroler(Model model) {
		
		String msg= "Hii Santosh Welcome to Bikkad IT";
		
		model.addAttribute("WEL", msg);
		
		
		return "welcome";
	}
	
}
