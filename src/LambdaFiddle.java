
public class LambdaFiddle {

	static {
		
		System.out.println("LambdaFiddle geladen");
	}
	public static void main(String rbc[]) {

		
        
        //with lambda  
        Addable d2= (int e)-> e * 2;  
        Addable d3 =(int e)-> e / e;
        Addable d4= (int e)-> e+e;
        int x= d2.add(5);
        int y= d3.add(25);
        int z =d4.add(22);
        System.out.println(x + y + z);
        Printable p1 = (String e, int q) -> {System.out.println("Dit is de string: " + e + " dit is de int: " + q);};
        p1.print("Joop", 25);
        Integer r = new Integer("66");
        String p = new String("Kees");
        Integer i = new Integer("22");
        p1.print(p, r);
        int w = r + i;
        System.out.println(w);
        System.out.println(r);
        Equity e1 = (D , E) -> {return(D.equals(E));};
        Equity e2 = (D,E) -> {return(D == E);};
        E e = new E();
        D d = new D();
        E joop = new E();
        E kees = new E();
        boolean j = e1.equate(d, e);
        boolean h=e2.equate(e, d);
        System.out.println(j);
        System.out.println(h);
        boolean g=e1.equate(joop, kees);
        boolean o=e2.equate(joop, kees);
        System.out.println(g);
        System.out.println(o);
        E henk = kees;
        boolean l = e1.equate(henk,  kees);
        boolean m = e1.equate(henk,  kees);
        System.out.println(l);
        System.out.println(m);
	}
}
        
        //direct lambda aan methode meegeven
        
 class Z{       
        void testen ()
	}

}

class D {
	String name = "This is D";
	
	static {
		System.out.println("classe geladen");
	}
}

class E extends D {
	String name = "this is E";
}

@FunctionalInterface  //It is optional  
interface Addable extends Printable{  
    public int add(int a);  
}

@FunctionalInterface
interface Printable {
	void print(String a, int b);
}

@FunctionalInterface
  interface Equity {
	boolean equate(Object a, Object b);
}

    
 