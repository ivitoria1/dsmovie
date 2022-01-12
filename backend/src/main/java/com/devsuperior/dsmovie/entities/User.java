package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User implements Serializable {

	private static final long serialVersionUID = 9012843931021470654L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String email;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
