package collections;

import java.util.HashSet;
class Students{
	int id;
	String name;
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode(){
		return id+name.length();
		
	}
	@Override
	public boolean equals(Object o){
		Students s1=(Students)o;
		return(id==s1.id && name.equals(s1.name));
	}
}
public class hassetduplictesremove {

	public static void main(String[] args) {
HashSet<Students> hs=new HashSet<Students>();

hs.add(new Students(1,"madhu"));
hs.add(new Students(1,"madhu"));
hs.add(new Students(2,"reddy"));
hs.add(new Students(3,"sudha"));
hs.add(new Students(4,"yashu"));

for(Students st1:hs){
	System.out.println(st1);
}
	}

}
