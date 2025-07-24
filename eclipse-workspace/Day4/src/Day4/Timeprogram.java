package Day4;

public class Timeprogram 
  
 {
   public static void main(String[] args) 
   {
	   
	   String[] task= { "Drinking water","Learn","Lunch time","Watch a movie","workout"};
	  
	   double[] time= {11.00,12.00,01.00,02.00,04.00};
	
	   String a="";
	   
	   for(int i=0;i<time.length;i++) 
	   {
		   if(time[i]>10) 
		   {
			   a="pm";
		   }
		   else 
		   {
			   a="am";
		   }
	   
	   System.out.println("TIME:"+time[i]+a);
	   System.out.println("Task:"+task[i]);
   }
}
}