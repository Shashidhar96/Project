package Programming;

import java.util.Scanner;

public class Sample2
{
      public static void main(String[] args) 
      {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      System.out.println("enter the start range");
      int start = sc.nextInt();
      System.out.println("enter the end range");
      int end =sc.nextInt();
      
      for(int no=start ; no<=end ; no++)
      {
    	  boolean flag=true;
    	  
    	  for(int i=2 ; i<no ; i++)
    	  {
    		  if(no%i==0)
    		  {
    			  flag=false;
    		  }
    	  }
          if (flag==true)
          {
        	  System.out.println("prime no" +no);
          }
		
	  }
 }
}