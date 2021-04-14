package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Abonnement;
import tn.esprit.spring.entities.Contract;
import tn.esprit.spring.entities.ContractType;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.AbonnementRepository;
import tn.esprit.spring.repository.ContractRepository;
import tn.esprit.spring.repository.UserRepository;

@Service
public class AbonnementService  {
@Autowired
ContractRepository contractRepository ;

@Autowired
AbonnementRepository abonnementRepository ;

@Autowired
UserRepository userRepository ;

@Autowired
MailService mail;

List<Long> list = new ArrayList<Long>();
List<Long> listc = new ArrayList<Long>();
List<Abonnement> listab = new ArrayList<Abonnement>();





public int score(User user) {
	int score =0;
	for (Contract contrat: user.getContract()) {
		
		if(contrat.getContractType()==ContractType.VENTE) {
			score+=contrat.getPrice()*10;
						}
		else if(contrat.getContractType()==ContractType.LOUER)
		{
			score+=contrat.getPrice()*3;
		}
		else if(contrat.getContractType()==ContractType.GARANT) {
			score+=contrat.getPrice();
		}

}
		return score;}


public boolean verify (Long i , List<Long> l) {
	boolean test = false ;
	for (Long j : l) {
		if(i==j) {
			test = true;
		}
	}
	return test ;
}



public List<Abonnement> abonnService() {
	User u = new User();
	Abonnement ab = new Abonnement();
	List<Long> list = new ArrayList<Long>();
	List<Long> listc = new ArrayList<Long>();
	listc= contractRepository.getIdC();
	list= userRepository.getIds();
	List<Abonnement> listab = new ArrayList<Abonnement>();
	System.out.println(listc);
	
	

	
	for (Long i : list) {
		   ab = new Abonnement();
      		if(verify(i,listc)) {
      			
      			
      			
      		

                 u= userRepository.getOne(i);
                 ab.setFirstName(u.getFirstName());
                 ab.setLastname(u.getLastname());
         
                 
                 abonnementRepository.save(ab);
                
                 
                 
                 	if(score(u)>200000000){
                 		ab.setTypeCard("platinum");
                 		abonnementRepository.save(ab);
                 		mail.sendEmail1(u.getEmail(), u.getFirstName(),u.getLastname());
                 	}
                 	else if(score(u)>50000000) {
                 		ab.setTypeCard("gold");
                 		abonnementRepository.save(ab);
                 		mail.sendEmail2(u.getEmail(), u.getFirstName(),u.getLastname());
                 	}
                 	else {
                 		ab.setTypeCard("silver");
                 		abonnementRepository.save(ab);
                 		mail.sendEmail3(u.getEmail(), u.getFirstName(),u.getLastname());
                 		
                 	}
                 	}
      		else {
      			System.out.println(i);
      			System.out.println("not exist");
      			 u= userRepository.getOne(i);
      			ab.setFirstName(u.getFirstName());
                ab.setLastname(u.getLastname());
                ab.setTypeCard("iron");
                //alert
                System.out.println(ab.getFirstName());
                abonnementRepository.save(ab);
                mail.sendEmail4(u.getEmail(), u.getFirstName(),u.getLastname());
                //ab = new Abonnement();
      		}
      		System.out.println("end traitement");
      		listab.add(ab);
	}
	return listab;
}





      			
      			
      			
    





@Override
public String toString() {
	return "AbonnementService []";
}
}
