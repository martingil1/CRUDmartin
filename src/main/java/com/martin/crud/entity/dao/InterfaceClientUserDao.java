package com.martin.crud.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.martin.crud.entity.models.ClientUser;

public interface InterfaceClientUserDao extends CrudRepository<ClientUser, Integer> {

}
