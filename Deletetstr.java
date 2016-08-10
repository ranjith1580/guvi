import java.util.*;
import java.io.*;
class Deletetstr
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int l=sc.nextInt();
	char a[]=String.valueOf(n).toCharArray();
	int len=a.length-l;
	Arrays.sort(a);
	for(int i=0;i<len;i++)
	{
	System.out.print(a[i]);
	}
	}
}