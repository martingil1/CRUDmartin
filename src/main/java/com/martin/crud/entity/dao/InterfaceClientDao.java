package com.martin.crud.entity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.martin.crud.entity.models.Client;
@Repository
public interface InterfaceClientDao extends CrudRepository<Client, Integer>{

}
