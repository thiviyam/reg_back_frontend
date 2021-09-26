package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Menudata;
import com.example.demo.repo.Cheftable;
import com.example.demo.repo.Menutable;
import com.example.demo.repo.UserRepository;

//@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class Menucontroller 
{
	@Autowired
	Menutable menudao;
	
	@Autowired
	Cheftable dao;
	
	@Autowired
	UserRepository udao;
	
	@RequestMapping("/menup")
	public String menupage() 
	{
		System.out.println("entered");
		return "menucard";
	}
	
	
	@RequestMapping("/menu")
	@ResponseBody
	public String menudata( Menudata m) 
	{
		menudao.save(m);
		long id = menudao.getFoodid(m.getFoodName());
		
		return "<h1> Your Food id is </h1>" + id;
	}
	
	@RequestMapping("/updatemenu")
	public String upmenudata() 
	{
		return "updatemenu";
	}
	
	
	@PutMapping("/updating_menu")
	@ResponseBody
	public String updatemenudata(long foodId, String foodName, String foodType, int foodPeriod, int foodPrice) 
	{		
		menudao.setUserInfoById(foodName, foodType, foodPeriod, foodPrice, foodId);
		return "<h1> Updated </h1>";
	}
	
	
	@GetMapping("/displaying")
	public List<Menudata> displaychefmenus(int chefid) 
	{
		List<Menudata> menu = menudao.getAllFood(chefid);
		return menu;
		
	}
	
	
	@DeleteMapping("/delete")
	@ResponseBody
	public String deletemenu(long foodId) 
	{
		menudao.deleteById(foodId);
		return "deleted";
	}
	
	
	
	@PostMapping("/login")
	@ResponseBody
	public String Logincheck(String email, String password)
	{
		
		if(dao.checkloginemail(email) != null && dao.checkloginemail(email) != 0)
		{
			if(dao.checkloginpwd(email).equals(password))
			{
				return "Welcome Chef";
			}
			else if(udao.checkloginpwd(email).equals(password))
			{
				return "Welcome User";
			}
			else
			{
				return "incorrect password or username User or Chef";
			}
		}
		else if(udao.checkloginemail(email) != null && udao.checkloginemail(email) != 0)
		{
			if(udao.checkloginpwd(email).equals(password))
			{
				return "Welcome User";
			}
			else
			{
				return "incorrect password or username User or Chef";
			}
		}
		
		return"wrong email";
	}

}
