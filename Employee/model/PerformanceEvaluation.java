package com.model;

import java.time.LocalDate;

public class PerformanceEvaluation {

	private Long id;
    private EmployeeDetails employee;
    private LocalDate evaluationDate;
    private int rating;
    private String feedback;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public EmployeeDetails getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
	}
	public LocalDate getEvaluationDate() {
		return evaluationDate;
	}
	public void setEvaluationDate(LocalDate evaluationDate) {
		this.evaluationDate = evaluationDate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public PerformanceEvaluation(Long id, EmployeeDetails employee, LocalDate evaluationDate, int rating,
			String feedback) {
		super();
		this.id = id;
		this.employee = employee;
		this.evaluationDate = evaluationDate;
		this.rating = rating;
		this.feedback = feedback;
	}
	public PerformanceEvaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
