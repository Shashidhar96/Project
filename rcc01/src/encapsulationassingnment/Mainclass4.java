package encapsulationassingnment;

class Result
{
	private double a=59.90;
	
	public double getA()
	{
		return a;
	}
	
	public void setA(double a)
	{
		this.a=a;
	}
}


public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r1=new Result();
		System.out.println(r1.getA());
		r1.setA(60);
		System.out.println(r1.getA());

	}

}
