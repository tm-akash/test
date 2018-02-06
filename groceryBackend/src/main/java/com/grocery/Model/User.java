package com.grocery.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name = "USER")
public class User implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="NAME")
	private String name;
	@Column(name="EMAILID")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	private String role;
	private Boolean enabled;
	/*@Column(name="ADDRESS")
	private String address;*/
	
/*	 public User() {
	    }
	 
	    public User(String name, String email, String address, String phone) {
	        this.name = name;
	        this.email = email;
	        this.address = address;
	        this.password = password;
	    }
	
		*/
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
/*	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}*/
	
	
}
