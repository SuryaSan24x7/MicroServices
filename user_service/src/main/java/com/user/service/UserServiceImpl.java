package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
			new User(1001L,"Suraj","1234567890"),
			new User(1002L,"Ravi","1234512345"),
			new User(1003L,"Aditya","1234554321"),
			new User(1004L,"Bhaskar","1231231230")
			);
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user ->user.getUserId().equals(id)).findAny().orElse(null);
	}
}
