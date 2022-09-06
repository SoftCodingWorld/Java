
// Java Program to demonstrate the Use of Reflection
  
// Importing required classes
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ActionDriver {

	public static void main(String[] args) {
		// Creating object whose property is to be checked
		RegularAction regular = new RegularAction();
		Class cls = regular.getClass();
		cls.getSuperclass().getName();	
		System.out.println("RegularAction is just subclass of Action:"+(cls.getSuperclass()==Action.class));
		System.out.println("Expected:true");
		
		Field[] field = cls.getDeclaredFields();
		System.out.println("RegularAction activities have no extra fields:"+(field.length==0));
		System.out.println("Expected:true");
		
		RegularAction regular1 = new RegularAction("Wash your hands");
		System.out.println("Looking at regular actions:"+regular1.toString());
		System.out.println("Expected:Wash your hands");
		System.out.println(regular1.occursOn(2022, 6, 16 ));
		System.out.println("Expected:true");

		

	}

}
