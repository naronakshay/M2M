package com.Jpa.M2M.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Student_tab")

public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	private int age;
	private String  department;
	private String name;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="Students_courses",
		joinColumns= {
				@JoinColumn(name="student_id",referencedColumnName="id")
		},
		inverseJoinColumns= {
				@JoinColumn(name="course_id",referencedColumnName="id")

				
		})
	

	@JsonManagedReference
	private Set<Courses> courses;
	
	public Long getSid() {
		return id;
	}
	public void setSid(Long sid) {
		this.id = sid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
