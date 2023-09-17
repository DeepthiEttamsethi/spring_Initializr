package com.model;

public class EmployeeDetails {
	   
	    private Long id;
	    private String firstname;
	    private String lastname;
	    private String email;
	    private String gender;
	    private String hireDate;
	    private String designation;
	    private Long salary;
	    private Long mobileno;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getHireDate() {
			return hireDate;
		}
		public void setHireDate(String hireDate) {
			this.hireDate = hireDate;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public Long getSalary() {
			return salary;
		}
		public void setSalary(Long salary) {
			this.salary = salary;
		}
		public Long getMobileno() {
			return mobileno;
		}
		public void setMobileno(Long mobileno) {
			this.mobileno = mobileno;
		}
		public EmployeeDetails(Long id, String firstname, String lastname, String email, String gender, String hireDate,
				String designation, Long salary, Long mobileno) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.gender = gender;
			this.hireDate = hireDate;
			this.designation = designation;
			this.salary = salary;
			this.mobileno = mobileno;
		}
		public EmployeeDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		    
}
