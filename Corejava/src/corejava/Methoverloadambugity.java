package corejava;
class methodoverloadambiguity{
	 void meth(String s){
		System.out.println("String method");
	}
	 void meth(int s){
		System.out.println("Integer method");
	}
}
public class Methoverloadambugity {

	public static void main(String[] args) {
		methodoverloadambiguity m=new methodoverloadambiguity();
		m.meth(null);
	}

}
