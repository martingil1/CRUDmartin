package com.martin.crud.entity.service;

import java.util.List;

import com.martin.crud.entity.models.User;

public interface InterfaceUserService {

	public User get(int id);//traer un usuario por su id
	public List<User> getAll();//traer todos los usuarios
	public void post(User user);//agregar
	public void put(User user,int id);//modificar
	public void delete(int id);// eliminar
	public boolean existsById(int id);
	
	
}
