package corejava;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Reading{
	
 void fromIO()throws IOException
 {
     System.out.println("Enter data :");
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String name = reader.readLine();
       System.out.println(name);        
	 
 }
 void fromConsoleClass()
 {
	 Console c=System.console();
	 System.out.println("Enter data :");
	 String name = c.readLine();
	 System.out.println(name); 
	     
 }
 void fromSystemScannerClass()
 {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter data :");
     String s = in.nextLine();
     System.out.println("You entered string "+s);
	 System.out.println("Enter data :");
     int a = in.nextInt();
     System.out.println("You entered integer "+a);
	 System.out.println("Enter data :");
     float b = in.nextFloat();
     System.out.println("You entered float "+b);
	 
 }
 
}
public class readinginputsfromkeyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reading r=new Reading();
		r.fromConsoleClass();
		r.fromIO();
		r.fromSystemScannerClass();
	}

}
