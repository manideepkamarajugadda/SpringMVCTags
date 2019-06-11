package mani.spring.springmvc;

import java.util.LinkedHashMap;

public class Student
{
	
	private String firstName,lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	private String favCourse;
	private String[] operatingSystems;
	public Student()
	{
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IND","INDIA");
		countryOptions.put("FRA","FRANCE");
		countryOptions.put("GER","GERMANY");
		countryOptions.put("AUS","AUSTRALIA");
		countryOptions.put("USA","UNITED STATES");
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() 
	{
		return countryOptions;
	}

	public String getFavCourse() {
		return favCourse;
	}

	public void setFavCourse(String favCourse) {
		this.favCourse = favCourse;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	

}
