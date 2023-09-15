package exceptionhandlingtopic;

public class Sample6 {

	public static void main(String[] args) 
	{
		System.out.println("****main starts****");
	    try 
	    {
	    	int i=1/0;
	    }
	    finally
	    {
	    	System.out.println("i am finally blocked");
	    }
	    System.out.println("****main ends****");
	}
}	
