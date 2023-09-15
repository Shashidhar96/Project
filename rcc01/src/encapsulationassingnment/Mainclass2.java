package encapsulationassingnment;

class Demo
{
	private char a='A';
	
	public char getA()
	{
		return a;
	}
	public void setA (char a)
	{
		this.a=a;
	}
}

public class Mainclass2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		System.out.println(d1.getA());
		d1.setA('Z');
		System.out.println(d1.getA());

	}

}
