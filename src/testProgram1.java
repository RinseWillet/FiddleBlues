
public class testProgram1 {

	public static void main(String[] args) {
		YYY y = new YYY();
		// child y = new child
		y.nummer = 33;
		y.qqq();
		y.getal = 99;

		// parent p = new child
		QQQ q = new YYY();

		q.getal = 77;
		q.qqq();
		// q.yyy(); - je kunt dus niet bij de

		Object o = new YYY();
		// o.getal = 4;
		// o = een object van classe YYY

		YYY temp = (YYY) o;
		temp.yyy();
		temp.getal = 11;
		temp.qqq(temp.getal);
		q.qqq();

	}

}

class QQQ {
	int getal;

	void qqq() {
		System.out.println("methode in QQQ");
	}
}

class YYY extends QQQ {
	int nummer;

	void qqq() {
		System.out.println("methode in YYY");

	}

	void yyy() {
		System.out.println("tweede methode in YYY");

	}

	void qqq(int yyy) {
		System.out.println("derde methode in YYY" + yyy);

	}
}
