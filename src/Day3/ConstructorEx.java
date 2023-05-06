package Day3;

public class ConstructorEx {
	
// we need to intialize the data during object creation that y we need parameterrized constructors
	
//instance variables
	
	
	private int i;
	private String name;
	private int amount;
	
	public ConstructorEx(int k,String n) {//ConstructorEx(int,String)
		i=k;
		name=n;
		amount=1000;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx c1 =new ConstructorEx(10,"lavanya");
		
		System.out.println(c1.i);
		System.out.println(c1.name);
		
		ConstructorEx c2 =new ConstructorEx(20,"ravi");
		System.out.println(c2.i);
		System.out.println(c2.name);
	}

}
