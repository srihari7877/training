package Day3;

public class DefConstructor {
	
	
	private boolean b;
	private float f;
	
	private int amount;
	// wny we need constructor
	// to intailize during object creation
	public DefConstructor() {
		b=true;
		f=100.00f;
		amount=1000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefConstructor c1= new DefConstructor();
		System.out.println(c1.b);
		System.out.println(c1.amount);
		System.out.println("==============");
		DefConstructor c2= new DefConstructor();
		System.out.println(c2.b);
		System.out.println(c2.amount);
		System.out.println("==============");
		DefConstructor c3= new DefConstructor();
		System.out.println(c3.b);
		System.out.println(c3.amount);
		
	}

}
