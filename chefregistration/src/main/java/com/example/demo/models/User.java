package com.example.demo.models;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "email" , nullable = false,unique = true)
	private String email;
	
	@Column(name = "Address")
	private String Address;
	
	@Column(name = "City")
	private String City;
	
	@Column(name = "State")
	private String State;
	
	@Column(name = "Pincode")
	private long pincode;
	
	@Column(name = "phone_no")
	private long phoneno;
	
	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "password")
	private String password;
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return user_name;
	}
	public void setUsername(String username) {
		this.user_name = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
