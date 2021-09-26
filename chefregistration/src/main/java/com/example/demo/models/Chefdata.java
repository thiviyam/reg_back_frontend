

//// Ignore this table/////

package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
public class Chefdata implements Serializable
{
	@Id
	@GeneratedValue
	private int chefid;
	private String name;     
	private String address;
	private String city;
	private String state;
	private int  pincode;
	private long  phno;
	private String email;
    
	private String  username;
	private String  password;
	private String  rePassword;
    
    @OneToMany(mappedBy = "chefidd")
    private List<Kitchendata> kdata;
    
    
    
    
    public Chefdata() {}
    
    public Chefdata(String name, String address, String city, String state, int pincode, long phno,
			String email, String username, String password, String rePassword) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phno = phno;
		this.email = email;
		this.username = username;
		this.password = password;
		this.rePassword = rePassword;
	}



	public int getChefid() {
		return chefid;
	}

//	public void setChefid(int chefid) {
//		this.chefid = chefid;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}


//	public List<Kitchendata> getKdata() {
//		return kdata;
//	}
//
//	public void setKdata(List<Kitchendata> kdata) {
//		this.kdata = kdata;
//	}

	@Override
	public String toString() {
		return "Chefdata [chefid=" + chefid + ", name=" + name + ", address=" + address + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", phno=" + phno + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", rePassword=" + rePassword + ", kdata=" + kdata + "]";
	}
    
	
	
	
    
	
    
    
}
