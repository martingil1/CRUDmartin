package com.martin.crud.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.crud.entity.dao.InterfaceClientUserDao;
import com.martin.crud.entity.models.ClientUser;
@Service
public class ImplementarClientUserService implements InterfaceClientUserService{

	@Autowired
	InterfaceClientUserDao clientUserDao;

	@Override
	public ClientUser get(int id) {
		return clientUserDao.findById(id).get();
	}

	@Override
	public List<ClientUser> getAll() {
		return (List<ClientUser>) clientUserDao.findAll();
	}

	@Override
	public void post(ClientUser clientuser) {
		clientUserDao.save(clientuser);
	}

	@Override
	public void put(ClientUser clientuser, int id) {
		clientUserDao.findById(id).ifPresent((x)->{
			clientuser.setId(id);
			clientUserDao.save(clientuser);
		});
	}

	@Override
	public void delete(int id) {
		clientUserDao.deleteById(id);
	}

	
	
	

}
