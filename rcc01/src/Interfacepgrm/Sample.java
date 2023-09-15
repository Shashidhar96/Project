package Interfacepgrm;

public class Sample {

	public static void main(String[] args)
	{ 
		String s1="java";
		char[] ch=s1.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<j;i++)
		{
			char temp;
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(ch);
	}

}
