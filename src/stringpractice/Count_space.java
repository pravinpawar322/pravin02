package stringpractice;

public class Count_space
{
public static void main(String[] args)
{
	String str = " hello this is velocity trainnig institute";
	int count=0;
	for(int i =0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
			count++;
	}
	System.out.println("no. of spaces "+ count);
	System.out.println(str.replace('i','j'));
	System.out.println(str.replace(" ", ""));
	
	String[] a = str.split(" ");
	for(int i =a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	
}


}
