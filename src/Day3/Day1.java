package Day3;
import java.util.Scanner;
public class Day1 {

	private int rno;        //Properties
	private String sname;
	private double per;
	
	private static String principalName;    //Static or class scope
	//To read and write private data outside the class we get setter getter method
	//Create a pair(set,get) for each private property
	
	//1.Static data
	//2.Static methods
	//3.static block
	//4.static import
	
	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public static void displayPrincipalName() {
		System.out.println(Day1.principalName);
		test();
	}
	
	public static void test() {
		int x;      //Local Scope
		System.out.println("hi");
	}
	
	public void acceptStudent() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter roll no");
	    rno=sc.nextInt();
	    System.out.println("Please enter Student name");
	    sname=sc.next();
	    System.out.println("Please enter Student Percentage");
	    per=sc.nextDouble();
	}
	
	public void displayStudent() {
		
		System.out.println("Roll number is " +this.rno);
		System.out.println("Student name is "+this.sname);
		System.out.println("Percentage is " +this.per);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Java Developer
		//The class methods have direct access to the class properties
		//Note Printing machine
	}

} 