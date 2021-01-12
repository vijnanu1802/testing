package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Stringandarray {
	public void arrayList(){
		ArrayList<Integer/*/String*/> al=new ArrayList<Integer/*/String*/>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		Collections.sort(al,Collections.reverseOrder());
		
/*		Collections.sort(al);  //  is for sorting order
*/		
/*		System.out.println(al);
*/		
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
public class Stringandintegerarraylist {

	public static void main(String[] args) {
		Stringandarray s=new Stringandarray();
		s.arrayList();
	}

}
