package polylab;


//Programmer abstract superclass.

public abstract class Programmer  {
private final String firstName;
private final String lastName;
private final String socialSecurityNumber;
private final Date birthDate;

//constructor
public Programmer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year) {
this.firstName = firstName;                                    
this.lastName = lastName;                                    
this.socialSecurityNumber = socialSecurityNumber;
this.birthDate = new Date(month, year);
} 

//return first name
//TO DO: INSERT YOUR CODE HERE
public String getFirstName() {
	return firstName;
}

//return last name
//TO DO: INSERT YOUR CODE HERE 
public String getLastName() {
	return lastName;
}

//return social security number
//TO DO: INSERT YOUR CODE HERE
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

//return birth date  // 
//TO DO: INSERT YOUR CODE HERE
public Date getBirthDate() {
	// TODO Auto-generated method stub	
	return birthDate;
}

//return String representation of Programmer object
@Override
public String toString() {
return String.format("%s: %s %s\n%s: %s\n%s: %s", getClass().getName(),
  getFirstName(), getLastName(), 
  "social security number", getSocialSecurityNumber(), 
  "birth month and year", getBirthDate());
} 

/**abstract method must be overridden by concrete subclasses */

public abstract double earnings(); 
} 


