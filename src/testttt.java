
public class testttt {
	
		public static void main(String args[])   {
			new GoudVis();
		}
	}

	class Vis{
		static int a = vullen();
		static {
			System.out.println("1");
		}
		static String b = vul();
		static {
			System.out.println("2");
		}

		static {
			System.out.println("3");
		}
		static int vullen() {
			System.out.println("4");
			return 3;
		}
		static String vul() {
			System.out.println("5");
			return "4";
		}
	}
	class GoudVis extends Vis{
		static int a = vullen();
		static {
			System.out.println("7");
		}
		static String b = vul();
		static {
			System.out.println("8");
		}

		static {
			System.out.println("9");
		}
		static int vullen() {
			System.out.println("10");
			return 3;
		}
		static String vul() {
			System.out.println("11");
			return "4";
		}
	}


