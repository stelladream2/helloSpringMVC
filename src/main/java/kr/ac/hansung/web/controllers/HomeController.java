package kr.ac.hansung.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//@RequestMapping(value = "/", method = RequestMethod.POST)
	@RequestMapping("/")
	public String home(ModelMap model, HttpServletRequest request) {
		
		System.out.println("home controller loaded");
		model.addAttribute("firstname", "bob").addAttribute("lastname", "kim");
		model.addAttribute("greeting", "hello world!");
		
		return "home";
	}
	
}
