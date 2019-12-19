package com.martin.crud.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.crud.entity.dao.InterfaceUserDao;
import com.martin.crud.entity.models.User;
import com.martin.crud.entity.service.InterfaceUserService;
@Service
public class ImplementarUserService implements InterfaceUserService{

	@Autowired
	private InterfaceUserDao userDao;
	@Override
	public User get(int id)throws IllegalArgumentException {
		return userDao.findById(id).get();
	}

	@Override
	public List<User> getAll() throws IllegalArgumentException{
		return (List<User>) userDao.findAll();
	}

	@Override
	public void post(User user) {
		userDao.save(user);
		
	}

	@Override
	public void put(User user,int id) throws IllegalArgumentException{
		userDao.findById(id).ifPresent((x)->{//se actualiza solo si existe el usuario
			user.setId(id);
			userDao.save(user);
		});
		
	}

	@Override
	public void delete(int id) throws IllegalArgumentException {
		userDao.deleteById(id);
		
	}
	
	public boolean existsById(int id) throws IllegalArgumentException {
		return userDao.existsById(id);
	}

	

}
