package corejava;

import java.util.HashSet;

public class Duplicatesinhyderabad {

	public static void main(String[] args) {
		String s="hyderabad";
		HashSet<String> hm= new HashSet<String>();
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			hm.add(	String.valueOf(ch[i]));			
		}
		System.out.println(hm);
	}

}
