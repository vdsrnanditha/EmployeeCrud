package com.example.sqlcon.entity;
import jakarta.persistence.*;
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="emp_name")
	private String studentname;
	@Column
	private String course;
	@Column
	private int fee;
	public Employee()
	{
		
	}
	public Employee(String studentname, String course, int fee) {
		super();
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
}
