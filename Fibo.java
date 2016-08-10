import java.util.*;
import java.lang.*;
class Fibo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fibo=0;
		int n1=0,n2=1;
		for(int i=1;i<n;i++)
		{
			fibo=n1+n2;
			n1=n2;
			n2=fibo;		
		 
		}
		System.out.println(fibo);
		
	}
}