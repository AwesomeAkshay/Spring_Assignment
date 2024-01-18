package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface ProductRepo extends JpaRepository<Products, Integer>{

	 
}
