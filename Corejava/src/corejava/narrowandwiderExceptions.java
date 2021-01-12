package corejava;

import java.io.IOException;

class narrowwider{
	public int go()throws ArithmeticException {
System.out.println("Super class go method");
return 0;

	}
	public void go1(){
		System.out.println("go1 method in super class");
	}
}
class b extends narrowwider{
	public  int go() throws ArithmeticException{
		System.out.println("subclass class go method");
		return 1;
			}
}
public class narrowandwiderExceptions {

	public static void main(String[] args) {
		narrowwider b=new b();

	b.go1();

	}

}
