package patterns;

import java.util.Scanner;

public class Pallendrom_no
{
public static void main(String[] args)//
{
	String a;
	String b = "";
	Scanner obj = new Scanner(System.in);
	System.out.println("enter no.");
	a = obj.nextLine();
	int length = a.length();
	for(int i=length;i>=0;i--);
	b= b+a.charAt(length);
	if(a.equals(b)) 
	{
		System.out.println("no. is pallendrom");
	}
	else
	{
		System.out.println("no.is not pallendrom");
	}
	
}
}
