package practic2;

public class Test2 {
int i =80;
int j=100;
 public static void main(String[]args) {
	 
	Test2 obj = new Test2();// object of test2 class
	
	System.out.println(obj.i);//calling non static members into static method by object
	System.out.println(obj.j);//calling non static members into static method by object
	
	Test obj1 = new Test();// object of test1 class
	System.out.println(obj1.place);//calling non static members into static method by object
	System.out.println(obj1.name);//calling non static members into static method by object
	System.out.println(obj1.a);//calling non static members into static method by object
	
	System.out.println(obj.i+obj.j);
 }
}
