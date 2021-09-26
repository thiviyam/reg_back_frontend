package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Menudata;

public interface Menutable extends JpaRepository<Menudata, Long>
{
	@Query("select foodId from Menudata where foodName = ?1")
    public long getFoodid(String fname);
	
	@Query("from Menudata where chefId = ?1")
    public List<Menudata> getAllFood(int chefid);
	
	@Modifying
	@Transactional
	@Query("update Menudata set foodName = ?1, foodType = ?2, foodPeriod = ?3, foodPrice = ?4 where foodId = ?5")
	public void setUserInfoById(String foodName, String foodType, int foodPeriod, int foodPrice ,long foodId);

	
	
}
