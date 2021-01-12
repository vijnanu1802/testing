package corejava;
interface interfaceambiguity{
	//void fun();
	void func();
	void fun();
	
}
interface i1{
	void funct();
}
class c1 implements interfaceambiguity,i1{

	@Override
	public void func() {
		System.out.println("inside da func method () ");
	}

	@Override
	public void fun() {
		System.out.println("inside da fun method () ");
	}

	@Override
	public void funct() {
		System.out.println("inside da funct method () in interface i1");		
	}
	
}

class c2 extends c1{
	
}
public class Interfacesambiguity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
