package com.cric.Service;

import com.cric.Exceptions.MyException;

public interface Service {
	
	void addDetails(String name, int age, String email,String phone,int rating)throws MyException;
	void displayDetails();
	void updatRating(int rating,String name);
	void searchByName(String name);
	void sortByName();
	

}
