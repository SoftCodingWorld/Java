/**
   In this file you will provide the code solution for Part 2. 
   You are required to create a subclass named OccasionalAction.
   These are activities that occur on the same day of every month specified.
*/

/*This is the OccasionalAction inherit from Superclass class Action 
 * that provides a catalog of actions to be carried out in view of COVID-19 OPH protocols.*/
public class OccasionalAction extends Action
{
	/** Declare common data elements of dueDay
	*/
   private int dueDay;
   
   /**
   Constructs an action without a description.
   */
   public OccasionalAction() {
	   super();
   }
   /**
   Constructs an action with a description.
   @param desc the description of an action
   */
   public OccasionalAction(String desc) {
	   super(desc);
   }
   /**
   Constructs an action with a day and description.
   @param desc the description of an action
   */
   public OccasionalAction(int day, String desc) {
	   super(desc);
	   this.dueDay = day;
	   }
   /**
   Determines if this action occurs on the specified date and month.
   @param year the year
   @param month the month
   @param day the day
   @return true if the action activity occurs on the specified date.
*/
   public boolean occursOn(int year, int month, int day) {
	   return (day == dueDay);
	   }
   }
