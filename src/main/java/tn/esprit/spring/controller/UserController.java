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

import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserServiceImpl;


@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	IUserServiceImpl iuserServiceImpl;
	
	@GetMapping("/getAllUser")
    @ResponseBody
	public List<User> getAllEmployes() {
		
		return iuserServiceImpl.getAllUser();
	}
	
	
	@PostMapping("/addUser")
	@ResponseBody
	public User addUser(@RequestBody User user){
		iuserServiceImpl.addUser(user);
		return user;
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	@ResponseBody 
	public void deleteUserByID(@PathVariable("userId") Long userId ){
		iuserServiceImpl.deleteUserByID(userId);
	}
	
	@PutMapping("/updateUser")
	@ResponseBody 
	public User updateUser(@RequestBody User user){
		return iuserServiceImpl.updateUser(user);
	}
	
	@GetMapping("/getAllUserByNames")
	@ResponseBody
	public List<String> getAllUserByNames(){
		return iuserServiceImpl.getAllUserByNames();
	}
	@PostMapping("/getUserByName")
    @ResponseBody
	public List<User> getUserByName(@RequestBody String firstname) {
		
		return iuserServiceImpl.getUserByNames(firstname);
	}
}
