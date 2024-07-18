package com.yugandhar;

public class Hero {
	
	private String name;
	public Hero(String name, String movie, Integer numberOfMovies) {
		super();
		this.name = name;
		this.movie = movie;
		this.numberOfMovies = numberOfMovies;
	}
	private String movie;
	private Integer numberOfMovies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public Integer getNumberOfMovies() {
		return numberOfMovies;
	}
	public void setNumberOfMovies(Integer numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}
	
	

}
