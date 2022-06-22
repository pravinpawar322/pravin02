package practice;

public class Parrent extends Grandparrent
{
static int d;static int e;static int f;static int g;static int h;static int i;
static void sub()
{
	d=20;e=10;
	f=d-e;
	System.out.println(f);

}
void multi()
{
	d=2;e=10;
	f=d*e;
	System.out.println(f);
}
public static void main(String[] args) 
{
	Parrent obj = new Parrent();
	obj.div();
	obj.multi();
    Parrent.sub();
}
}
