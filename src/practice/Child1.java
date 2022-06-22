package practice;

public class Child1 extends Parrent1{
   
	public void m2() {
		System.out.println("i am child1 m2");
	}
	public void demo() {
		System.out.println("i am demo");
	}
	public void m1() {
		System.out.println("now i am in child1");
	}
	public static void main(String[] args) {
		
		Parrent1 obj = new Child1();
		obj.m1();
		
		
		
	}
}
