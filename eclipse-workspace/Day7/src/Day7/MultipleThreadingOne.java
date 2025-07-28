package Day7;

class Mul1{
	 public void display() {
	  for(int i=0;i<=10;i++) {
		  System.out.println("This is arju");
	  }
  }

}
 class Mul2{
	 public void display() {
		 for(int i=0;i<=10;i++) {
			  System.out.println("this is my program");
	 }
 }
 }
 public class MultipleThreadingOne{
 public static void main(String[] args) {
	 Mul1 m1=new Mul1();
	 Mul2 m2=new Mul2();
	 m1.display();
	 m2.display();
 }
 }