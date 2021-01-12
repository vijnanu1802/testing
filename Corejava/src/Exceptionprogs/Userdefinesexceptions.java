package Exceptionprogs;
import java.util.Scanner;
class myexception extends Exception{
	//String msg;
	myexception(String msg){
		super(msg);
	}
}
public class Userdefinesexceptions {

static int age;
static Scanner sc=new Scanner(System.in);
public static void m() {
	System.out.println("Enter age :");
System.out.println();
age=sc.nextInt();
if(age<18){
	try {
		throw new myexception("this is not correct age");
	} catch (myexception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}	

	public static void main(String args)
	{
/*		user u=new user();
*/	
			m();
		
	}

}
