package com.arka.springwebRendering;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/save_name", method = RequestMethod.POST)
	public String save(HttpSession session, @RequestParam String name, @RequestParam String email) {
		session.setAttribute("name", name);
		session.setAttribute("email",email);
		return "welcome";
	}


}
