package exceptionhandlingtopic;

public class Sample5 {

	public static void main(String[] args) 
	{
		System.out.println("****main starts*****");
		try
		{
			int i=1/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		finally
		{
			System.out.println("i am finally blocked");
		}
        System.out.println("****main ends****");
	}

}
