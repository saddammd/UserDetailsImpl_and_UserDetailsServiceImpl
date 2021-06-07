package EasyBytes.Spring.Security.user.details.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import EasyBytes.Spring.Security.user.details.demo.entity.Customer;
import EasyBytes.Spring.Security.user.details.demo.service.CustomerServiceImpl;

public class MyUserDetailsService implements UserDetailsService {
	
	
	private CustomerServiceImpl customerServiceImpl;
	
	private UserDetailsImple userDetailsImple;
	
	@Autowired
	public MyUserDetailsService(UserDetailsImple userDetailsImple) {
		this.userDetailsImple = userDetailsImple;
	}
	
	
	@Autowired
	public MyUserDetailsService(CustomerServiceImpl customerServiceImpl) {
		this.customerServiceImpl = customerServiceImpl;
	}
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Customer findByEmail = customerServiceImpl.findByEmail(username);
		
		if(findByEmail==null) {
		throw new UsernameNotFoundException("Unable to found user with username" +username);	
		}
		
		return new UserDetailsImple(findByEmail);
	}

}
