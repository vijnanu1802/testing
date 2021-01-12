package corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Remduplicatesinarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(2);
		al.add(5);
		al.add(4);
		System.out.println(al);
		HashSet<Integer> hs=new HashSet<Integer>(al);
		//System.out.println(hs);
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
