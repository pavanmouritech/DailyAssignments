package com.demo;

public class FindDemo {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int sum=5;
	        for(int i=0; i<args.length;i++) {
	            sum=sum+Integer.parseInt(args[i]);
	        }
	        System.out.println("Final Result : "+sum);
	    }
}
