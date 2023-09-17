package com.authentication;

import java.util.*;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.model.*;

public class ValidateUser {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // creating session object
        try (Session session = factory.openSession()) {

            // creating transaction object
            Transaction t = session.beginTransaction();

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("Enter username ");
                String user = sc.nextLine();
                System.out.println("Enter Password ");
                String pass = sc.nextLine();

                // Using HQL query with parameters
                String hql = "from Login where username = :a and password = :b";
                Query<Login> query = session.createQuery(hql, Login.class);
                query.setParameter("a", user);
                query.setParameter("b", pass);

                List<Login> result = query.list();

                if (result.isEmpty()) {
                    System.out.println("Invalid username or password");
                } else {
                    System.out.println("Login successfully!....");
                    break; // Exit the loop if login is successful
                }

                System.out.println("Do you want to retry? (y/n)");
                char choice = sc.next().charAt(0);
                if (choice == 'y' || choice == 'Y') {
                    sc.nextLine(); // Consume the newline character
                } else {
                    break;
                }
            }
            t.commit();
            session.close();
            showMenu(); // Display the menu after successful login
        }
    }

    private static void showMenu() {
        System.out.println("Employee Performance");
        System.out.println("1. Manager");
        System.out.println("2. Employee Evaluation");
        System.out.println("3. Gender");
        System.out.println("4. Rating");
        System.out.println("5. Hibernate");
        System.out.println("6. DoB:");
        System.out.println("7. Phone No:");
        System.out.println("8. Aadhar No:");
    }
}