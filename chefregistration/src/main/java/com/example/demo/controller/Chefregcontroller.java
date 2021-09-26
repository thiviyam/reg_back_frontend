package com.example.demo.controller;

import java.awt.Image;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.models.Alltable;
import com.example.demo.models.Chefdata;
import com.example.demo.models.Kitchendata;
import com.example.demo.repo.Cheftable;
import com.example.demo.repo.Kitchentable;
import com.example.demo.repo.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("form/")
public class Chefregcontroller
{
	@Autowired
	Cheftable dao;
	
	@Autowired
	UserRepository udao;
	
	int id;
	
//	@PostMapping("personalinfo")
//	public RedirectView chef( Alltable all ,@RequestParam("kitchenpht") MultipartFile multipartFile) throws IOException
//	{
//		
////		dao.save(all);
////		System.out.println(all);
////		id = all.getCheifid();
////		System.out.println(dao.getchefid(all.getCheifid()));
//		System.out.println("hiii");
//		 String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//		 System.out.println(fileName);
//		 all.setKitchenpht(fileName);
//	        
//		 Alltable savedUser = dao.save(all);
//	        
//	        String uploadDir = "C:\\" + savedUser.getCheifid();
//	 
//	        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//	        
//	    return new RedirectView("/personalinfo", true);
//		
//		
//		
////		Alltable dbImage = new Alltable();
////        dbImage.setName(multipartFile.getName());
////        dbImage.setKitchenpht(multipartFile.getBytes());
////
////        return dao.save(dbImage).getCheifid();
//	}
	
	
	@PostMapping("personalinfo")
	public void chef(@RequestBody Alltable all) throws IOException
	{
		
		dao.save(all);
		System.out.println(all);
		id = all.getCheifid();
		System.out.println(dao.getchefid(all.getCheifid()));
		
	}
	
	@GetMapping("gettingresp")
	public int chefmenu()
	{
		String ids = dao.getchefid(id);
		System.out.println("hii");
		return id;
	}
	
}

















// String name, String address,String city, String state, Integer pincode, Long phno, String email, String kname, String preference, String promise, String username, String password, String rePassword
//Chefdata chefd = new Chefdata();
//Kitchendata kdata = new Kitchendata();
//chefd.setName(name);
//chefd.setAddress(address);
//chefd.setCity(city);
//chefd.setState(state);
//chefd.setPincode(pincode);
//chefd.setPhno(phno);
//chefd.setEmail(email);
//chefd.setUsername(username);
//chefd.setPassword(rePassword);
//chefd.setRePassword(rePassword);
//
//kdata.setKname(kname);
//kdata.setPreference(preference);
//kdata.setPromises(promise);