package tn.esprit.spring.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Contract;
@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
	@Query("select c.user from Contract c")
    public List<Long> getUser();
	@Query("select c.id from Contract c")
    public List<Long> getIdC();
}

