package com.martin.crud.entity.service;

import java.util.List;

import com.martin.crud.entity.models.ClientUser;

public interface InterfaceClientUserService {

	public ClientUser get(int id);
	public List<ClientUser> getAll();
	public void post(ClientUser clientuser);
	public void put(ClientUser clientuser,int id);
	public void delete(int id);
	
}
