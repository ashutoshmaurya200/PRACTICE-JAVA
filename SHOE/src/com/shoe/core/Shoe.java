package com.shoe.core;

import java.util.Objects;

public class Shoe {
  
   private static int shoe_id;
  
   private String name;
   private String brand;
   private int rating;
   private double price;
   private boolean availableInGallery;
   private Shoe_type Shoe;
   
   
   
   public Shoe(String name, String brand, int rating, double price, boolean availableInGallery, Shoe_type shoe) {
	
	this.shoe_id= ++shoe_id;
	this.name = name;
	this.brand = brand;
	this.rating = rating;
	this.price = price;
	this.availableInGallery = availableInGallery;
	this.Shoe = shoe;
}

   @Override
	public String toString() {
		return "Shoe [name=" + name + ", brand=" + brand + ", rating=" + rating + ", price=" + price
				+ ", availableInGallery=" + availableInGallery + ", Shoe=" + Shoe + "]";
	}

   public static int getShoe_id() {
	return shoe_id;
   }
 
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public String getBrand() {
	return brand;
   }
   public void setBrand(String brand) {
	this.brand = brand;
   }
   public int getRating() {
	return rating;
   }
   public void setRating(int rating) {
	this.rating = rating;
   }
   public double getPrice() {
	return price;
   }
   public void setPrice(double price) {
	this.price = price;
   }
   public boolean isAvailableInGallery() {
	return availableInGallery;
   }
   public void setAvailableInGallery(boolean availableInGallery) {
	this.availableInGallery = availableInGallery;
   }
   public Shoe_type getShoe() {
	return Shoe;
   }
   public void setShoe(Shoe_type shoe) {
	Shoe = shoe;
   }
  

  	@Override
  	public boolean equals(Object obj) {
//  		if (this == obj)
//  			return true;
//  		if (!(obj instanceof Shoe))
//  			return false;
//  		Shoe other = (Shoe) obj;
//  		return Objects.equals(brand, other.brand);
  	
  		if(obj instanceof Shoe) {
  			Shoe s= (Shoe)obj;
  			return this.brand.equals(s.brand);
  		}
  		return false;
  		
  	}
}
