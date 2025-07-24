package Day4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingName{
public static void main(String[] args) {
	String[] names= {"Arju","Aju","Zeo","Suku","Meena"};
	
	List<String> list=new ArrayList<String>();
	for(int i=0;i<names.length;i++) {
		list.add(names[i]);
	}
	Collections.sort(list);
	System.out.println(list);
}
}