package encapsulationassingnment;

class Facebook
{
	private String friendrequest="accepted";
	
	public String getFriendrequest()
	{
		return friendrequest;
	}
	public void setFriendrequest(String friendrequest)
	{
		this.friendrequest=friendrequest;
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook f1=new Facebook();
		System.out.println(f1.getFriendrequest());
		f1.setFriendrequest("not accepted");
		System.out.println(f1.getFriendrequest());

	}

}
