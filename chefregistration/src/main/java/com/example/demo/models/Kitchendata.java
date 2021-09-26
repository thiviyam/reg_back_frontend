

////// IGNORE THIS //////////////

package com.example.demo.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Kitchendata implements Serializable
{
	@Id
	@GeneratedValue
	int kitchenid;
	String kname ;
	String email;
	String  preference;
    String  promises;
    
//    @Column(nullable = true, length = 64)
//    String kitchenpht;
//    
//    @Lob 
//    byte[] fssai;
    
    @ManyToOne
    @JoinColumn(name = "chefid") 
    public Chefdata chefidd;
    
    
    public Kitchendata() {}
    
    public Kitchendata( String kname, String preference, String promises) {
		super();
		this.kname = kname;
		this.preference = preference;
		this.promises = promises;
//		this.kitchenpht = kitchenpht;
//		this.fssai = fssai;
	}

//	public String getKitchenpht() {
//		return kitchenpht;
//	}
//
//	public void setKitchenpht(String kitchenpht) {
//		this.kitchenpht = kitchenpht;
//	}
//
//	public byte[] getFssai() {
//		return fssai;
//	}
//
//	public void setFssai(byte[] fssai) {
//		this.fssai = fssai;
//	}


    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getKitchenid() {
		return kitchenid;
	}

//	public int getChefidd() {
//		return chefidd.getChefid();
//	}
//
//	public void setChefidd(Chefdata chefidd) {
//		chefidd = new Chefdata();
//		
//	}

	public void setKitchenid(int kitchenid) {
		this.kitchenid = kitchenid;
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
		return "Kitchendata [kitchenid=" + kitchenid + ", kname=" + kname + ", preference=" + preference + ", promises="
				+ promises + ", chefid=" + chefidd + "]";
	}
    
    
    
}
