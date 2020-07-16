
public class TernaryFiddle {

	public static void main(String[] args) {
		int a = 35;
		char x = a == 36 ? 'a': 'b';
		System.out.println(x);
		//a<36 ? System.out.println("ÿes") : System.out.println("no"); //not allowed to have void methods as return
		double y = a<36 ? 40.8 : 20.1;
		System.out.println(y);
		System.out.println(a<36 ? true:false);
		

	}

}
