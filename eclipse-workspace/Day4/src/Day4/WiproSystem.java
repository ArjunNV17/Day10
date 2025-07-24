package Day4;

interface Wiprodevice{
	void devicetype();
	void compiletime();
}
class Laptop implements Wiprodevice{
	public void devicetype() {
	System.out.println("Provides Laptop");
	}
	public void compiletime() {
		System.out.println("Laptop is slower");
	}
}
class Desktop implements Wiprodevice{
	public void devicetype() {
		System.out.println("Provides Desktop");
	}
	public void compiletime() {
		System.out.println("Desktop is faster");
}
}

public class WiproSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Wiprodevice wd=new Laptop();
         wd.compiletime();
         wd.devicetype();
         
         Wiprodevice wl=new Desktop();
         wl.compiletime();
         wl.devicetype();
         
	}
	
}

