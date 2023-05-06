package com;

public class Test {

	
	public int i;
	{
		i=100;
		System.out.println("instance block is called");
	}
	
	public Test() {
		System.out.println("constructor is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 =new Test();
		Test t2 =new Test();
		System.out.println(t2.i);
	}

}
