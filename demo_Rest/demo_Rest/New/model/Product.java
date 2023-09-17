package com.example.demo_Rest.New.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	
	@Id
	private String prd_id;
	private String prd_description;
	private String Batchcode;
	private String manufacture_date;
	public String getPrd_id() {
		return prd_id;
	}
	public void setPrd_id(String prd_id) {
		this.prd_id = prd_id;
	}
	public String getPrd_description() {
		return prd_description;
	}
	public void setPrd_description(String prd_description) {
		this.prd_description = prd_description;
	}
	public String getBatchcode() {
		return Batchcode;
	}
	public void setBatchcode(String batchcode) {
		Batchcode = batchcode;
	}
	public String getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public Product(String prd_id, String prd_description, String batchcode, String manufacture_date) {
		super();
		this.prd_id = prd_id;
		this.prd_description = prd_description;
		Batchcode = batchcode;
		this.manufacture_date = manufacture_date;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
