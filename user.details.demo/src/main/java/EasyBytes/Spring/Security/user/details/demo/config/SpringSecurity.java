package EasyBytes.Spring.Security.user.details.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import EasyBytes.Spring.Security.user.details.demo.service.CustomerServiceImpl;

@Configuration
@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter{

	
	@Bean
	public UserDetailsService userDetailsService(UserDetailsImple userDetailsImple) {
		return new MyUserDetailsService(userDetailsImple);
	}
	
	@Bean
	public UserDetailsService userDetailsService(CustomerServiceImpl customerServiceImpl) {
		return new MyUserDetailsService(customerServiceImpl);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
