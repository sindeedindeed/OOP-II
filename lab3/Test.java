package com.example.ooplab002;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//System.out.println("Hello BUP");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Class Roll: ");
		int roll=obj.nextInt();
		System.out.println("Enter your Name: ");
		String name=obj.next();
		System.out.println("Enter your CGPA: ");
		double cgpa=obj.nextDouble();
		System.out.println("Roll: "+roll+"\n"+"Name: "+name+"\n"+"CGPA: "+cgpa);
		//
	}
}
