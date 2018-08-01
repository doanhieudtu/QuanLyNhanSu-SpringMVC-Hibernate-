package com.quanlinhansu.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@Column(name="id" ,nullable=false, length=10)
	private String id;
	@Column(name="pass", nullable=false, length=8)
	private String pass;
	@Column(name="name", nullable=false, length=20)
	private String name;
	@Column(name="email", length=20)
	private String email;
	@Column(name="linkanh", length=20)
	private String linkanh;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLinkanh() {
		return linkanh;
	}
	public void setLinkanh(String linkanh) {
		this.linkanh = linkanh;
	}
	

}
