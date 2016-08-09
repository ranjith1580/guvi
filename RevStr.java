import java.io.*;
import java.util.*;
class RevStr 
{
  	public static void main(String[] args) 
  	{
  	Scanner sc=new Scanner(System.in);
  	String s1=sc.nextLine();
  	char c[]=s1.toCharArray();
  	String s2=new String();
    	for(int i=c.length-1;i>=0;i--)
    	{
      		s2+=c[i];
    	}
  	System.out.println(s2);
 	}
}