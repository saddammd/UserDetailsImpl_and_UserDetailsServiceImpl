package EasyBytes.Spring.Security.user.details.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EasyBytes.Spring.Security.user.details.demo.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	public Customer findByEmail(String email);

}
