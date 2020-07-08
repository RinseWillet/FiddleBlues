
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class testProgram {

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

	}

}

class A {
	int x = 20;
	String y = "String in A";
	int a;

	A() {
		System.out.println("constructor zonder para in A");

	}

	A(int a) {
		this.a = a;
		System.out.println("constructor met integer in A");
	}

	void printInt() {

		System.out.println(a);
	}

}

class B extends A {
	int x = 35;
	String y = "String in B";

	B() {
		System.out.println("constructor zonder para in B");
	}

	B(int a) {
		this.a = a;
		System.out.println("constructor met integer in B");
	}

	void printInts() {
		System.out.println(a + " - " + x);
	}
}
