


/////  IGNORE THIS INTERFACE/////////////


package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Chefdata;
import com.example.demo.models.Kitchendata;

public interface Kitchentable extends JpaRepository<Kitchendata, Integer>
{


}
