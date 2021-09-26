

////// this is for ALLTABLE DATA /////////////////////////////

package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Alltable;

public interface Cheftable extends JpaRepository<Alltable, Integer>
{
	  @Query("select email from Alltable where chefid = ?1")
      public String getchefid(int id);
	  
	  @Query("select COALESCE(chefid,0) from Alltable where email = ?1")
	  public Integer checkloginemail(String email);
	  
	  @Query("select password from Alltable where email = ?1")
	  public String checkloginpwd(String email);
}
