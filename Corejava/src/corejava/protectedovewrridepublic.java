package corejava;
class Prooverridepub{
	String s="hello";
	
	 protected void mth(){
	
		 System.out.println("protected method in super class");
	}
	
}
class c5 extends Prooverridepub{
	   protected void mth(){
		System.out.println("public method in sub class");
	}
}
public class protectedovewrridepublic {

	public static void main(String[] args) {
c5 c=new c5();
c.mth();
	}
/* 
 *  public easily overrides that default private and protected vice versa never happened.
 * 	protected easily overrides that default private vice versa never happened.
 * default easily overrides that  private  vice versa never happened.
*/}
