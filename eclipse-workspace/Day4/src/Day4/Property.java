package Day4;

abstract class Realestate{
	abstract void home();
	abstract void apartment();
			
}

class Arju extends Realestate{
	void home() {
		 int food=2000;
     	double rent=15000;
		int expense=20000;
		double total=food+rent+expense;
		System.out.println(total);
	}
	void apartment() {
		 int food=5000;
    	double rent=50000;
		int expense=30000;
		double total=food+rent+expense;
		System.out.println(total);
}
}
	
class Leo extends Realestate{
		void home() {
			 int food=20000;
	     	double rent=150000;
			int expense=200000;
			double total=food+rent+expense;
			System.out.println("total cost of Arju :"+total);
		}
		void apartment() {
			 int food=50000;
	    	double rent=500800;
			int expense=300090;
			double total=food+rent+expense;
			System.out.println("total cost of Leo :"+total);
	}
}

public class Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Realestate re=new Arju();
     re.apartment();
     re.home();
     
     Realestate sc=new Leo();
     sc.apartment();
     sc.home();
     
	}

}

