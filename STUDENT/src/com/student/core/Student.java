package com.student.core;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private int age;
	private double grade;
	private Course course;
	private LocalDate admissionDate;
	private boolean active;
	
	
	
	
	
	
	
	public Student(int id, String name, int age, double grade, Course course, LocalDate admissionDate,
			boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.course = course;
		this.admissionDate = admissionDate;
		this.active = active;
	}
	public Student(String name) {
		this.name=name;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + ", course=" + course
				+ ", admissionDate=" + admissionDate + ", active=" + active + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
