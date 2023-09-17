package com.example.demo_Rest.New.service;

import java.util.List;
import com.example.demo_Rest.Newmodel.*;

public interface Cloudvendorservice {
	
	
	public String createCloudVendor(CloudVendor cloudvendor);
	public String updateCloudVendor(CloudVendor cloudvendor);
	public String deleteCloudVendor(CloudVendor cloudvendor);
	public CloudVendor getCloudVendor(String coludvendorId);
	public List<CloudVendor>getAllcloudvendorId();
	public List<CloudVendor>getByvendorName(String Vendorname);
	
}
