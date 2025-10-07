package com.student.Tester;

import java.util.Scanner;

import com.student.Service.Service;
import com.student.Service.ServiceImpl;

public class Tester {

	public static void main(String[] args) {
		
		Service service=new ServiceImpl();
		
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				
				System.out.println("choose the options:");
				System.out.println("1. add Details");
				System.out.println("2. display details");
				System.out.println("3.remove");
				System.out.println("4. sort by admission date");
				System.out.println("5.sort by name");
				System.out.println("6.search by course");
				System.out.println("7.upgrade by id");
				System.out.println("8.exit");
				
				
				
					
					
				try {
					
					
					switch(sc.nextInt()) {
					
					case 1:
						service.AddDetail(sc.nextInt(), sc.next(),sc.nextInt(),sc.nextDouble(), sc.next(), sc.next(), sc.nextBoolean());
						break;
						

					case 2:
						service.displayDetails();
						break;
						

					case 3:
						service.removeStudentGrade();
						
						break;
						

					case 4:
						service.sortByAdmissionDate();
						break;
						

					case 5:
						service.sortByName();
						break;

					case 6:
						break;
						

					case 7:
						break;
						

					case 8:
						break;
						
					}
					
				}catch(Exception e) {
					System.out.println(e);
				}
				
				
			}
			
			
			
			
		}
		
		
		
	}

}
