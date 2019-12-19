package com.martin.crud.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientuser")
public class ClientUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nro_caso")
	private Integer id;

	@Column(name = "id_client", nullable = false)
	private int client;
	@Column(name = "id_user", nullable = false)
	private int user;

	public ClientUser() {
	}
	
	

	public ClientUser(Integer id,int client, int user) {
		super();
		this.id = id;
		this.client = client;
		this.user = user;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

}
