package exceptionhandlingtopic;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Main starts******");
		try
		{
			int i=1/0;
			System.out.println("hii");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught");
		}
        System.out.println("****Main ends****");
	}

}
