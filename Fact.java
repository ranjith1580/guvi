import java.io.*;
import java.util.*;
class Fact 
{
  	public static void main(String[] args) 
  	{
  	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long fact=1;
	if(n>1)
	{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	}	
	System.out.println(fact);

	}
}