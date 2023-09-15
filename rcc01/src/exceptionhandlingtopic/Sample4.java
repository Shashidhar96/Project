package exceptionhandlingtopic;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Main starts*****");
        int a=10;
        int b=2;
        try
        {
        	 int i=a/b;
        	 try
        	 {
        		 int[]arr={5,1,2,36};
        		 System.out.println(arr[8]);
        	 }
             catch(ArrayIndexOutOfBoundsException e)
            {
        	   System.out.println("caught");
            }
        }
        catch (ArithmeticException e)
        {
        	System.out.println("handled");
        }
        System.out.println("***main ends******");
	}

}
