package exceptionhandlingtopic;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****main starts******");
		int[] arr={ 10,20,30};
		//           0  1  2
		try
		{
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		System.out.println("***main ends*****");
	}

}
