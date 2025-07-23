import java.util.Scanner;

public class Project1 
{
  
   private double balance;
   private Scanner sc;
   
   public Project1() 
   {
	   balance=1000;
	   sc=new Scanner(System.in);
   }
   
   public void displaymenu() {
	   System.out.println("ATM Menu");
	   System.out.println("1.Check balance");
	   System.out.println("2.Deposite Money ");
	   System.out.println("3.Withdraw Money");
	   System.out.println("4.Exit");
   }
   public void deposite() 
   {
	   System.out.println("Enter the amount:");
	   double amount=sc.nextDouble();
	   if(amount>0) {
		   balance+=amount;
		   System.out.println(amount +"Has been deposited");
	   }
	   else {
		   System.out.println("Invalid amount");
	   }
	  
   }
   public void withdraw() {
	   System.out.println("Enter the amount:");
	   double amount=sc.nextDouble();
	   if(amount>0 && amount<=balance) {
		   balance-=amount;
		   System.out.println(amount +"Has been withdrawn");
	   }
	   else if(amount>balance){
		   System.out.println("Insufficient Fund.Balance:"+balance);
	   }
	   else {
		   System.out.println("Invalid amount");
	   }
	   
   }
   
   public void checkbalance() 
   {
	   System.out.println("Your Balance :"+ balance);   
	   
   }
   
	public static void main(String[] args)
    {
	  Project1 atm=new Project1();
	  
	  
	  while(true) 
	  {
		  atm.displaymenu();
		  System.out.println("enter your choice:");
		  int choice=atm.sc.nextInt();
		  
		  switch(choice) {
		       case 1:
		    	   atm.checkbalance();
		    	   break;
		       case 2:
		    	   atm.deposite();
		    	   break;
		       case 3:
		    	   atm.withdraw();
		    	   break;
		       case 4:
		    	   System.out.println("Thank you");
		    	   break;
		       default:
		    	   System.out.println("Invalid Choice");
		    	   
		  }
			      
		  
	  }
  }
}
