package com.ictacademy.day3;

import java.util.Scanner;

public class Pattern {
    void patternprint()
    {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	s.close();
	
}}
