package com.ictacademy.stud;

public class Calculatefunctions {
	double i,ci;
	double peri;
	
	double simpleinterest(double p, int n,double r)
	{i=p*n*r/100;
		return(i);
	}
	double compoundinterest(double p,double r,int t)

	{
		ci=p*Math.pow((1+(r/100)),t)-p;
		return ci;
	}
	double peri_rect(double l,double b)
	{
		peri=2*(l+b);
		return peri;
	}
	 int[] swap(int[] a,int[] b)
	{
		int[] p = {0,1};
		int y;
		y=a[0];
		a[0]=b[0];
		b[0]=y;
		
		p[0]=a[0];//for testing purpose
		p[1]=b[0];//for testing purpose
		return p;//for testing purpose
		
		
	}
}
