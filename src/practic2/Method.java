package practic2;

public class Method {
int a=10;
static int b=20;
public void test(int a,int b)// Parameterize user defined method
{
	System.out.println(a+b);
}
public void demo() //user defined method
{
	System.out.println("hello");
}
public static void march()//static keyword use in static method
{
	System.out.println("i am static method");
}
public static void main(String[]args) // main method
{
	Method obj = new Method();
	obj.test(10,30);
	System.out.println(obj.a);
	obj.demo();
	System.out.println(obj.a);
	Method.march();
	System.out.println(b);
}
}
