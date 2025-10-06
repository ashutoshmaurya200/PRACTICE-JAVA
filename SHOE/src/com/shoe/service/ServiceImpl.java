package com.shoe.service;

import static com.shoe.service.Validation.validateName;
import static com.shoe.service.Validation.validateRating;
import static com.shoe.service.Validation.validateShoeType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.shoe.core.Shoe;
import com.shoe.core.Shoe_type;
import com.shoe.exceptions.ShoeException;


public class ServiceImpl implements Service {
	public List<Shoe> sh ;
	public ServiceImpl() {
		sh = new ArrayList<>(1000);
		
	}

	

	@Override
	public void addDetail(String name, String brand, int rating, double price, boolean availableInGallery, String shoe)throws ShoeException {
		validateName(name);
		validateRating(rating);
		Shoe_type validshoe=validateShoeType(shoe);
		
		
		
		sh.add(new Shoe(name,brand,rating, price, availableInGallery,validshoe));
		
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void displayDetails() {
		for(Shoe s:sh)
			System.out.println(s);

	}

	@Override
	public void sortById() {
		sh.stream().sorted((id1,id2)->Integer.compare(id1.getShoe_id(),id2.getShoe_id())).forEach(System.out::println);


	}

	@Override
	public Shoe searchExpensive() {
		Shoe max=null;
		for(int i=0;i<sh.size();i++) {
			if(sh.get(i).getPrice()>max.getPrice()) {
				max=sh.get(i);
			}
		}
		
	   return max;
		

	}

	@Override
	public void remove() {
		for(Shoe s: sh) {
			if(!s.isAvailableInGallery()) {
				sh.remove(s);
				
			}
			
		}
		System.out.println("the shoe is removed:");
		

	}

	@Override
	public void updateBrand(String brand,double price) {
		for(int i=0;i<sh.size();i++) {
			if(sh.get(i).getBrand().equals(brand)) {
				sh.get(i).setPrice(price);
			}
		}

	}

	@Override
	public void sortByPriceDes() {
		sh.stream().sorted((p1,p2)-> Double.compare(p1.getPrice(),p2.getPrice())).forEach(System.out::println);

	}

}
