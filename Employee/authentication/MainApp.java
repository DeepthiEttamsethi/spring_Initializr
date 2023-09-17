package com.authentication;

import java.util.*;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.*;

public class MainApp {
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		 Dao dao=new Dao();
	       dao.Login();
	       dao.InsertEmployeeDetails();
	       dao.InsertEvaluationDetails();
	       dao.updateDetails();
	       dao.deleteDetails(); 
	}}


