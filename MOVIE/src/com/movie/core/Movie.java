package com.movie.core;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {
	private int id;
	private String name;
	private double rating;
	private LocalDate releaseDate;
	private boolean inCineama;
	private Type type;
	
	
	
	
	public Movie(int id, String name, double rating, LocalDate releaseDate, boolean inCineama, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.inCineama = inCineama;
		this.type = type;
	}
	public Movie(String name){
		this.name=name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isInCineama() {
		return inCineama;
	}
	public void setInCineama(boolean inCineama) {
		this.inCineama = inCineama;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", releaseDate=" + releaseDate
				+ ", inCineama=" + inCineama + ", type=" + type + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movie))
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	

}
