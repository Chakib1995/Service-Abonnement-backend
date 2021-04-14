package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_ASSURANCE_OFFERS")
public class AssuranceOffers implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAssuranceOffer")
	private Long idAssuranceOffer;
	
	@Column(name = "nameAssuranceOffer")
	private String nameAssuranceoffer;
	
	@Column(name = "descriptionAssuranceOffer")
	private String descriptionAssuranceOffer;
	
	@Temporal(TemporalType.DATE)
	private Date debutDate;
	
	@Temporal (TemporalType.DATE)
	private Date finDate;
	
				/* Association */
	
	@ManyToOne
	Assurance assurance;

		///////////////////////////////////////////////////				

	public AssuranceOffers() {
		super();
	}

	public AssuranceOffers(Long idAssuranceOffer, String nameAssuranceoffer, String descriptionAssuranceOffer, Date debutDate,
			Date finDate, Assurance assurance) {
		super();
		this.idAssuranceOffer = idAssuranceOffer;
		this.nameAssuranceoffer = nameAssuranceoffer;
		this.descriptionAssuranceOffer = descriptionAssuranceOffer;
		this.debutDate = debutDate;
		this.finDate = finDate;
		this.assurance = assurance;
		}

	public Long getIdAssuranceOffer() {
		return idAssuranceOffer;
	}

	public void setIdAssuranceOffer(Long idAssuranceOffer) {
		this.idAssuranceOffer = idAssuranceOffer;
	}

	public String getNameAssuranceoffer() {
		return nameAssuranceoffer;
	}

	public void setNameAssuranceoffer(String nameAssuranceoffer) {
		this.nameAssuranceoffer = nameAssuranceoffer;
	}

	public String getDescriptionAssuranceOffer() {
		return descriptionAssuranceOffer;
	}

	public void setDescriptionAssuranceOffer(String descriptionAssuranceOffer) {
		this.descriptionAssuranceOffer = descriptionAssuranceOffer;
	}

	public Date getDebutDate() {
		return debutDate;
	}

	public void setDebutDate(Date debutDate) {
		this.debutDate = debutDate;
	}

	public Date getFinDate() {
		return finDate;
	}

	public void setFinDate(Date finDate) {
		this.finDate = finDate;
	}

	public Assurance getAssurance() {
		return assurance;
	}

	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}
	
	
	
	
	
}
