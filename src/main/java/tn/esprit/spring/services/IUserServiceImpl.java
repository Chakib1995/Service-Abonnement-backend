package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.User;

public interface IUserServiceImpl {

	List<User> getAllUser();
	public Long addUser(User user);
	public void deleteUserByID(Long userID );
	public User updateUser(User user);
	List<User> getUserByNames(String firstName);
	List<String> getAllUserByNames();
}
