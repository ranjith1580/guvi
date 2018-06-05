import java.lang.*;
import java.util.*;
class Posnz
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		System.out.println("positive");
		if(n==0)
		System.out.println("ZERO");
		if(n<0)
		System.out.println("Negative");
	}
}