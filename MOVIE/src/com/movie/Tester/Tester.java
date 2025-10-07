package com.movie.Tester;

import java.util.Scanner;

import com.movie.service.Service;
import com.movie.service.ServiceImpl;

public class Tester {

	public static void main(String[] args) {
		Service service=new ServiceImpl();
		try(Scanner sc =new Scanner(System.in)) {
			
			boolean exit=false;
			while(!exit) {
				System.out.println("choose the options :");
				System.out.println("1. add th datails :");
				System.out.println("2. Display the details :");
				System.out.println("3. Remove the movie with rating less than 3.5 :");
				
				System.out.println("4. sort the movies with date :");
				System.out.println("5. sort the movies by name  :");
				System.out.println("6. search movies by type :");
				System.out.println("7. Update date using Id  :");
				System.out.println("8. Display the movie details with rating greater than 5 :");
				System.out.println("9.exit  :");
				 
				try {
					switch(sc.nextInt()) {
					
					case 1:
						System.out.println("id,  name,  rating,  releaseDate,  inCineama, type");
						service.addDetails(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean(),sc.next());
						
						break;
					case 2:
						service.displayDetails();
						
						break;
					case 3:
						service.removeMovies();
						break;

					case 4:
						service.sortByDate();
						break;

					case 5:
						service.sortByName();
						break;

					case 6:
						System.out.println("enter the type of movies you want to search:");
						String type=sc.next();
						service.searchByType(type);
						break;

					case 7:
						System.out.println("enter the id and updated date of movie you want to update");
						int id=sc.nextInt();
						String date=sc.next();
						service.updateDate(date, id);
						
						break;
						
					case 8:
						service.displayDetailslessthan5();
						
						break;
						

					case 9:
						exit=true;
						break;

					}
				}catch(Exception e) {
					System.out.println(e);
				
				
			}
			
//				1 Inception 4.8 2010-07-16 true HOLLYWOOD
//				2 Interstellar 4.7 2014-11-07 false HOLLYWOOD
//				3 Avengers_Endgame 4.6 2019-04-26 false HOLLYWOOD
//				4 Joker 4.5 2019-10-04 false bollywood
//				5 The_Dark_Knight 4.9 2008-07-18 false HOLLYWOOD
//				6 Avatar 4.3 2009-12-18 true tollywood
//				7 Titanic 4.4 1997-12-19 false HOLLYWOOD
//				8 Deadpool 2 2016-02-12 false HOLLYWOOD
//				9 Doctor_Strange 4.1 2016-11-04 false HOLLYWOOD			
			
			
		
			
		}
			
		}
		
		
		
		
	}

}
