package com.ictacademy.day3;

import java.util.Scanner;

public class Mainfunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		Scanner inp=new Scanner(System.in);
		int no=inp.nextInt();
		Function f=new Function();
		f.setN(no);
		System.out.println("The number from user is"+f.getN());
		int o=1;
		for(int y=0;y<o;y++)
		{System.out.println(y);
		}
		
		Pattern p=new Pattern();
		p.patternprint();
		inp.close();
	}


}