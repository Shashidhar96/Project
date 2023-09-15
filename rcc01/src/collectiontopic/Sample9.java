package collectiontopic;
import java.util.Vector;
public class Sample9
{
	public static void main(String[] args) 
	{
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20.56);
		l1.add(10);
		l1.add(true);
		l1.add("hello");
		l1.add(null);
		
		System.out.println("l1--->"+l1);
	}
}
