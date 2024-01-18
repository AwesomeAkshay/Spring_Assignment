package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "Products")
@Entity
public class Products {
	@Id
	@GeneratedValue
    private int Pid;
    private String Pname;
    private int NoOfProducts;
    private float Pprice;
    
	public Products() {
		super();
	}

	public Products(String pname, int noOfProducts, float pprice) {
		super();
		
		Pname = pname;
		NoOfProducts = noOfProducts;
		Pprice = pprice;
	}
	
	@Override
	public String toString() {
		return "Products [Pid=" + Pid + ", Pname=" + Pname + ", NoOfProducts=" + NoOfProducts + ", Pprice=" + Pprice
				+ "]";
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getNoOfProducts() {
		return NoOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		NoOfProducts = noOfProducts;
	}

}
