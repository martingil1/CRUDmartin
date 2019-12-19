package com.martin.crud.entity.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Integer id;
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	@Column(name = "surname", nullable = false, length = 50)
	private String surname;
	@Column(name = "license", nullable = false, length = 50)
	private String license;
	@Column(name = "phone", nullable = false, length = 30)
	private String phone;
	@Column(name = "mail", nullable = false, length = 40)
	private String mail;
	@Column(name = "specialty", nullable = false, length = 50)
	private String speciality;
	@Column(name = "rate", nullable = false, scale = 2)
	private Float rate;
	@Column(name = "adress", nullable = false, length = 50)
	private String adress;
	@Column(name = "photo")
	@Lob()
	@Basic(optional = true, fetch = FetchType.LAZY)
	private byte[] photo;

	// contructores vacio y con parametros
	public User() {
	}

	public User(String name, String surname, String license, String phone, String mail, String speciality, Float rate,
			String adress, byte[] photo) {
		super();
		this.name = name;
		this.surname = surname;
		this.license = license;
		this.phone = phone;
		this.mail = mail;
		this.speciality = speciality;
		this.rate = rate;
		this.adress = adress;
		this.photo = photo;
	}
	
	// getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	//toString
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", license=" + license + ", phone="
				+ phone + ", mail=" + mail + ", speciality=" + speciality + ", rate=" + rate + ", adress=" + adress
				+ "]";
	}

	

}
