package Day3;

import java.util.Scanner;

public class HotFut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter name");
        String customerName=sc.next();
        System.out.println("Enter Date");
        String dateofplayinggame=sc.next();
        System.out.println("Enter Time");
        String timeofplaying=sc.next();
        
        System.out.println("*** Turf Options***");
        System.out.println("1.Cricket");
        System.out.println("2.Football");
        System.out.println("3.Tennis");
        System.out.println("Enter Choice");
        
        int turfChoice=sc.nextInt();
        
        double turfPrice = 0;
        String turfType="";
        switch(turfChoice) {
        case 1:  	turfPrice=900; turfType="Cricket Turf"; break;
		case 2:  	turfPrice=1000; turfType="Football Turf"; break;
		case 3:  	turfPrice=1500;  turfType="Tennis Turf"; break;
		case 4:  	turfPrice=2500;  turfType="Skating Turf"; break;
		case 0:  	System.exit(0);  //graceful exit with programmers exit
		default : System.out.println("Invalid choice");
		}

		System.out.println("**** BILL ****");
		System.out.println("Customer name "+customerName);
		System.out.println("Play Date "+dateofplayinggame);
		System.out.println("Play Time "+timeofplaying);
		System.out.println("Turf Type" + turfType);
		System.out.println("Cost" + turfPrice);
		
	}

}


/* default values for
int 
char
double
boolean
String
*/

//Scope of variable in java
//1.static   Scope
//2.Instance 
//3.Local scope
