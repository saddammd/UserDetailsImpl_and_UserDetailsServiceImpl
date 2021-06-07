package EasyBytes.Spring.Security.user.details.demo.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import EasyBytes.Spring.Security.user.details.demo.entity.Customer;

public class UserDetailsImple implements UserDetails {

	
	public Customer customer;
	
	public UserDetailsImple(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority(customer.getRoles()));
		return roles;
		
	}

	@Override
	public String getPassword() {
		return customer.getPass();
	}

	@Override
	public String getUsername() {
		return customer.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
