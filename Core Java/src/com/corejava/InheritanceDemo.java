package com.corejava;

class Calander{
		public int add(int i, int j) {
			return i+j;
		}
	}
class CalAdv extends Calander{
		public int sub(int i, int j) {
			return i-j;
		}
	}
	
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalAdv c1 = new CalAdv();
		
	int result1 = c1.add(2,3);
	int result2 = c1.sub(8,6);	
	System.out.println(result1);
	System.out.println(result2);
	}
}
