package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_ASSURANCE")
public class Assurance implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAssurance")
	private Long id;
	
	@Column(name = "nameAssurance")
	private String name;
	

	
	
		@OneToMany(cascade = CascadeType.ALL , fetch=FetchType.EAGER)//kifkif
		private Set<AssuranceOffers> assuranceOffer;
		
		
		
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Assurance() {
		super();
		// TODO Auto-generated constructor stub
	}
                     
	




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Set<AssuranceOffers> getAssuranceOffer() {
		return assuranceOffer;
	}

	public void setAssuranceOffer(Set<AssuranceOffers> assuranceOffer) {
		this.assuranceOffer = assuranceOffer;
	}

	
	
}

