package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(HttpServletRequest req) {
		String email = req.getParameter("email");
		System.out.println(email);
		return "";
	}
}
