package polylab;


//Lab 6 - BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
private double baseSalary; // base salary per week

//constructor
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, 
  month, year, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

//set base salary
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

//return base salary
public double getBaseSalary() {
return baseSalary;
}

//calculate earnings; override method earnings in CommissionProgrammer
@Override                                                            
public double earnings() {                                             
return getBaseSalary() + super.earnings();                        
} 

//return String representation of BasePlusCommissionProgrammer object
@Override 
public String toString() {
	String result=super.toString();
//	base salary: $300.00
//	new base salary with 10% increase is: $330.00
	
	return String.format("%s; %s: $%,.2f", super.toString(),"base salary",getBaseSalary());
}
                                              
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
@Override
public String formatoutput() {
	return String.format("%s\n%s: \u0024%d\n%s: \u0024%d", toString(),
			"\nnew base salary with 10% increase is", earnings(),"earned",earnings());
	}
}
//END




