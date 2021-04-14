package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;
@Service
public  class UserServiceImpl implements IUserServiceImpl{

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
		
	}

	@Override
	public Long addUser(User user) {
		userRepository.save(user);
		return user.getId();
	}

	@Override
	public void deleteUserByID(Long userID) {
		User user = userRepository.findById(userID).get();
		userRepository.delete(user);
		
	}

	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<String> getAllUserByNames() {
		
		return userRepository.getAllUserByNames();
	}
	@Override
	 public List<User> getUserByNames(String firstName){
		return userRepository.getUserByNames(firstName);
		
	}
	

}
