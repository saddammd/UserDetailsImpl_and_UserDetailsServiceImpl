package EasyBytes.Spring.Security.user.details.demo.service;

import EasyBytes.Spring.Security.user.details.demo.entity.Customer;


public interface CustomerService {
	
	public Customer findByEmail(String email);

	public void save(Customer customer);

}
