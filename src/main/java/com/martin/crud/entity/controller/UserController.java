package com.martin.crud.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martin.crud.entity.models.User;
import com.martin.crud.entity.service.InterfaceUserService;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	InterfaceUserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAll();
	}

	@GetMapping("/user/{id}") // las llave es para avisarle qe usuario es
	public User getOne(@PathVariable(value = "id") int id) {// pathvariable
		// indica que un parámetro de método debe estar vinculado a una variable
		// de plantilla URI.
		return userService.get(id);
	}
	
	
	@PostMapping("/user")
	public void add(User user) {
		userService.post(user);
	}

	@PutMapping("/user/{id}")
	public void update(User user, @PathVariable(value = "id") int id) {
		userService.put(user, id);
	}

	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		userService.delete(id);
	}
	
	@Query("/user/{id}")
	public boolean exists(@PathVariable(value = "id") int id) {
		return userService.existsById(id);
	}
	
}