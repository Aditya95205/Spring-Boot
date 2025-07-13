
public class CallByReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {10,20};
         System.out.println("A : "+arr[0]);
         test(arr);   //Copy of a will be passed in this context no change to actual a
         System.out.println("A : "+arr[0]);
	}
       //This is an example of call by Reference 
	//In this we can see Because Non-primitives(Array and string ,objects) are passed as double.
	private static void test(int brr[]) {
		// TODO Auto-generated method stub
		System.out.println("Z : "+brr[0]);
        brr[0]=99;
        System.out.println("Z : "+brr[0]);
	
	}

}
