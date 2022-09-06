//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//import java.util.Date;
//import java.util.Scanner;

/**
 * In this file, you are required to write code for your part Part 3. The reason
 * for this class is to demonstrate the Action class and subclasses. You must
 * fill an array of action objects (hint: check the sample output file provided
 * for you) with different action activities. A user of this system should be
 * able to input a date of their choice and retrieve an output of all activities
 * that would occur on that date. You should reuse the Action class and
 * RegularAction classes from Part I of your solution and then the
 * OccasionalAction and RareAction classes from your Part 2.
 */

// YOUR CODE STARTS HERE!!!

public class AllActionTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		User user = new User();
		int dueDay, dueMonth, dueYear;
		String input;
		//String input;

		ArrayList<Action> actions = new ArrayList<Action>();
		actions.add(new RegularAction("Wash your hands"));
		actions.add(new OccasionalAction(1, "Take a PCR test"));
		actions.add(new RareAction(6, 1, "Get a booster shot"));
		actions.add(new RareAction(12, 15, "Get a booster shot"));
		actions.add(new RegularAction("Sit two meters apart."));
		actions.add(new RareAction(12, 7, "wear a mask"));
		System.out.println(actions);

		System.out.println("Enter a date (like 2010 01 30):");
		//input = keyboard.nextLine();
		dueYear = keyboard.nextInt();
		dueMonth = keyboard.nextInt();
		dueDay=keyboard.nextInt();
		String s=dueYear+" "+dueMonth+" "+dueDay;
		try {
			SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy MM dd");
			Date parse = simpleDateFormat1.parse(s);
			//System.out.println(parse);
			SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
			String format = simpleDateFormat2.format(parse);
			System.out.println("These are your actions on "+format+ ":");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		for (Action action : actions) {
			if (action.occursOn(dueYear, dueMonth, dueDay)) {
				System.out.println(action.occursOn(dueYear, dueMonth, dueDay));
				System.out.println(action.toString());
			}
		}
	}
}
