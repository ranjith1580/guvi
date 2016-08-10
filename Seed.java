import java.util.*;
import java.io.*;
class Seed
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int ans=n;
		while(n>0)
		{
			int p=n%10;
			ans=ans*p;
			n=n/10;
			
		}
		if(ans==l)
		{
			System.out.print("seed");
		}
		else
		{
			System.out.println("NO Seed");
		}
	}
}