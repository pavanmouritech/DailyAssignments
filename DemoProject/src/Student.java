import java.util.Scanner;

	class stud {
		
	 private int i,n,avg,total;
     private int a[ ]=new int[10];
     public String  st = new String();
     
   public java.util.Scanner scn=new Scanner(System.in);
		void read(){ 
	System.out.println("enter student name");           
		st=scn.nextLine();       
	System.out.println("Enter student ID:");
         n=scn.nextInt();
    System.out.println("Enter 6 subject marks:");
         for(i=0;i<5;i++)
           a[i]=scn.nextInt();
          }
	void calculate(){
		for(i=0;i<5;i++)
         total+=a[i];
               avg=(total/5);
}
	void display(){
		System.out.println("name::"+st);
        System.out.println("Student ID::"+n);
        System.out.println("total::"+total);
        System.out.println("average::"+avg);
}
}
public class Student{ 
	public static void main(String args[ ]){   
		stud s=new stud();
           s.read(); s.calculate();
           s.display();
   }
}
