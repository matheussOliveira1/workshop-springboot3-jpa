package com.springstudy.springproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springstudy.springproject.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Matheus", "matheus@gmail.com", "12345678900", "senhadomatheus");
		return ResponseEntity.ok().body(u);
	}
	
}
