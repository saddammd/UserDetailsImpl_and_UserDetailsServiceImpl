package EasyBytes.Spring.Security.user.details.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class Home_Controller {

	//@GetMapping("/home")
	public String showHome() {
		
		return "This is home page";
	}
	
	//@GetMapping("/about")
	public String showAbout() {
		
		return "This is about page";
	}
	
	//@GetMapping("/account")
	public String showAccount() {
		
		return "This is account page";
	}
}
