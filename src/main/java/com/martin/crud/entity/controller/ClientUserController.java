package com.martin.crud.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martin.crud.entity.models.ClientUser;
import com.martin.crud.entity.service.InterfaceClientUserService;

@RestController
public class ClientUserController {

	@Autowired
	InterfaceClientUserService clientUserService;
	
	@GetMapping("/clientusers")
	public List<ClientUser> getAllUsers() {
		return clientUserService.getAll();
	}

	@GetMapping("/clientuser/{id}")
	public ClientUser getOne(@PathVariable(value = "id") int id) {
		return clientUserService.get(id);
	}

	@PostMapping("/clientuser")
	public void add(ClientUser clientuser) {
		clientUserService.post(clientuser);
	}

	@PutMapping("/clientuser/{id}")
	public void update(ClientUser clientuser, @PathVariable(value = "id") int id) {
		clientUserService.put(clientuser, id);
	}

	@DeleteMapping("/clientuser/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		clientUserService.delete(id);
	}
	
}
