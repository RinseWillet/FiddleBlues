
public class InitializerTest {
	    public static void main(String[] args) {
	        new TestB();
	    }
	}

	class TestA {
	    static {
	        System.out.println("A static initializer block");
	    }
	    static void methodOfA() {
	        System.out.println("A static method");
	    }
	    {
	        System.out.println("A non-static initializer block");
	    }
	    public TestA() {
	        System.out.println("A constructor");
	    }
	    public TestA(String a) {
	        System.out.println(a);
	    }
	}

	class TestB extends TestA {
	    static {
	        System.out.println("B static initializer block");
	    }
	    static void methodOfB() {
	        System.out.println("B static method");
	    }
	    {
	        System.out.println("B non-static initializer block");
	    }
	    public TestB() {
	        super("test");
	        System.out.println("B constructor");
	    }
	}

