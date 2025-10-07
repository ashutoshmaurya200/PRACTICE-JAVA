package com.movie.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.movie.Exceptions.MovieException;
import com.movie.core.Movie;
import com.movie.core.Type;

import static com.movie.service.Validations.validateDate;
import static com.movie.service.Validations.validateMoviesNames;
import static com.movie.service.Validations.validateType;


public class ServiceImpl implements Service {
	
	List<Movie> movie=new ArrayList <>(100);

	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addDetails(int id, String name, double rating, String releaseDate, boolean inCineama, String type)throws MovieException {
		LocalDate validDate = validateDate(releaseDate);
		validateMoviesNames(name, movie);
	    Type validType=validateType(type);
		
		movie.add(new Movie(id,name,rating,validDate,inCineama,validType));

	}

	@Override
	public void displayDetailslessthan5() {
		for(Movie m:movie) {
			if(m.getRating()>5) {
				System.out.println(m);
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMovies() {
		for(int i=0;i<movie.size();i++) {
			if(movie.get(i).getRating()<3.5) {
				movie.remove(i);
			}
		}
		
		System.out.println("the movie got removed..");



	}

	@Override
	public void sortByDate() {
		
		movie.stream().sorted((d1,d2)->d1.getReleaseDate().compareTo(d2.getReleaseDate())).forEach(System.out::println);

	}

	@Override
	public void sortByName() {
		movie.stream().sorted((n1,n2)->n1.getName().compareTo(n2.getName())).forEach(System.out::println);

	}


	@Override
	public void searchByType(String newType) throws MovieException{
		Type t =Type.valueOf(newType.toUpperCase());
		
		for(Movie m:movie) {
			if(m.getType()==t) {
				System.out.println(m);
			}
		}

	}

	@Override
	public void updateDate(String date,int id)throws MovieException {
		
		LocalDate d =LocalDate.parse(date);
		for(int i=0;i<movie.size();i++) {
			if(movie.get(i).getId()==id) {
				movie.get(i).setReleaseDate(d);
			}
			
		}
		for(Movie m:movie) {
			System.out.println(m);
		}

	}
	
	@Override
	public void displayDetails() {
		for(Movie m:movie) {
			System.out.println(m);
		}
	}

}
