package com.shoe.service;

import com.shoe.core.Shoe;
import com.shoe.core.Shoe_type;
import com.shoe.exceptions.ShoeException;

public interface Service {
	
	void addDetail(String name, String brand, int rating, double price, boolean availableInGallery, String shoe)throws ShoeException;
	void displayDetails();
	void sortById();
	Shoe searchExpensive();
	void remove();
	void updateBrand(String brand,double price);
	void sortByPriceDes();
	

}
