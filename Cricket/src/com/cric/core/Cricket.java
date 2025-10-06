package com.cric.core;

//Write a class Cricketer with following Fields 
//
//String name,int age,String email_id,String Phone,int rating
//
//This application should contains the test class called CricketerTest which will test the functionality of Cricketer class.
//
//Use any collection you like to store the data.
//
//1.Accept minimum 5 Cricketers in the collection.
//
//2.Modify Cricketer's rating
//
//3.Search Cricketer by name
//
//4. Display all Cricketers added in collection.
//
//5.Display All Cricketers in sorted form by rating.


public class Cricket implements Comparable<Cricket> {//
	protected String name;
	protected int age;
	protected String email;
	protected String phone;
	protected int rating;
	
	public Cricket(String name, int age, String email,String phone,int rating) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.phone=phone;
		this.rating=rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricket [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + ", rating=" + rating
				+ "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Cricket) {
			Cricket other = (Cricket)o;
			return this.name.equals(other.name);
		}
		return false;
		
	}

	@Override
	public int compareTo(Cricket o) {
		
		return this.name.compareTo(o.name);
	}
	
	

}
