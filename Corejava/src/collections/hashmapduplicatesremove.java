package collections;

import java.util.HashMap;
import java.util.Map;

class Student{
	int id;
	String name;
	int marks;
	Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode(){
		return id+marks+name.length();
	}
	@Override
	public boolean equals(Object obj) {
	  Student empObj = (Student) obj;
	  return this.id == empObj.id
	      && this.name.equals(empObj.name) && this.marks==empObj.marks;
	}
	
}
public class hashmapduplicatesremove {
	public static void main(String[] args) {
		HashMap<Student,Integer>hp=new HashMap<Student,Integer>();
		hp.put( new Student(1,"madhu",70),1);
		hp.put( new Student(1,"madhu",70),2);
		hp.put( new Student(1,"madhu",70),3);
		hp.put( new Student(4,"teja",60),3);
		hp.put( new Student(5,"arif",50),4);
		
		for(Map.Entry<Student,Integer> m:hp.entrySet()){
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}
}
