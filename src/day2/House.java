package day2;

public class House {
	
	private String name;
	private int floor;
	private  int bedrooms;
	
	public static void main(String[] args) {
		House h =new House();
		h.name="lavanya villa";
		h.bedrooms=8;
		h.floor=3;
		
		System.out.println("Name of the house "+h.name);
		System.out.println("No. of  bedrooms "+h.bedrooms);
		System.out.println("No. of  floor "+h.floor);
		
		System.out.println("===============================");
		House h1 =new House();
		h1.name="Srihari villa";
		h1.bedrooms=2;
		h1.floor=1;
		System.out.println("Name of the house "+h1.name);
		System.out.println("No. of  bedrooms "+h1.bedrooms);
		System.out.println("No. of  floor "+h1.floor);
		
	}

}
