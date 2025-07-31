package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1000,2300,1700,2500));
    a.add(1100);
    a.add(6000);
    a.add(800);
    a.add(1900);
    
    System.out.println(a);
    Collections.sort(a);
    System.out.println("Sorted:"+a);
 
    int b=Collections.binarySearch(a,1000);
    System.out.println("Index of 1000 is:"+b);
    Collections.reverse(a);
    System.out.println(a);
    
	}

}
