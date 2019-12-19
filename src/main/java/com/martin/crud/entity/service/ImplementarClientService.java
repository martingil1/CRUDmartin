package com.martin.crud.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.crud.entity.dao.InterfaceClientDao;
import com.martin.crud.entity.models.Client;
import com.martin.crud.entity.service.InterfaceClientService;
@Service
public class ImplementarClientService implements InterfaceClientService {

	@Autowired
	private InterfaceClientDao clientDao;

	@Override
	public Client get(int id) {
		return clientDao.findById(id).get();
	}

	@Override
	public List<Client> getAll() {
		return (List<Client>) clientDao.findAll();
	}

	@Override
	public void post(Client client) {
		clientDao.save(client);
	}

	@Override
	public void put(Client client, int id) {
		clientDao.findById(id).ifPresent((x) -> {
			client.setId(id);
			clientDao.save(client);
		});

	}

	@Override
	public void delete(int id) {
		clientDao.deleteById(id);
	}
	
	
	
	

}
