package EasyBytes.Spring.Security.user.details.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EasyBytes.Spring.Security.user.details.demo.dao.CustomerDao;
import EasyBytes.Spring.Security.user.details.demo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	public CustomerDao customerDao;
	
	
	@Override
	public Customer findByEmail(String email) {
		
	   return customerDao.findByEmail(email);
	}


	@Override
	public void save(Customer customer) {
	 customerDao.save(customer);
		
	}

}
