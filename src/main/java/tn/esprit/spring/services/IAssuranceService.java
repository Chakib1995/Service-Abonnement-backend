package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Assurance;

public interface IAssuranceService {

	List<Assurance> getAllAssurances();
	public Long addAssurance(Assurance assurance);
	public void deleteAssuranceByID(Long assuranceID );
	public Assurance updateAssurance(Assurance assurance);

	List<Assurance> getAssuranceByNames(String name);
	List<String> getAllAssuranceByNames();
}