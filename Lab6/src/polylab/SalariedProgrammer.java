package polylab;


//LAB 6 - SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

public class SalariedProgrammer extends Programmer  {
private double weeklySalary;

//constructor
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year,double weeklySalary) {
super(firstName, lastName, socialSecurityNumber, month, year); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//set salary
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//return salary
public double getWeeklySalary() {
return weeklySalary;
} 

//calculate earnings; override abstract method earnings in Programmer
@Override                                                           
public double earnings() {                                          
return getWeeklySalary();                                        
}                                             

//return String representation of SalariedProgrammer object   
@Override 
public String toString() {
	return String.format("%s\n%s: $%,.2f", super.toString(),"weekly salary",getWeeklySalary());
}

//weekly salary: $500.00
//earned $500.00 plus $500.00 birthday bonus
                                            
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
public String formatoutput() {
	return String.format("%s\n%s: $%d", toString(),
			  "earned",earnings());
			} 
}
//END


