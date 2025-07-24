package Day4;

abstract class Vehicle {

  abstract void speed();
 
  abstract void brand();
 
}
class Car extends Vehicle{
	  void speed() {
		  System.out.println("Speed of the car is 40km/hr");
	  }
	  void brand()
	  {
		  System.out.println("The brand is HONDA");
      }
	  
  } 
class Bike extends Vehicle{
    	  void speed() 
    	  {
    		  System.out.println("Speed of vehicleis 70km/hr");
    	  }
    	  void brand()
    	  {
    		  System.out.println("The brand is Yamaha");
          }
    	  
      }

