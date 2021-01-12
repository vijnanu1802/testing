package stringspack;
class Strings{
	String s="The quick brown fox jumps over the lazy dog";
	void methodstring(){
		char ch[]=s.toCharArray();
			System.out.println(ch[12]);
	}
}
public class indexvisetraverse {

	public static void main(String[] args) {
Strings ss=new Strings();
ss.methodstring();
	}

}
