package com.movie.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.movie.Exceptions.MovieException;
import com.movie.core.Movie;
import com.movie.core.Type;

public class Validations {
	
	public static void validateMoviesNames(String name,List<Movie>list)throws MovieException {
		Movie newmovie=new Movie(name);
		for(Movie m:list) {
			if(list.contains(newmovie)) {
				throw new MovieException("duplicate movie present");
			}
		}
		
	}
	
	public static Type validateType(String type) throws MovieException{
	try {	
	Type t= Type.valueOf(type.toUpperCase());
	return t;
	}catch(Exception e) {
		throw new MovieException("invalid movie type");
	}
	}
	
	public static LocalDate validateDate(String date)throws MovieException {
		 
		LocalDate d=LocalDate.parse(date);
		
		if(d.isAfter(LocalDate.now())) {
			throw new MovieException("invalid date");
			
		}
		return d;
		
		
	}


}
