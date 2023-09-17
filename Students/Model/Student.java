package com.anudip.Students.Model;

public class Student {
	
	private String Id;
	private String sname;
	private String course;
	private String average;
	
	public Student(String id, String sname, String course, String average) {
		super();
		this.Id = id;
		this.sname = sname;
		this.course = course;
		this.average = average;
	}
	public Student() {
		super();
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAverage() {
		return average;
	}
	public void setAverage(String average) {
		this.average = average;
	}
}
