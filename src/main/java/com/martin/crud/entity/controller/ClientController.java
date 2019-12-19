package com.martin.crud.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martin.crud.entity.service.InterfaceClientService;

import com.martin.crud.entity.models.Client;

@RestController
public class ClientController {

	@Autowired
	InterfaceClientService clientService;
	
	@GetMapping("/clients")
	public List<Client> getAllClients(){
		return clientService.getAll();
	}
	
	@GetMapping("/client/{id}")
	public Client getOne(@PathVariable(value = "id") int id){
		return clientService.get(id);
	}
	
	@PostMapping("/client")
	public void add(Client client){
		clientService.post(client);
	}
	
	@PutMapping("/client/{id}")
	public void update(Client client,@PathVariable(value = "id") int id){
		clientService.put(client, id);
	}
	
	@DeleteMapping("/client/{id}")
	public void delete(@PathVariable(value = "id") int id){
		clientService.delete(id);
	}

	
	
}
