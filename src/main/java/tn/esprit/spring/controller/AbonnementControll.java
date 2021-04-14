package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Abonnement;
import tn.esprit.spring.entities.Contract;

import tn.esprit.spring.repository.ContractRepository;
import tn.esprit.spring.services.AbonnementService;

@RestController
@RequestMapping("/abonnement")
public class AbonnementControll {
@Autowired
AbonnementService abonnementService;
@Autowired
ContractRepository contractRepository;

@GetMapping("/abonnement")
public List<Abonnement> abonnement(){
	return abonnementService.abonnService();
}
@PostMapping("/addContracts")
public String addContract(@RequestBody Contract c) {
	contractRepository.save(c);
	System.out.println(c.getPrice());
	

	return "contract saved";
}

@GetMapping("/Contracts")
public List<Contract> showContracts(){
	return contractRepository.findAll();
}
}
