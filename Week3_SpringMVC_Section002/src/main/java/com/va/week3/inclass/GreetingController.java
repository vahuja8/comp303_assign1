package com.va.week3.inclass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {
	
	  @GetMapping("/greeting")
	  public String greetingForm(Model model) {
	    model.addAttribute("greeting", new Greeting());
	    return "greeting";
	  }
	
	
	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, Model model)
	{
		model.addAttribute("greeting", greeting);
		
		return "result";
		
	}
	
/*testing work	
	@PostMapping("/result")
	public String greetingSubmit2(@ModelAttribute Greeting greeting, Model model)
	{
		model.addAttribute("greeting", greeting);
		
		return "answer";
		
	}
	
	*/
	

}
