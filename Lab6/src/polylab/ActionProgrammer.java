package polylab;

public class ActionProgrammer extends Programmer {
	/* Declare the wage of the programmer per piece of app created,
	 * the number of apps created: pieces
	 * */
	private double wage;
	private double pieces;
	
	public ActionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double wages, double piece) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		this.wage = wages;
		this.pieces = piece;
	}

	/*implement the earnings method
	 * */
	@Override
	public double earnings() {
		return wage * pieces;
	}

}

