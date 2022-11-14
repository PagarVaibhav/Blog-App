package com.VaibhavIT.blog.Services;

import java.util.List;

import com.VaibhavIT.blog.Payloads.UserDTO;

public interface UserService {

	UserDTO createUser(UserDTO userDto);
	
	UserDTO updateUser(UserDTO userDto , Integer userId);
	
	UserDTO getUserById(Integer userId);
	
	List<UserDTO> getAllUsers();
	
	void deleteUser(Integer userId);
}
