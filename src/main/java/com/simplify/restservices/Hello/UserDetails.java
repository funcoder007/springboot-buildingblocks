package com.simplify.restservices.Hello;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private String city;
	
	
	//Constructor using fields
	public UserDetails(String firstName, String lastName, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	
	
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


//To string
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	

}
