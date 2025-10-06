package com.shoe.Tester;

import java.util.Scanner;

import com.shoe.service.Service;
import com.shoe.service.ServiceImpl;

public class Tester {

	public static void main(String[] args) {
		
		Service service= new ServiceImpl();
		// TODO Auto-generated method stub
		try (Scanner sc =new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter the choice");
				System.out.println("1.add");
				System.out.println("2.display");
				System.out.println("3.sorted by id");
				System.out.println("4.search expensive");
				System.out.println("5. remove ");
				System.out.println("6. update brand");
				System.out.println("7.sort by price");
				System.out.println("8.exit");
				
				try {
					switch(sc.nextInt()) {
					case 1:
						System.out.println("name, brand,  rating,  price, availableInGallery,  shoe");
						service.addDetail(sc.next(), sc.next(),sc.nextInt(), sc.nextDouble(), sc.nextBoolean(), sc.next());
						
						break;
						
					case 2:
						service.displayDetails();
						break;
						
						
					case 3:
						service.sortById();
						break;
					case 4:
						service.searchExpensive();
						break;
					case 5:
						System.out.println("enter the brand and price");
						String b=sc.next();
						double p=sc.nextInt();
;
						service.updateBrand(b,p);
						
						break;
					case 6:
						service.sortByPriceDes();
						break;
					case 7:
						break;
						
					
					
					
					
					
					
					
					
					
					
					
					}
				}catch(Exception e) {
					
				}
				
				
			}
			
			
			
			
		}

	}
	}


