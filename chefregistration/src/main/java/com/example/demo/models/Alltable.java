package com.example.demo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Alltable 
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
	@Column(name = "email" , nullable = false,unique = true)
	private String email;
	private String  username;
	private String  password;
	private String  rePassword;
	private String kname ;
	private int  fssai;
	private String  preference;
	private String  promises;

//    @Column(nullable = true, length = 64)
//	private String kitchenpht;
    
    public Alltable() {}
    
	public Alltable(String name, String address, String city, String state, int pincode, long phno, String email,
			String username, String password, String rePassword, String kname, String preference, String promises) {
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
		this.kname = kname;
		this.preference = preference;
		this.promises = promises;
	}
	
//	public String getKitchenpht() {
//		return kitchenpht;
//	}
//
//	public void setKitchenpht(String kitchenpht) {
//		this.kitchenpht = kitchenpht;
//	}

	public int getFssai() {
		return fssai;
	}
	public void setFssai(int fssai) {
		this.fssai = fssai;
	}
	public int getCheifid() {
		return chefid;
	}
	
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
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getPreference() {
		return preference;
	}
	public void setPreference(String preference) {
		this.preference = preference;
	}
	public String getPromises() {
		return promises;
	}
	public void setPromises(String promises) {
		this.promises = promises;
	}
    
	@Override
	public String toString() {
		return "Alltable [chefid=" + chefid + ", name=" + name + ", address=" + address + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", phno=" + phno + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", rePassword=" + rePassword + ", kname=" + kname + ", preference="
				+ preference + ", promises=" + promises + "]";
	}

//	public Chefdata chef()
//	{		
//		Chefdata chefd = new Chefdata(getName(), getAddress(), getCity(), getState(), getPincode(), getPhno(), getEmail(), getUsername(), getPassword(), getRePassword() );
//		return chefd;
//	}
//	
//	public Kitchendata kitch()
//	{
//		Kitchendata kdata = new Kitchendata( getKname(), getPreference(), getPromises());
//		return kdata;
//	}
    
}
