package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("Header", "Registration Form");
	}
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		return "success";
	}
	
//	public String handleForm(@RequestParam("email") String userEmail,
//			@RequestParam("name") String userName,
//			@RequestParam("password") String userPassword,
//			Model model) {
//		System.out.println(userEmail);
//		
//		model.addAttribute("name",userName);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password", userPassword);
//		
//		return "success";
//	}
}
