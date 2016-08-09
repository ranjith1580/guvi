import java.io.*;
import java.util.*;
class RevDig 
{
  	public static void main(String[] args) 
  	{
  	Scanner sc=new Scanner(System.in);
  	int n1=sc.nextInt();
	int l=0;
  	while(n1>0)
	{
		l=l*10+(n1%10);
		n1=n1/10;	

	}
  	System.out.println(l);
 	}
}