package com.corejava;

class Hero{
	 void m1() {
		System.out.println("Hero");
	}
}

class Honda extends Hero{
	 void m2() {
		System.out.println("Honda");
	}
}

class Pulser extends Honda{
	 void m3() {
		System.out.println("Pulser");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulser c = new Pulser();
		c.m1();
		c.m2();
		c.m3();
		
		Honda h = new Pulser();
		h.m1();
		h.m2();
		
		Hero r = new Honda();
		r.m1();
	}

}
