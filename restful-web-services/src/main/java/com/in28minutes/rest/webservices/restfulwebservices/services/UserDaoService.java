package com.in28minutes.rest.webservices.restfulwebservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.entities.User;

// @Repository
@Component
public class UserDaoService {
	
	private static int usersCount = 3;
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(1, "Eve", new Date()));
		users.add(new User(1, "Jack", new Date()));
	}

	public List<User> findAll() {
		return users;
	}
	
	public User saveUser(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
}