package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Abonnement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)	
	private Long id;   
	
	
	private String firstName;
	
	private String lastname;
	private String typeCard;
	///////////////////////////////////////////
	
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

	public String getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}

	public Abonnement(Long id, String firstName, String lastname, String typeCard) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.typeCard = typeCard;
	}

	public Abonnement() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	               //////////////////////////////////////
	
}
