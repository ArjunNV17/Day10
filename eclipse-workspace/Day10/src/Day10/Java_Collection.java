package Day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Java_Collection {
     
	class departments{
		private String name;
		private double sales;
		private double expenses;
		
		public departments(String name,double sales,double expenses) {
			this.expenses=expenses;
			this.name=name;
			this.sales=sales;
		}
		public double getProfit() {
			return sales-expenses;
		}
		public String getName() {
			return name;
		}
	}
	public static void main(String[]args) {
		ArrayList<departments> depart=new ArrayList<>();
	    depart.add(new Java_Collection().new departments("sales",10000,2000));	
	    depart.add(new Java_Collection().new departments("marketing",5000,3000));
	    depart.add(new Java_Collection().new departments("research",4000,1000));
	    
	    for(departments d:depart) {
	    	System.out.println(d.getName()+"Profit:"+d.getProfit());
	    }
        depart.sort((d1,d2)->Double.compare(d2.getProfit(),d1.getProfit()));
	    
        
	    System.out.println("Sorted successfully");
	    
	    for(departments d:depart) {
	    	System.out.println(d.getName()+"Profit:"+d.getProfit());
	    }
	    
	
	}
	}
