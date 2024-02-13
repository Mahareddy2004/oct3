package module3;

 class bank{

 
public static void m1() {
	System.out.println("m1 method ");
}
public  void m2()	{
	System.out.println("m2 method");
}
 }
class deposit extends bank{
	public  void m3() {
		System.out.println("m3 method");
	}
	public static void m4() {
		System.out.println("m4 method");
	}
}


public class Inheritance {

public static void main (String[] args) {
	bank a=new bank();
	a.m1();
	a.m2();
deposit a1=new deposit();
a1.m3();
a1.m2();
	}
}
