package patterns;

import java.util.Scanner;

public class Fibbonacci_series 
{
public static void main(String[] args)
{
	int num;
	int a=0;
	int b=1;
	int c;
	System.out.println("enter num");
	Scanner r  = new Scanner(System.in);
	 num =r.nextInt();
	 for(int i = 1;i<=num;i++)
	 {
		 System.out.print(a+" ");
		 c=a+b;
		 a=b;
		 b=c;
	 }
}
}
