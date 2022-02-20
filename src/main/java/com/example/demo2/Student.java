package com.example.demo2;

import javax.persistence.*;

@Entity
@Table (name = "students")
public class Student 
{
	@Id
	@Column(name = "roll_no")
	int roll_no;
	@Column(name = "name")
	String name;
	@Column(name = "department")
	String dept;
	
	public Student() {
	}
	public Student(int roll_no, String name, String dept) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.dept = dept;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
