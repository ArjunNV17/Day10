package Day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Javacollection {

	public static void main(String[] args) {
		// adding Courses
    ArrayList<String> courses=new ArrayList<>();
    courses.add("Java");
    courses.add("Python");
    courses.add("Data structure");
    courses.add("Network");
    
    for(String c:courses) {
    	System.out.println(c);
    }
		Set<Integer> courseId=new HashSet<>();
		courseId.add(101);
	    courseId.add(102);
	    courseId.add(101);
	    courseId.add(104);
	    
	    for(Integer i:courseId) {
	    	System.out.println(i);
	    }
	    Map<String,Integer>courseduration=new HashMap<>();
	    courseduration.put("Java",101);
	    courseduration.put("Python",102);
	    courseduration.put("data structure",101);
	    courseduration.put("Network",104);
	
	    for(String d:courseduration.keySet()) {
	    	System.out.println(d+":"+courseduration.get(d));
	    }
	}

}
