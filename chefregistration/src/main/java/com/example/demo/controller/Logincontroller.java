package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.Cheftable;
import com.example.demo.repo.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("")
public class Logincontroller 
{

	@Autowired
	Cheftable dao;
	
	@Autowired
	UserRepository udao;
	
	
	@PostMapping("/")
	@ResponseBody
	public String Logincheck(String email, String password)
	{
		
		if(dao.checkloginemail(email) != null && dao.checkloginemail(email) != 0)
		{
			if(dao.checkloginpwd(email).equals(password))
			{
				System.out.println("Welcome Chef");
				return "Welcome Chef";
			}
			else if(udao.checkloginpwd(email).equals(password))
			{
				System.out.println("Welcome User");
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
