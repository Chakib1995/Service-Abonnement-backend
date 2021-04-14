package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT firstName FROM User")
    public List<String> getAllUserByNames();	  
	 
    @Query("SELECT u FROM User u where u.firstName=:firstName")
    public List<User> getUserByNames(@Param("firstName")String firstName);

    
    @Query("select u.id from User u")
    public List<Long> getIds();
}
