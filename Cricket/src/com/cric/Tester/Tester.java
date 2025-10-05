package com.cric.Tester;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import com.cric.Service.Service;
import com.cric.Service.ServiceImpl;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			Service service= new ServiceImpl();
			
			boolean exit=false;
			while(!exit) {
				System.out.println("enter the choice");
				System.out.println("1.add the CricketDetails");
				System.out.println("2. display");
				System.out.println("3. update");
				System.out.println("4.search");
				System.out.println("5.sort");
				System.out.println("6.exit");
				
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					
					
					System.out.println("enter the  details :- name, age, email,phone, rating");
					service.addDetails(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
					
					break;
				case 2:
					service.displayDetails();
					
					break;
				case 3:
					System.out.println("enter the name of cricketer you want to modify rating:");
					String name=sc.next();
					System.out.println("enter the updated rating ");
					int rating=sc.nextInt();
					
					service.updatRating(rating, name);
					
					break;
				case 4:
					System.out.println("enter the name of cricketer you want search");
					String name1=sc.next();
					service.searchByName(name1);
					break;
				case 5:{
					service.sortByName();
//					cric.stream()
//				    .sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
//				    .forEach(System.out::println);
				}
					break;
				case 6:
					exit=true;
					break;
			
				}
			}
			
			
//			Virat Kohli 36 virat.kohli@example.com 9876543210 5
//			RohitSharma 38 rohit.sharma@example.com 9876501234 4
//			Jasprit Bumrah 32 bumrah.jasprit@example.com 9123456780 5
//			Hardik Pandya 31 hardik.pandya@example.com 9988776655 3
//		    Shubman Gill 28 shubman.gill@example.com 9012345678 4
//			MS Dhoni 44 ms.dhoni@example.com  9090909090 5
////			
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		

	}

}
