package corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class dynamicallyadd {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Entrer how many values u want");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1;
		for(int i=0;i<num;i++){
			System.out.println("Enter " +i+ " index value");
			num1=sc.nextInt();
			al.add(num1);
		}
		System.out.println(al);
	}

}
