package com.martin.crud.entity.service;

import java.util.List;

import com.martin.crud.entity.models.Client;

public interface InterfaceClientService {

	public Client get(int id);
	public List<Client> getAll();
	public void post(Client client);
	public void put(Client client,int id);
	public void delete(int id);
	
	
}
