
public class EqualsFiddle {

	public static void main(String[] args) {
	X alpha = new X();
	X alpha2 = new X();
	Y beta = new Y();
	X Gamma = new Y();
	X Delta = (X) Gamma;
	Y Zeta = (Y)Gamma;
	//Y Eta = (Y) alpha;
	System.out.println("Twee objecten (X en Y die X extends)");
	System.out.println("allebei met String a, maar in X als 'naam X' en in Y als 'naam Y'");
	System.out.println("");
	System.out.println("object en ref type X : " + alpha.a);
	System.out.println("object en ref type Y : " + beta.a);
	System.out.println("object type Y en ref type X : " + Gamma.a);
	System.out.println("object type Y cast as X en ref type X : " + Delta.a);
	System.out.println("object type X cast as Y en ref type Y mag kennelijk niet - ClassCastException line 9");
	System.out.println("ref type (links) bepaald dus de toegang tot variabelen en methoden in obj type EN de waarde");
	System.out.println("");
	System.out.println("maar hoe zit dat met equals?");
	System.out.println("");
	System.out.print("twee objecten van class X? ");
	System.out.println(alpha.equals(alpha2));
	System.out.print("object en ref type X equals object en ref type Y? ");
	System.out.println(alpha.equals(beta));
	System.out.print("object en ref type X equals object type Y en ref type X? ");
	System.out.println(alpha.equals(Gamma));
	System.out.print("object en ref type X equals object type Y cast as X en ref type X? ");
	System.out.println(alpha.equals(Delta));
	System.out.print("object en ref type Y equals object type Y en ref type X? ");
	System.out.println(beta.equals(Gamma));
	System.out.print("object en ref type Y equals object type Y cast as X en ref type X? ");
	System.out.println(beta.equals(Delta));
	System.out.print("object type Y en ref type X (gamma) equals object type Y cast as X en ref type X (delta)? ");
	System.out.println(Gamma.equals(Delta));
	System.out.println("de laatste is true, omdat het object delta een casting is van gamma");
	System.out.print("object type Y en ref type X (gamma) equals object type Y gecast cast als Y en ref type Y (zeta)? ");
	System.out.println(Gamma.equals(Zeta));
	System.out.println("de laatste is true, omdat het object zeta een casting is van gamma");
	System.out.println(" ");
	System.out.println("equals checkt dus of het dezelfde objecten zijn in de Object.equals() methode");
	
	System.out.println("maar wat doet == dan?");
	
	
	
 }
}



class X {
	String a = "naam X"; 
}

class Y extends X{
	String a = "naam Y";
	
}
