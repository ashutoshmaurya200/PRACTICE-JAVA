package com.student.Service;

import java.time.LocalDate;
import java.util.List;

import com.student.core.Course;
import com.student.core.Student;
import com.student.exception.MyException;

public class Validation {
	
	
	public static void validateDuplicate(String name,List<Student>list)throws MyException {
		Student newname= new Student(name);
		for(Student l: list) {
			if(list.contains(newname));
			throw new MyException("duplicate name");
		}
		
	}
	
	public static Course validateCourse(String course)throws MyException {
		
		
		try {
			Course c=Course.valueOf(course.toUpperCase());
			 return c;
		}catch(Exception e) {
			throw new MyException("course is invalid");
		}
	}
		
     public static LocalDate validateDate(String date) throws MyException{
			LocalDate d=LocalDate.parse(date);
			if(d.isAfter(LocalDate.now()))
				throw new MyException("invalid date");
			return d;
			
		}
     
     public static void validateAge(int age) throws MyException {
    	 if(age<18) {
    		 throw new MyException("invalid age");
    	 }
     }
	    
		
		
		
	

}
