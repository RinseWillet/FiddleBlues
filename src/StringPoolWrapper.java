
public class StringPoolWrapper {

	public static void main(String[] args) {
		  
		// pool string wrapper
		
		Integer a = 5;
		Integer b = 5;
		Integer c = new Integer("5");
		
		System.out.println("Integer met Integer onder 127");
		System.out.println(a == b); //true
		System.out.println("Integer met new Integer('5')");
		System.out.println(a == c); // false
		
		Integer d = 128; // waarden tot 127 worden intern opgeslagen en niet in pool,
		Integer e = 128; // waarden boven 128 maakt ie een nieuw object in de pool
		
		System.out.println("Integer met Integer boven 127");
		System.out.println(d == e); //false
		
		Integer f = 127;
		Integer g = 127;
		
		System.out.println("Integer met Integer 127");
		System.out.println(f == g); //true
		
		String k = "hoi";
		String m = "hoi";
		String n = new String("hoi");
		
		System.out.println("Strings met zelfde waarde 'hoi'");
		System.out.println(k == m); //true
		System.out.println("String met new String('hoi')");
		System.out.println(m == n); //false
		
		int h = 125;
		int i = 125;
		
		int j = 130;
		int l = 130;
		
		System.out.println("int met int");
		System.out.println(h == i); // geen nieuwe objecten, dus true
		System.out.println(j == l); // geen nieuwe objecten, dus true
		
		int o = 2_000_000_000;
		long p = 2_000_000_000L;
		
		System.out.println("long met int - value 2_000_000_000");
		System.out.println(o==p);
		
	}

}
