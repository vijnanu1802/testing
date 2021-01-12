package Exceptionprogs;
import java.util.InputMismatchException;
import java.util.Scanner;
class calculator{
	float addResult,subResult,mulResult,divResult;
	Scanner sc=new Scanner(System.in);
	int firstNumber,secondNumber;
	public void input(){
		System.out.println("Enter first number :");
		while (!sc.hasNextInt()) {
		     try {
		        System.out.print("Enter the first number as number : ");
		      sc.next();
		     }
		     catch (InputMismatchException e) {
		        System.out.print("Enter the first number as number :");
		     }
		     }	
	     firstNumber=sc.nextInt();
	
	     System.out.println("Enter second number :");
			while (!sc.hasNextInt()) {
			     try {
			        System.out.println("Enter the second number as number : ");
			      sc.next();
			     }
			     catch (InputMismatchException e) {
			        System.out.println("Enter the second number as number :");
			     }
			     }	
	secondNumber=sc.nextInt();
	
		     System.out.println("First number of your program is :"+firstNumber);
		     System.out.println("Second number of your program is :"+secondNumber);
	}


public void operation(){
	
	System.out.println(" Which type of operation your are going to perform");
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.multipliction");
	System.out.println("4.division");
	int choice;
	 System.out.println("Enter choice number :");
		while (!sc.hasNextInt()) {
		     try {
		        System.out.println("Enter the choice number as number : ");
		      sc.next();
		     }
		     catch (InputMismatchException e) {
		        System.out.println("Enter the choice number as number :");
		     }
		     }	
choice=sc.nextInt();
	switch(choice){
	case 1:{
		input();
		addResult=firstNumber+secondNumber;
		System.out.println("Result of your choice is :"+addResult);
		break;
	}
	case 2:{
		input();
		subResult=firstNumber-secondNumber;
		System.out.println("Result of your choice is :"+subResult);
		break;
	}
	case 3:{
		input();
		mulResult=firstNumber*secondNumber;
		System.out.println("Result of your choice is :"+mulResult);
		break;
	}
	case 4:{
		input();
		try{
		divResult=firstNumber/secondNumber;
		}catch(ArithmeticException e){
			System.out.println("Divided by zero is not applicable");
		}
		System.out.println("Result of your choice is :"+divResult);
		break;
	}
	default :{
		System.out.println("Default value/Please enter number");
	}
	}
	System.out.println("If u want to perform again");
}
}
public class Calculatorprogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch="y";
		calculator c=new calculator();
		do{
		c.operation();
		System.out.println("if u want to perform again");
		ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
		}

}
