
public class WrapperIntegerFiddle {

	public static void main(String args[]) {

		System.out.println("Welke wrappers mag je incrementeren?");
		// welke mogen incrementeren?
		// Integer ja
		System.out.println("Integer: ja");
		Integer getal1 = new Integer("15");

		System.out.println(getal1);

		getal1++;

		System.out.println(getal1);

		// Long ja
		System.out.println("Long: ja");
		Long getal2 = new Long("212121215");

		System.out.println(getal2);

		getal2++;

		System.out.println(getal2);

		// Short ja
		System.out.println("Short: ja");
		Short getal4 = new Short("215");

		System.out.println(getal4);

		getal4++;

		System.out.println(getal4);

		// Byte ja
		System.out.println("Byte: ja");
		Byte getal3 = new Byte("2");

		System.out.println(getal3);

		getal3++;

		System.out.println(getal3);

		// Float ja
		System.out.println("Float: ja");
		Float getal5 = new Float("2.52");

		System.out.println(getal5);

		getal5++;

		System.out.println(getal5);

		// Double ja
		System.out.println("Double: ja");
		Double getal6 = new Double("3.14165944432322");

		System.out.println(getal6);

		getal6++;

		System.out.println(getal6);

		// Character
		System.out.println("Character: ja - maar let op - getalwaarde character");
		Character char1 = new Character('a');

		System.out.println(char1);

		char1++;

		System.out.println(char1);

		// Boolean nee
		System.out.println("Boolean: nee");
		Boolean shouldIStay = new Boolean("tRue");

		System.out.println(shouldIStay);

		// shouldIstay++;

		System.out.println(shouldIStay);

		System.out.println("Is een Wrapper een object?");
		WrapperIntegerFiddle test = new WrapperIntegerFiddle();
		test.wrapperManipulatie(getal1);
		System.out.println(getal1);
		System.out.println("Dus een wrapper is niet een object dat in deze methode veranderd is");
	}

	void wrapperManipulatie(Integer name) {
		System.out.println("Waarde Integer Wrapper in methode voor manipulatie " + name);
		name += 200;
		System.out.println("Wrapper Integer waarde is " + name + " in methode na manipulatie");
	}
}
