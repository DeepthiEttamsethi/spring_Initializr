package com.anudip.Students.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anudip.Students.Model.*;

@RestController
@RequestMapping("/Student")
public class StudentAPI {
	
	
	Student student;
	
	@GetMapping("{Id}")
	public Student getStudentById(String Id)
	{
		return student;
				//new Student("s1", "Student1", "course1", "xxx");
	}
	
	@PostMapping
	public String CreateStudent(@RequestBody Student student)
	{
		this.student= student;
		return "student Created successfully";
	}
	@PutMapping
	public String UpdateStudent(@RequestBody Student student)
	{
		this.student= student;
		return "student updated successfully";
	}
	
	@DeleteMapping("{Id}")
	public String DeleteStudent(String Id)
	{
		this.student= null;
		return "student deleted successfully";
	}
}