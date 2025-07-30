import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_Comparable {

	public static void main(String[] args) {
     Comparator<Integer> c1=new Comparator<Integer>() {
     public int compare(Integer i,Integer j) {
    	 if(i>j) {
    		 return 1;
    	 }
    	 else {
    		 return -1;
            } 
         }
     };
		
      List<Integer> course=new ArrayList<>();
      course.add(10);
      course.add(20);
      course.add(15);
      course.add(6);
	  System.out.println(course);
	  
	  Collections.sort(course);
	  System.out.println(course);
	}
}
	
