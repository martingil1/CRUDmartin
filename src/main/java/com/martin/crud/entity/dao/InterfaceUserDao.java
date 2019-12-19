package com.martin.crud.entity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.martin.crud.entity.models.User;
@Repository
public interface InterfaceUserDao extends CrudRepository<User, Integer>{//te viene por defecto los metodos del crud {

}  

	
	


