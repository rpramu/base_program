package program;

public class inte {
	
	public static void main(String[] args) {
		a aa = new b();
		aa.m1();
		b ref = (b)aa;
		ref.m1();
	}
}

class a{
	void m1() {
		System.out.println("in m1");
	}
}

class b extends a{
	void m1() {
		System.out.println("in m1");
	}
	
	void m2() {
		System.out.println("in m2");
	}
}
