package encapsulation;

class Gmail
{
   private String password="dinga";
   
   public String getPassword()
   {
	   return password;
   }
   
   public void setPassword(String password)
   {
	   this.password=password;
   }
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Gmail g1=new Gmail();
      System.out.println(g1.getPassword());
      g1.setPassword("dingi");
      System.out.println(g1.getPassword());
	}

}
