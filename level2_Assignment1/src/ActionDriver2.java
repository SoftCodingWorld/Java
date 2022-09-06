
// Java Program to demonstrate the Use of Reflection
  
// Importing required classes
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ActionDriver2 {

	public static void main(String[] args) {
		Class cls;
		Field[] field;
		// Creating object whose property is to be checked
		OccasionalAction occasion = new OccasionalAction();
		cls = occasion.getClass();
		//cls.getSuperclass().getName();	
		System.out.println("OccasionalAction is just subclass of Action:"+(cls.getSuperclass()==Action.class));
		System.out.println("Expected:true");
		
		field = cls.getDeclaredFields();
		System.out.println(field.length);
		System.out.println("OccasionalAction activities have 1 extra fields:"+(field.length==1));
		System.out.println("Expected:true");
		
		OccasionalAction occasion1 = new OccasionalAction("Take a PCR test");
		System.out.println("Looking at regular actions:"+occasion1.toString());
		System.out.println("Expected:Take a PCR test");
		System.out.println(occasion1.occursOn(2022, 6, 19));
		System.out.println("Expected:true");
		
		// Creating object whose property is to be checked
		RareAction rareaction = new RareAction();
		cls = rareaction.getClass();
		//cls.getSuperclass().getName();	
		System.out.println("RareAction is just subclass of Action:"+(cls.getSuperclass()==Action.class));
		System.out.println("Expected:true");
		
		field = cls.getDeclaredFields();
		System.out.println(field.length);
		System.out.println("RareAction activities have 1 extra fields:"+(field.length==1));
		System.out.println("Expected:true");
		
		RareAction rareaction1 = new RareAction("Take a PCR test");
		System.out.println("Looking at regular actions:"+rareaction1.toString());
		System.out.println("Expected:Take a PCR test");
		System.out.println(rareaction1.occursOn(2022, 6, 19));
		System.out.println("Expected:true");
	}

}
