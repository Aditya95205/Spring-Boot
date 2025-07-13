package Day3;

public class DriverApp {

	public static void main(String[] args) {
		
		Day1.displayPrincipalName();
		
		Day1 s2 = new Day1();       //Insider Object
		s2.displayStudent();
		
		int a=0;
		String b=null;      //No default value for local variable
		double c=0.0;      //so you have to declare it
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}


