package module3;
class a{
public void m1(){
	System.out.println("m1 method ");
}
public void m2() {
	System.out.println("m2 method");
}
}

class b extends a {
public void m3() {
	System.out.println("m3 method");
}
public void m4() {
	System.out.println("m4 method");
}
}

public class Upcasting {
public static void main(String[] args) {
a a1=new b();
a1.m1();
a1.m2();
//b b1=b a1();
}
}
