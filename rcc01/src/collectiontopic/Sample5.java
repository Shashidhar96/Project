package collectiontopic;
import java.util.ArrayList;
public class Sample5 
{
     public static void main(String[] args) 
     {
    	 ArrayList l2=new ArrayList();
    	 l2.add("goa");
    	 l2.add("mandya");
    	 l2.add("delhi");
    	 l2.add("andhra");
    	 l2.add("kgf");
    	
    	 System.out.println("l2--->"+l2);
    	 l2.remove(2);
    	 
    	 System.out.println("l2--->"+l2);
    	 l2.remove("kgf");
    	 
    	 System.out.println("l2--->"+l2);
     }	
}
