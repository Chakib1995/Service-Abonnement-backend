package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import tn.esprit.spring.entities.Contract;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)	
	private Long id;   
	
	
	private String firstName;
	
	private String lastname;

	private Date dateNaissance;
	private String email;
	private String password ;
	
	
	

	public User(Long id, String firstName, String lastname, Date dateNaissance, String email, String password,
			Set<Contract> contract) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.password = password;
		this.contract = contract;
	}


	@OneToMany(cascade = CascadeType.ALL)
	private Set<Contract> contract;
	
	
	//////////////////////////////getters and setters///////////////////////////////////////////////////////////////////
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Set<Contract> getContract() {
		return contract;
	}
	public void setContract(Set<Contract> contract) {
		this.contract = contract;
	}
	//////////////////////////constr///////////////////////////////////////////
	

public User() {
		super();
		// TODO Auto-generated constructor stub
}
	
	
	
		
}
	
	