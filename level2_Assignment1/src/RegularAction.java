/**
 * This is code for Part 1. YOUR TASK is to create a subclass named
 * RegularAction. This is a subclass of the Action Superclass. Action has a
 * description (for example, "Wash your hands") and occurss on one or more
 * dates. A regular action activity occurs every day.
 */

/*This is the RegularAction inherit from Superclass class Action 
 * that provides a catalog of actions to be carried out in view of COVID-19 OPH protocols.*/
public class RegularAction extends Action {
	
   /**
   Constructs an RegularAction with a description.
   @param desc the description of an action
   */
	public RegularAction(String desc) {
		super(desc);
	}
   /**
   Constructs an RegularAction without any parameters.
   */
   public RegularAction() {
	   super();
}
/**
   Determines if this action occurs on the specified date and month.
   @param year the year value
   @param month the month value
   @param day the day value
   @return true if the action activity occurs on the specified date.
   */
	public boolean occursOn(int year, int month, int day) {
		return (day >0);
		}
}
