package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee /*Comparable<Employee>*/{
	String name;
	int id;
	int salary;
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	/*@Override    // this is for sorting when we are using comparable interface
	public int compareTo(Employee obj) {
		return name.compareTo(obj.name);
	}*/
	
}

class Externclass implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
/*		return e2.name.compareTo(e1.name);
 *  the above statement is for comparing 
 *  String data
*/	
	if(e1.id==e2.id)
		return 0;
	else if(e1.id<e2.id)
		return 1;
	else return -1;
	}
	
}
public class alwithcomparotorandcomparable {
	public static void main(String[] args) {
		ArrayList<Employee> al=new 		ArrayList<Employee>();
		al.add(new Employee("madhu",1,20000));
		al.add(new Employee("reddy",2,30000));
		al.add(new Employee("sudarshan",3,40000));
		al.add(new Employee("abhi",4,50000));
		al.add(new Employee("yashu",5,270000));

		Collections.sort(al,new Externclass());
		for(Employee st:al){
			System.out.println(st);
		}
	}

}
