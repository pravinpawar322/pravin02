package practice;

public class Child extends Parrent
{
int a;int b;int c;
void add() {
	a=100;b=110;
	c=a+b;
	System.out.println(c);
}
public static void main(String[] args)
{
	Child obj = new Child();
	obj.add();
	obj.multi();
	Child.sub();
	obj.div();
}
}
