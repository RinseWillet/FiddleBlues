
public class ExceptionVoorbeeld {

public static void main (String[] args) {
		
		Mens piet = new Mens();
		Barman sjarl = new Barman();
		sjarl.Biertjeverkopen(piet);
		
	
	}
}

class Mens {
	int geld = 20;

	void overmaken(int bedrag) throws GeldOpException {
		geld -= bedrag;
		if (geld <= 0) {
			try {
				throw new GeldOpException();
			} catch (Exception e) {

			}
		}
		System.out.println("Geld overgemaakt");
	}
}

class Barman {

	void Biertjeverkopen(Mens mens) {
		int biertje = 5;
		try {
			mens.overmaken(biertje);
		} catch (Exception e) {
			System.out.println("Portier Bellen uit de club yo!");
		}
	}
}

class Kaartverkoper {

	void KaartjeVerkopen(Mens mens) {
		int kaartje = 10;
		try {
			mens.overmaken(kaartje);
		} catch (Exception e) {
			System.out.println("Haal de manager erbij yo");
		}
	}
}

class Benzinestation {

	void peutVerkopen (Mens mens) throws GeldOpException {
		int peut = 50;
				try {
					mens.overmaken(peut);
				} catch (Exception e) {
					System.out.println("ID met Foto");
				} finally {
					System.out.println("politie erbij");
				}
	}
}



class GeldOpException extends Exception {

}


