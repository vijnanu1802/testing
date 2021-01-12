package collections;

import java.util.HashSet;
import java.util.Iterator;

class Hashsetexample{
	public void hashSet(){
		HashSet<String> hs=new HashSet<String>();
	hs.add("madhu");
	hs.add("reddy");
	hs.add("arif");
	/*System.out.println(hs);*/
	/*Iterator<String>itr=hs.iterator();
	while(itr.hasNext()){
		System.out.println("the values in hashset is :"+itr.next());
	}
	}*/
	for(String st:hs){
		System.out.println(st);
	}
}
}
public class Hashset {
	public static void main(String[] args) {
		Hashsetexample h=new Hashsetexample();
		h.hashSet();
	}

}

