package tn.esprit.spring.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tn.esprit.spring.entities.User;
@Entity
public class Contract   implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	@Enumerated(EnumType.STRING)
	private ContractType contractType;
	


	private Long idProducut;

	

	private Long price;

	
	@Temporal(TemporalType.DATE)
	private Date dateContrat;
	
	@Temporal(TemporalType.DATE)
	private Date dateStart;
	
	@Temporal(TemporalType.DATE)
	private Date dateEnd;
	
	@ManyToOne(cascade=CascadeType.ALL)
	User user;
	
	
	
	
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}

	public Long getIdProducut() {
		return idProducut;
	}

	public void setIdProducut(Long idProducut) {
		this.idProducut = idProducut;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	/////////////////////////////////////////////////////////////////////////
	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(Long id, ContractType contractType, Long idProducut, Long price, Date dateContrat, Date dateStart,
			Date dateEnd, User user) {
		super();
		this.id = id;
		this.contractType = contractType;
		this.idProducut = idProducut;
		this.price = price;
		this.dateContrat = dateContrat;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.user = user;
	}
	
	
	

}