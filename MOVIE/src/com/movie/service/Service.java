package com.movie.service;

import java.time.LocalDate;
import java.util.List;

import com.movie.Exceptions.MovieException;
import com.movie.core.Movie;
import com.movie.core.Type;

public interface Service {
	
	void addDetails(int id, String name, double rating, String releaseDate, boolean inCineama,String type)throws MovieException;
	void displayDetails();
	void removeMovies();
	void sortByDate();
	void sortByName();
	void searchByType(String newType)throws MovieException;
	void updateDate(String date,int id)throws MovieException;
	void displayDetailslessthan5();

}
