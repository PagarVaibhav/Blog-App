package com.VaibhavIT.blog.Services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VaibhavIT.blog.Exceptions.*;
import com.VaibhavIT.blog.Entities.User;
import com.VaibhavIT.blog.Payloads.UserDTO;
import com.VaibhavIT.blog.Repositories.UserRepo;
import com.VaibhavIT.blog.Services.UserService;

@Service
public class USerServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDTO createUser(UserDTO userDto) {
		
		User user=this.dtoToUser(userDto);
		
		User saveedUser = this.userRepo.save(user);
		
		return this.usertoDto(saveedUser);
	}

	@Override
	public UserDTO updateUser(UserDTO userDto, Integer userId) {
		
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		
		User upadatedUser = this.userRepo.save(user);
		UserDTO userDto1 = this.usertoDto(upadatedUser);
		return userDto1;
	}

	@Override
	public UserDTO getUserById(Integer userId) {
		
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		
		
		return this.usertoDto(user);
	}

	@Override
	public List<UserDTO> getAllUsers() {
		
		List<User> users = this.userRepo.findAll();
		
		List<UserDTO> userDtos = users.stream()
				.map(user-> this.usertoDto(user)).collect(Collectors.toList());
		
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		
		this.userRepo.delete(user);
	}
	
	
	public User dtoToUser(UserDTO userDto) {
		
		User user=this.modelMapper.map(userDto, User.class);
		
		/*user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());*/
		
		return user;
	}

	public UserDTO usertoDto(User user) {
		
		UserDTO userDto=this.modelMapper.map(user, UserDTO.class);
		
		/*userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());*/
		
		return userDto;
	}
}
