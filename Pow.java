import java.util.*;
import java.lang.*;
class Pow 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n%2==0 && n!=0)
		{
			n=n/2;
		}
		if(n==1)
		{
		System.out.println("YES");
		}
		else
		{
		System.out.println("NO");
		}
	}
}