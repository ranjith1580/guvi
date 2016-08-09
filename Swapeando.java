import java.io.*;
import java.util.*;
class Swapeando
{
  	public static void main(String[] args) 
  	{
  	Scanner sc=new Scanner(System.in);
  	String s=sc.next();
	String s1=new String();
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i=i+2)
	{	if(c.length%2==0)
		{
		char temp=c[i];
		c[i]=c[i+1];
		c[i+1]=temp;
		}
	}
	for(int i=0;i<c.length;i++)
	{	
		s1+=c[i];
	}
	
	
  	System.out.println(s1);
 	}
}