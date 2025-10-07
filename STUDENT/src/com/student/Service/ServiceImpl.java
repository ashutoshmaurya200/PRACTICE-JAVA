package com.student.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.student.core.Course;
import com.student.core.Student;
import com.student.exception.MyException;

import static com.student.Service.Validation.validateAge;
import static com.student.Service.Validation.validateCourse;
import static com.student.Service.Validation.validateDate;
import static com.student.Service.Validation.validateDuplicate;


public class ServiceImpl implements Service {
	
	List<Student>student=new ArrayList(100);

	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AddDetail(int id, String name, int age, double grade, String course, String admissionDate,
			boolean active)throws MyException {
	    validateAge(age);
		Course validCourse=validateCourse(course);
	
		LocalDate validdate=validateDate(admissionDate);
		validateDuplicate(name, student);
		
		student.add(new Student( id,  name,  age,  grade, validCourse, validdate,
		 active));
		

	}

	@Override
	public void displayDetails() {
		
		for(Student s: student) {
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void removeStudentGrade() {
		
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getGrade()<4) {
				student.remove(i);
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void sortByAdmissionDate() {
		// TODO Auto-generated method stub
		student.stream().sorted((d1,d2)->d1.getAdmissionDate().compareTo(d2.getAdmissionDate())).forEach(System.out::println); 

	}

	@Override
	public void sortByName() {
		student.stream().sorted((n1,n2)->n1.getName().compareTo(n2.getName())).forEach(System.out::println);
		

	}

	@Override
	public void searchByCourse(String course) {
		Course c=Course.valueOf(course);
		for(Student s:student) {
			if(s.getCourse()==c) {
				System.out.println(s);
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void UpgradeGradeById() {
		// TODO Auto-generated method stub

	}

}
