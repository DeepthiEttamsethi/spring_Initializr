package com.example.demo_Rest.New.repository;

import java.util.List;
import com.example.demo_Rest.Newmodel.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClouldVendorRepository extends JpaRepository<CloudVendor, String> {

	List<CloudVendor> findByVendorName(String VendorName);
}
