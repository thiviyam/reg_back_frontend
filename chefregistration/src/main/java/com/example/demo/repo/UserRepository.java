package com.example.demo.repo;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
  List<User> findById(long Id);
  
  @Query("select COALESCE(id,0) from User where email = ?1")
  public Long checkloginemail(String email);
  
  @Query("select password from User where email = ?1")
  public String checkloginpwd(String email);
}