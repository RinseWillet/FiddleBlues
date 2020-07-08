
public class Stringconcat {

public static void main (String[] args) {
		
		String x = "abc";
		x.concat("def");
		System.out.println(x);  //print abc - met de concat is een nieuw object aangemaakt
								// het object is echter niet assigned aan een ref type, dus geen pointer
		String y=x.concat("def");
		System.out.println(y);  //print abcdef - er is hierboven een nieuw object gemaakt met ref type assigned (y)
		
				
	}
}
