/**
   In this file you will provide the code solution for Part 2. 
   You are required to create a subclass named RareAction.
   Activities for RareAction occurs on a particular date of the year
*/
/*This is the RareAction inherit from Superclass class Action 
 * that provides a catalog of actions to be carried out in view of COVID-19 OPH protocols.*/
public class RareAction extends Action
{
	/** Declare common data elements of dueDay,dueMonth
	*/
	   private int dueMonth, dueDay;
	   
	   /**
	   Constructs an action with a description.
	   @param desc the description of an action
	   */
	   public RareAction(String desc) {
		   super(desc);
	   }
	   /**
	   Constructs an action with a description and month, day.
	   @param year the year
	   @param month the month
	   @param desc the description of an action
	   @return true if the action activity occurs on the specified date.
	   */
	   public RareAction(int month,int day, String desc) {
		   super(desc);
		   this.dueMonth=month;
		   this.dueDay = day;
		   }
	   /**
	   Constructs an action without any parameters.
	   */
	   public RareAction() {
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
			return(month==dueMonth&&day == dueDay);
			}			
				

}
