
public class testProgramArraymulti {

	public static void main(String[] args) {

		String x = "abc";
		x.concat("def");
		System.out.println(x); // dit blijft abc, hij heeft een nieuw object gemaakt met "abcdef",
								// maar geen object referentie gemaakt...x verwijsd nog steeds naar object "abc"
		String y = x.concat("def");
		System.out.println(y);

		// telefoon
		// methode bellen EXCEPTION GeenGehoor
		// Geengehoor - t

	}
}
