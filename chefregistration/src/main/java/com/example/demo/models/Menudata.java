package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Menudata implements Serializable
{
	 @Id
	 @GeneratedValue
	 private long foodId;
     private String foodName;
     private String foodType;
     private int foodPeriod;
     private int foodPrice;
     private int chefId;  
     
     
     
     
     
     
    public Menudata() {}


	public Menudata(String foodName, String foodType, int foodPeriod, int foodPrice, int chefId) {
		super();
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodPeriod = foodPeriod;
		this.foodPrice = foodPrice;
		this.chefId = chefId;
	}




	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getFoodPeriod() {
		return foodPeriod;
	}
	public void setFoodPeriod(int foodPeriod) {
		this.foodPeriod = foodPeriod;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getChefId() {
		return chefId;
	}
	public void setChefId(int chefId) {
		this.chefId = chefId;
	}
     
     
}
