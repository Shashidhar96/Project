package encapsulationassingnment;

class Sample 
{
	private String inverter="Battery";
	
	public String getInverter()
	{
		return inverter;
	}
	public void setInverter(String inverter)
	{
		this.inverter=inverter;
	}
}

public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample();
		System.out.println(s1.getInverter());
		s1.setInverter("Generator");
		System.out.println(s1.getInverter());

	}

}
