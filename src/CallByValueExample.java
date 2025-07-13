
public class CallByValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10;
         System.out.println("A : "+a);
         test(a);   //Copy of a will be passed in this context no change to actual a
         System.out.println("A : "+a);
	}
       //This is an example of call by value 
	//In this we can see Because primitives(int, float, double are passed as double.
	private static void test(int z) {
		// TODO Auto-generated method stub
		System.out.println("Z : "+z);
        z=99;
        System.out.println("Z : "+z);
	}
}
