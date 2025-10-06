package com.cric.Service;

import static com.cric.Service.Validations.validateAge;
import static com.cric.Service.Validations.validateEmail;
import static com.cric.Service.Validations.validateRating;
import static com.cric.Service.Validations.validatename;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cric.Exceptions.MyException;
import com.cric.core.Cricket;



public class ServiceImpl implements Service {
	
	List<Cricket> cric= new ArrayList<>(1000);
	
	
	public ServiceImpl() {
		
//		super();
//		this.cric = cric;
	} 

	@Override
	public void addDetails(String name, int age, String email,String phone,int rating)throws MyException {
		
		// TODO Auto-generated method stub
		validateAge(age);
		validateEmail(email);
		validatename(name,cric);
		validateRating(rating);
		
		cric.add(new Cricket(name,  age,  email, phone, rating));
		
		
		
	}

	@Override
	public void displayDetails() {
		//System.out.println(cric);
		// TODO Auto-generated method stub
		for(Cricket c:cric) {
			System.out.println(c);
		}
		
	}

	@Override
	public void updatRating(int rating,String name) {
		for(int i=0;i<cric.size();i++) {
			if(cric.get(i).getName().equals(name)) {
				cric.get(i).setRating(rating);
				System.out.println(cric.get(i));
			}
		}
		
		
		
	}

	@Override
	public void searchByName(String name) {
		for(Cricket c :cric) {
			if(c.getName().equals(name)) {
				System.out.println(c);
			}
		}
		
		
}

	@Override
	public void sortByName() {
			
				Collections.sort(cric);
			System.out.println(cric);
			for(Cricket c:cric) {
					System.out.println(c);
		
//				cric.stream()
//		    .sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
//		    .forEach(System.out::println);
//				
		}
		
	}
}

	



