package com.shoe.service;
import com.shoe.exceptions.*;
import com.shoe.core.*;

public class Validation {
	
	public static void validateRating(int rating)throws ShoeException {
		if(rating<0 && rating>10)
			throw new ShoeException("invalid rating");
		
	}
	
	public static void validateName(String name)throws ShoeException {
		if(name.length()<3 && name.length()>20) {
			throw new ShoeException("invalid name length");
			
		}
	}
	
	public static Shoe_type validateShoeType(String Shoe)throws ShoeException , IllegalArgumentException {
		
		Shoe_type s = Shoe_type.valueOf(Shoe.toUpperCase());
		return s;
		
	}
	
	

}
