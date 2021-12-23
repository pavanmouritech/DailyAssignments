package com.corejava;

class Student{
	private int rollno;
	private String name;
	
	public int getRollno() {
		System.out.println("user is accessing the value");
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("value of rollno changed");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setRollno(3);
		s1.setName("Pavan");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}

}
