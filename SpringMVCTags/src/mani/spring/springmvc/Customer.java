package mani.spring.springmvc;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

public class Customer
{
	private String firstName;
	@NotNull(message="cannot be empty")
	@Size(min=1, message="cannot be empty")
	private String lastName;

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
	
	
}
