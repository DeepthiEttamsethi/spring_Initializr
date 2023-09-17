package com.example.demo_Rest.Newmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CloudVendor {
	
	String vendorid;
	String vendorname;
	String vendoraddress;
	String vendorphone;
	
	public CloudVendor() {
		super();
		// TODO Auto-generated constructor stub
	}	
	//Constructor with arguments
	public CloudVendor(String vendorid, String vendorname, String vendoraddress, String vendorphone) {
		super();
		this.vendorid = vendorid;
		this.vendorname = vendorname;
		this.vendoraddress = vendoraddress;
		this.vendorphone = vendorphone;
	}

	public String getVendorid() {
		return vendorid;
	}

	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getVendoraddress() {
		return vendoraddress;
	}

	public void setVendoraddress(String vendoraddress) {
		this.vendoraddress = vendoraddress;
	}

	public String getVendorphone() {
		return vendorphone;
	}

	public void setVendorphone(String vendorphone) {
		this.vendorphone = vendorphone;
	}
	

}
