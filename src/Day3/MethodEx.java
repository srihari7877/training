package Day3;

public class MethodEx {

	public void m1() {  //m1()
		System.out.println("m1 is called ");
	}

	public void m3(String m) {//m3(String)
		System.out.println(" print local variable m " + m);
	}

	public String m5(String m) {  //m5(String)

		String name = "wel come to ";

		return name + m;
	}
	
	public int  m4() {  //m4(String)

		int i=1000;

		return i;
	}

	public static void m2() {//m2()

		System.out.println("static m2 method is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx.m2();
		
		MethodEx m =new MethodEx();
	int value=	m.m4();
	System.out.println("value is "+value);
	
	String msg =m.m5("Lavanya");
	System.out.println("msg is "+msg); 
	
	}

}
