package encapsulationassingnment;

class Qspider
{
	private String course="Manual";

	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
}
public class Mainclass3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qspider q1=new Qspider();
		System.out.println(q1.getCourse());
		q1.setCourse("Automation");
		System.out.println(q1.getCourse());

	}

}
