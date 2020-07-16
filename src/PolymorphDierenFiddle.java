
public class PolymorphDierenFiddle {

	public static void main(String[] args) {
	Dier beest = new Kat(); //Parent ref type, child object type OKAY
	//Plant plantje = new Dier(); // dit kan uiteraard niet
	
	}

}

class Dier implements Groeien{}

class Kat extends Dier{}

class Paling extends Dier{}

class Plant implements Groeien{}

class Tulp extends Plant{}

interface Groeien{}



