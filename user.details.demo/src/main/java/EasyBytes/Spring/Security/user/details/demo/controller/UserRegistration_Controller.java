package EasyBytes.Spring.Security.user.details.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import EasyBytes.Spring.Security.user.details.demo.entity.Customer;
import EasyBytes.Spring.Security.user.details.demo.service.CustomerService;

@Controller
public class UserRegistration_Controller {
	
	@Autowired
	CustomerService customerService;

	@RequestMapping("/register")
	public String register(@ModelAttribute("cust") Customer customer) {
		
		return "register";
	}
	
	@RequestMapping("/hello")
	public String register() {
		
		return "hello";
	}
	
	@PostMapping("register/save")
	public String saveUser(@ModelAttribute("cust") Customer customer) {
	customer.setRoles("user");	
		
	customerService.save(customer);
	return "hello";
		
		
		
	}
}
