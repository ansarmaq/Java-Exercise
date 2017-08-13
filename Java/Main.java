
import java.util.*;

// This is 'Cinema' class. The Parent class of all four classes(Standard, OAP, Student and Child).
abstract class Cinema{     
	
	// Here, 'Cinema' class has kept it's data(ticketPrice) protected and method 'getTicketPrice' public (to access publicy). "ENCAPSULATION"
	protected int ticketPrice=0;     // Data(ticketPrice) will be used by the classes which extends 'Cinema' class. It is keep 'protected', can't be access publicly.
	public abstract int getTicketCost(int n,String showDay);            // A function in parent, which it's child will implement. // This function is Abstract, childs have to implement this function. "ABSTRACTION"

}          // 'Cinema' class ends here.



//This is 'Standard' class which extends 'Cinema' class. 
class Standard extends Cinema{            

public Standard(){                    // 'Standard' class's constructor.
	ticketPrice=8;           
}

public int getTicketCost(int n,String showDay){     // Function which returns ticketCost for Standard members.
	if(showDay.equals("Wednesday") || showDay.equals("wednesday") || showDay.equals("Wed") || showDay.equals("wed") || showDay.equals("WED") || showDay.equals("WEDNESDAY")){ // Check for checking if the Day is 'Wednesday'(the discount day).
		return ((ticketPrice-2)*n);	
	}
	else{   // If the day is not 'Wednesday'.
	return (ticketPrice*n);
	}
}


}            // 'Standard' class ends here.



//This is 'OAP' class which extends 'Cinema' class.
class OAP extends Cinema{ 
	

public OAP(){                // 'OAP' class's constructor.
	ticketPrice=6;
}

public int getTicketCost(int n,String showDay){            // Function which returns ticketCost for OAP members.
	if(showDay.equals("Wednesday") || showDay.equals("wednesday") || showDay.equals("Wed") || showDay.equals("wed") || showDay.equals("WED") || showDay.equals("WEDNESDAY")){  // Check for checking if the Day is 'Wednesday'(the discount day).
		return ((ticketPrice-2)*n);
	}
	else{   // If the day is not 'Wednesday'.
	return (ticketPrice*n);
	}
}


}            // 'OAP' class ends here.


//This is 'Student' class which extends 'Cinema' class.
class Student extends Cinema{ 
	

public Student(){       // 'Student' class's constructor.
	ticketPrice=6;
}

public int getTicketCost(int n,String showDay){
	if(showDay.equals("Wednesday") || showDay.equals("wednesday") || showDay.equals("Wed") || showDay.equals("wed") || showDay.equals("WED") || showDay.equals("WEDNESDAY")){  // Check for checking if the Day is 'Wednesday'(the discount day).
		return ((ticketPrice-2)*n);
	}
	else{   // If the day is not 'Wednesday'.
	return (ticketPrice*n);
	}
}


}            // 'Student' class ends here.


//This is 'Child' class which extends 'Cinema' class.
class Child extends Cinema{                                       // This 'Child' class and above 3 classes extends 'Cinema' class. "INHERITANCE"
	

public Child(){         // 'Child' class's constructor.
	ticketPrice=4;
}

public int getTicketCost(int n,String showDay){
	if(showDay.equals("Wednesday") || showDay.equals("wednesday") || showDay.equals("Wed") || showDay.equals("wed") || showDay.equals("WED") || showDay.equals("WEDNESDAY")){  // Check for checking if the Day is 'Wednesday'(the discount day).
		return ((ticketPrice-2)*n);
	}
	else{    // If the day is not 'Wednesday'.
	return (ticketPrice*n);
	}
}


}            // 'Child' class ends here.



/////////////////////////////////////////////////////////////////////////////////
//This is 'Main' class // Execution starts from here.
public class Main { 
	
	public static void main(String []args)     // Main function.
	{
		int standardCost=0,oapCost=0,studentCost=0,childCost=0;       // Variables to take costs for different types of members.
		int totalCost=0;      // Variable for total cost.
		
		// Welcome Note.
		System.out.println("### WELCOME TO OUR CINEMA ###");  
		System.out.println("# Customer Order #");  
		
		// Taking total no of members from User.
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter Number of Total Members:");
		int totalMembers = reader.nextInt();
		
		// Taking no of 'Standard' members from User.
		System.out.println("Please Enter Number of 'Standard Admission' Members(if any):");
		int standardMembers = reader.nextInt();
		
		// Taking no of 'OAP' members from User.
		System.out.println("Please Enter Number of 'OAP' Members(if any):");
		int oapMembers = reader.nextInt();
		
		// Taking no of 'Student' members from User.
		System.out.println("Please Enter Number of 'Student' Members(if any):");
		int studentMembers = reader.nextInt();
		
		// Taking no of 'Child' members from User.
		System.out.println("Please Enter Number of 'Child' Members(if any):");
		int childMembers = reader.nextInt();
		
		// Taking the showDay from User.
		Scanner reader2 = new Scanner(System.in);
		System.out.println("Please Enter the Show Day(week day):");
		String showDay = reader2.nextLine();
		
		// Object of each class is created and then 'getTicketCost' function is called to get ticket cost for each member type.
		Standard obj=new Standard();
		standardCost=obj.getTicketCost(standardMembers,showDay);
		
		OAP obj2=new OAP();
		oapCost=obj2.getTicketCost(oapMembers,showDay);
		
		Student obj3=new Student();
		studentCost=obj3.getTicketCost(studentMembers,showDay);
		
		Cinema obj4=new Child();                                     // Here, obj of 'Cinema' class is created, intialised with 'Child' class's constructor. So, behaviour is decided at run-time and 'getTicketCost' function of 'Child' class well be executed. "POLYMORPHISM" 
		childCost=obj4.getTicketCost(childMembers,showDay); 
		
		// Adding the costs got from each member type.
		totalCost=standardCost+oapCost+studentCost+childCost;
		
		// Finally, Total cost is displayed to the User.
		System.out.println("The Total Cost of Tickets for this Movie is:");
		System.out.println("$"+totalCost);
		
		
	}
	
	
}       // 'Main' class ends here