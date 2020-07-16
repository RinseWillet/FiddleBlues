
public class SwitchFiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String b = "joop";
		
		switch(b) {
		//case 1: System.out.println("case 1"); //dit mag niet, int is niet te converten naar String
		//case 2: System.out.println("case 2");
		//case 'b' : System.out.println("case 'b'"); dit mag niet, char is niet te converten naar String
		case "joop": System.out.println("case joop");
		default: System.out.println("no valid case");
		
		}
		
		int a =3;
		
		switch (a) {
		case 1: System.out.println("case 1"); //dit mag niet, int is niet te converten naar String
		case 2: System.out.println("case 2");
		case 'b' : System.out.println("case 'b'");
		
		//case "beta" : System.out.println("case 'beta'");//dit mag niet, string is niet te converten naar int
		default: System.out.println("no valid case");
		}
		
		Integer s = 5;
		
		switch (s) {
		case 1: System.out.println("case 1"); //dit mag niet, int is niet te converten naar String
		case 2: System.out.println("case 2");
		//case 'b' : System.out.println("case 'b'"); //dit mag zo niet char is niet automatisch een Integer Wrapper
		case (int) 'b' : System.out.println("case cast 'b'");
		
		//case "beta" : System.out.println("case 'beta'");//dit mag niet, string is niet te converten naar int
		default: System.out.println("no valid case");
		
		
	}

}
}
