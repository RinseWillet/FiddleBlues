
public class InitializerBlockVoorbeeld {

	public static void main(String[] args) {
		Paard jumper = new Paard();	  
	
	}
}

class Paard{
	static int a=hoi();
	static {
		System.out.println("go6");
	}
	{
		System.out.println("go1");
	}
	{
		System.out.println("go2");
	}
	{
		System.out.println("go3");
	}
	static {
		System.out.println("hoi in static");
	}
	
	static int hoi () {
		System.out.println("hoi in static 2");
		return 4;
	}
	
	
}
