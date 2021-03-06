
public class polymorphFiddle {
	
	public static void main(String args[]) {
		A alfa = new A();
		A beta = new A(5);
		alfa.printInt();
		beta.printInt();
		
		B gamma = new B();
		B delta = new B(23);
		
		gamma.printInt();
		gamma.printInts();
		
		delta.printInt();
		delta.printInts();
		
		A zeta = new B(66);
		System.out.println(zeta.y);
		System.out.println(zeta.x);
		System.out.println(zeta.getClass());
		zeta.printInt();
		
		A joop = new B();
		joop.printInt();
		//C dirk = (C) joop; //classCastException (runtime)
		A henk = (A) delta; //dit mag delta B is-a A en past dus in het kooitje van een A
		//B frits = (B) alfa; //ClassCastException (runtime) : alfa A is niet per se een B
		B iota = (B) zeta; //dit mag, object type van Zeta is B
		
		}

}

class A{
	int x = 20;
	String y = "String in A";
	int a;
	A(){
		System.out.println("constructor zonder para in A");
		
	}
	
	A(int a){
		this.a=a;
		System.out.println("constructor met integer in A");
	}
	
	void printInt() {
		System.out.println("printInt in A");
		System.out.println(a);		
	}
	
	int test (int a) {
		return a+15;
	}
			
}

class B extends A{
	
	int x=35;
	String y="String in B";
	String z="echt de string in B";
	B(){
		System.out.println("constructor zonder para in B");
	}
	
	B(int a){
		this.a=a;
		System.out.println("constructor met integer in B");
	}
	
	void printInt() {
		System.out.println("printInt in B");
		System.out.println(x);
	}
	
	void printInts() {
		System.out.println(a + " - " + x);
	}
	
	
}

class C extends A {
		
	
}

