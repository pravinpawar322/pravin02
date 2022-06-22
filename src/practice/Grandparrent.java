package practice;

public class Grandparrent {
int a=12;String name ="pravin";int b=14;int c;
public void div()
{
	c=b/a;
	System.out.println(c);
	System.out.println(name);
}
public static void main(String[] args)
{
	Grandparrent obj = new Grandparrent();
	obj.div();
}
}
