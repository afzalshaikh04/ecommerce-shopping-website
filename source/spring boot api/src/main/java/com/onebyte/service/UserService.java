package com.onebyte.service;

import java.util.List;

import com.onebyte.exception.UserException;
import com.onebyte.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
