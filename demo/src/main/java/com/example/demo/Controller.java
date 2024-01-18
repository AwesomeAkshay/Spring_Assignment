package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping(path="/demo")
public class Controller {
	
	@Autowired
	ProductRepo pr;
	
	@RequestMapping(path="/add")
	public @ResponseBody String AddAllData() {
		
		Products p = new Products("chipset", 677, 6466000);
		Products p1 = new Products("ram",23, 670700);
		Products p2 = new Products("harddisk", 50, 15065700);
		
		
		pr.save(p);
		pr.save(p1);
		pr.save(p2);
		System.out.println("saved");
		
		return "Saved";
	}
	
	 @RequestMapping(path="/all")
	  public @ResponseBody Iterable<Products> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return pr.findAll();
	  }
	 
	 @RequestMapping(path="/find")
	  public @ResponseBody Optional<Products> findProduct() {
	    // This returns a JSON or XML with the users
	    return pr.findById(2);
	  }
	 
	  
}
