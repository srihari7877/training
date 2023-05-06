package day2;

public class Student {
	
	
	
	public Student() { //Student()
		System.out.println("default constructor is called ............");
		
	}
	
	public Student(String studentName) { //Student(String)
		System.out.println("single parameterized constructor is called ............");
		System.out.println("The name of the student is= "+studentName);
		
	}
	
	public Student(String studentName,int marks) { //Student(String,int)
		System.out.println("double parameterized constructor is called ............");
		System.out.println("The name of the student is= "+studentName);
		System.out.println("Marks = "+marks);
		
	}
	
	public Student(int marks) {//Student(int)
		System.out.println("double parameterized constructor is called ............");
		System.out.println("Marks = "+marks);
		
	}
	
	

	public static void main(String[] args) {

		Student s1 = new Student();// Student()

		System.out.println("==============================");

		Student s2 = new Student("Lavanya");// Student(String)

		System.out.println("==============================");
		Student s3 = new Student("Lavanya", 500);// Student(String,int)
		System.out.println("==============================");
		Student s4 = new Student(1000);// Student(int)

	}	

}
