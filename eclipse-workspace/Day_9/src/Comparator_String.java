import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

 class Student1 implements Comparable<Student1> {

	public int age;
	public String name;
	
	public Student1(int age,String name) {
	   this.age=age;
	   this.name=name;
	}
	
	public String toString() {
		return "Student [age="+ age+",name="+ name+ "]";

	}

}

public class Comparator_String {

	public static void main(String[] args) {
		Comparator<Student1> com=new Comparator<Student1>() {
			public int compare(Student1 i,Student1 j) {
				if(i.age>j.age)
					return 1;
				else
					return -1;
			}
		};
		// TODO Auto-generated method stub
    List<Student1> stud=new ArrayList<>();
    stud.add(new Student1(22,"Abhiu"));
    stud.add(new Student1(23,"Arjun"));
    stud.add(new Student1(21,"Meena"));
	Collections.sort(stud,com);
    
	for(Student1 s:stud) {
		System.out.println(s);
	}
	}

}