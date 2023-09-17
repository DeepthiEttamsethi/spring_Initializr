package com.model;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();	

	
	public void Login() {
		// creating session object
        Session session = factory.openSession();

        // creating transaction object
        Transaction t = session.beginTransaction();
		 
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username ");
		String user = sc.nextLine();
		System.out.println("Enter Password ");
		String pass = sc.nextLine();
        
        
		 
		//Using from Clause  
		String hql = "from Login where username=:a and password=:b";
		Query query = session.createQuery(hql);
		query.setParameter("a", user);
		query.setParameter("b",pass);
		
		List result = query.list();
	
		
		
		if(result.isEmpty())
			System.out.println("Invalid username or password");
		else
			System.out.println("Login successfully....");
		
		t.commit();
        session.close();
		
	}
	public void InsertEmployeeDetails() {
		// creating session object
        Session session = factory.openSession();

        // creating transaction object
        Transaction t = session.beginTransaction();
		 

            String hql = "INSERT INTO EmployeeDetails (id,firstName, lastName, email, gender, hiredate, designation, salary, mobileno) " +
                "SELECT id, firstName, lastName, email, gender, hiredate, designation, salary, mobileno FROM EmployeeDetails";
            Query query = session.createQuery(hql);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);

     		System.out.println("inserting successfully....");
    		
    		t.commit();
            session.close();

	}

	public void InsertEvaluationDetails() {

		// creating session object
        Session session = factory.openSession();

        // creating transaction object
        Transaction t = session.beginTransaction();
		 

            String hql = "INSERT INTO EmployeeDetails (id, evaluationDate, rating, feedback) " +
                "SELECT id, evaluationDate, rating, feedback FROM EmployeeDetails";
            Query query = session.createQuery(hql);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);

     		System.out.println("inserting successfully....");
    		
    		t.commit();
            session.close();

		}

	public void updateDetails() {

		// creating session object
        Session session = factory.openSession();

        // creating transaction object
        Transaction t = session.beginTransaction();
		 

        String hql = "UPDATE EmployeeDetails set firstName = :firstName " + "WHERE id = :EmployeeId";
        Query query = session.createQuery(hql);
        query.setParameter("firstName", "potnuri");
        query.setParameter("EmployeeId", 1);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);

     		System.out.println("updating successfully....");
    		
    		t.commit();
            session.close();

	}
	public void deleteDetails() {

		// creating session object
        Session session = factory.openSession();

        // creating transaction object
        Transaction t = session.beginTransaction();
		 

        String hql = "DELETE FROM employee " + "WHERE id = :employeeId";
        Query query = session.createQuery(hql);
        query.setParameter("emplyeeId", 1);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);


     		System.out.println("deleting successfully....");
    		
    		t.commit();
            session.close();

	}
}