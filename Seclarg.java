import java.util.*;
import java.lang.*;
class Seclarg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println(a[1]);
		
	}
}