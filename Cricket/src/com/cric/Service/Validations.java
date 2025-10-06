package com.cric.Service;

import java.util.List;

import com.cric.Exceptions.MyException;
import com.cric.core.Cricket;

public class Validations {
	
	
	public static void validateAge(int age)throws MyException {
		if(age<18)
			throw new MyException("invalid age");
	}
	
	public static void validatename(String name,List<Cricket>list) throws MyException {
		for(Cricket c:list) {
		if(c.getName().equals(name)) {
			throw new MyException("duplicate name");
		}
		}
	}
	
	public static void validateEmail(String email)throws MyException {
		String emailreg = "^[a-z][a-z0-9._-]*@[a-z]+\\.(com|org|net)$";
		if(!email.matches(emailreg)) {
			throw new MyException("Invalid email");
		}
	}
	
	public static void validateRating(int rating)throws MyException{
		if(rating<0)
			throw new MyException("invalid rating");
	}
	

}
