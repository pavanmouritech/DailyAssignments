package com.corejava;

class Parent{
	void bike() {
		System.out.println("Hero");
	}
}

class Child extends Parent{
	void cycle() {
		System.out.println("Atluse");
		
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.bike();
		c.cycle();
		Parent p = new Parent();
		p.bike();
	
	}

}
