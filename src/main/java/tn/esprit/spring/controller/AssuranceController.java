package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Assurance;
import tn.esprit.spring.services.IAssuranceService;

@RestController
@RequestMapping("/Assurance")
public class AssuranceController {

	@Autowired
	IAssuranceService iassuranceService;
	
	
	@GetMapping("/getAllAssurances")
    @ResponseBody
	public List<Assurance> getAllAssurances() {
		
		return iassuranceService.getAllAssurances();
	}
	
	
	@PostMapping("/addAssurance")
	@ResponseBody
	public Assurance addAssurance(@RequestBody Assurance assurance){
		iassuranceService.addAssurance(assurance);
		return assurance;
	}
	
	
	@DeleteMapping("/deleteAssurance/{AssuranceId}")
	@ResponseBody 
	public void deleteAssuranceByID(@PathVariable("assuranceId") Long assuranceId ){
		iassuranceService.deleteAssuranceByID(assuranceId);
	}
	

	@PutMapping("/updateAssurance")
	@ResponseBody 
	public Assurance updateAssurance(@RequestBody Assurance assurance){
		return iassuranceService.updateAssurance(assurance);
	}
	

	@GetMapping("/getAllAssuranceByNames")
	@ResponseBody
	public List<String> getAllAssuranceByNames(){
		return iassuranceService.getAllAssuranceByNames();
	}
	@PostMapping("/getAssuranceByName")
    @ResponseBody
	public List<Assurance> getAssuranceByName(@RequestBody String name) {
		
		return iassuranceService.getAssuranceByNames(name);
	}
}
