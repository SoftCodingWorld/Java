

/**
This is the Action Superclass class that provides a catalog of actions to be carried out in view of COVID-19 OPH protocols.
You are required to complete read and review this code to appropriately fill the required loopholes.
*/
public abstract class Action
{
private String description;


/** Declare common data elements of due date here (dueYear, dueMonth, dueDay)
*/
private int dueYear, dueMonth, dueDay;

/**
   Constructs an action without a description.
*/
public Action()
{
   description = "";
}

/**
   Constructs an action with a description.
   @param desc the description of an action
*/
public Action(String desc)
{
   description = desc;
}

/** Define a constructor that takes the due date elemsnts (dueYear, dueMonth, dueDay) and set instance variables
 * @param year the year value that user input
 * @param month the month value that user input
 * @param day the day value that user input
*/
public Action(int year, int month, int day) {
	this.dueYear=year;
	this.dueMonth=month;
	this.dueDay=day;
}
/**
   Sets the description of this action.
   @param description the text description of the action
*/
public void setDescription(String description)
{
   this.description = description;
}

/**
   Determines if this action occurs on the specified date.
   @param year the year
   @param month the month
   @param day the day
   @return true if the action activity occurs on the specified date.
*/
public  boolean occursOn(int year, int month, int day) {return false;};
	
/**
   Converts action activity to string description.
*/
public String toString()
{
   return description;
}
}

