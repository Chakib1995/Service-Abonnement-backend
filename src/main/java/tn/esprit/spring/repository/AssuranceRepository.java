package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Assurance;

public interface AssuranceRepository extends JpaRepository<Assurance, Long> {

    @Query("SELECT name FROM Assurance")
    public List<String> getAllAssuranceByNames();
    @Query("SELECT b FROM Assurance b where b.name=:name")
    public List<Assurance> getAssuranceByNames(@Param("name")String name);
}