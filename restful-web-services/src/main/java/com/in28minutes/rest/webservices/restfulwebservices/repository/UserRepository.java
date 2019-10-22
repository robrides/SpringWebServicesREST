package com.in28minutes.rest.webservices.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
