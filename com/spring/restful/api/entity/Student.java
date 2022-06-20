package com.spring.restful.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Stdname", nullable = false)
	private String sName;
	
	@Column(name = "Marks")
	private String Marks;
	
public Student() {
		
	}
	
	public Student(String sName, String Marks) {
		super();
		this.sName = sName;
		this.Marks = Marks;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getMarks() {
		return Marks;
	}
	public void setMarks(String Marks) {
		this.Marks = Marks;
	}
	
}
