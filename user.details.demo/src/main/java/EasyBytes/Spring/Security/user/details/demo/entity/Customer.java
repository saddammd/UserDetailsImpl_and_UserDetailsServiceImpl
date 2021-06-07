package EasyBytes.Spring.Security.user.details.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String pass;
	private String roles;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String email, String pass, String roles) {
		super();
		this.email = email;
		this.pass = pass;
		this.roles = roles;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", pass=" + pass + ", roles=" + roles + "]";
	}
	
}
