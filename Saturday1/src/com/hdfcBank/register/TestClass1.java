package com.hdfcBank.register;

public class TestClass1 {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		class1 demo=new class1();
		
		
		demo.setName("new name");
		demo.setFvar(6.8f);
		demo.setI(9);
		
		String name= demo.getName();
		float fv=demo.getFvar();
		int k=demo.getI();
		
		
		System.out.println("The name is : "+name+"\n float is : "+fv+"\n int is : "+k);
		
		
		
		
	}

}
