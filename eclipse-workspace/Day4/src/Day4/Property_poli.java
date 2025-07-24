package Day4;

class Housing{
	int rent;
	int electricity;
	double food;
	double tax;
	
	public void Rent_money(int rent,int electricity) {
		this.rent=rent;
		System.out.println("rent is"+rent);
		this.electricity=electricity;
		System.out.println("electricity bill is:"+electricity);
		System.out.println(rent+electricity);
	}
	public void Rent_money(double food,int tax) {
		this.food=food;
		System.out.println("food expense:"+food);
		this.tax=tax;
		System.out.println("tax is:"+tax);
		System.out.println(food+tax);
	}
}

public class Property_poli {
	public static void main(String[] args) {
		Housing hs=new Housing();
		hs.Rent_money(10000, 500);
		hs.Rent_money(5000,3000);
	}
   

}
