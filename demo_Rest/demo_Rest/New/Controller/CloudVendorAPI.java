package com.example.demo_Rest.New.Controller;

import java.util.EventObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo_Rest.Newmodel.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPI 
{
	
	public CloudVendorAPI(CloudVendor coludVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	
	public CloudVendorAPI() {
		super();
		
	}
	CloudVendor cloudVendorService;
	
	


}
