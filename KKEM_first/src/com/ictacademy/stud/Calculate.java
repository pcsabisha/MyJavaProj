package com.ictacademy.stud;

public class Calculate {

	
	public static void main(String[] args) {
		int[] a = {1};
		int[] b = {2};
		
		// TODO Auto-generated method stub
	Calculatefunctions cal=new Calculatefunctions();
System.out.println(cal.simpleinterest(2500.00, 3, 10.0));
System.out.println(cal.compoundinterest(2500, 10, 3)	);


System.out.println(cal.peri_rect(3,4));
System.out.println("before");
System.out.println("a="+a[0]);
System.out.println("b="+b[0]);
Calculatefunctions c=new Calculatefunctions();
c.swap(a,b);
System.out.println("after");
System.out.println("a="+a[0]);
System.out.println("b="+b[0]);
	}

}
