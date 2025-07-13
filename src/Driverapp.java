
public class Driverapp {
  public static void main(String args[]) {
	 //The object is created outside of the class
	  Day1 s1 = new Day1(); 
	  //RHS is the actual object and LHS is the human readable reference.
      s1.acceptStudent();       //Outsider object
      s1.displayStudent();
      s1.setRno(4);       //get method to write 
      System.out.println(s1.getRno());    //set method to write
  }
}
