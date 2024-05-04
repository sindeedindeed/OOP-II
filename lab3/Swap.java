package com.example.ooplab002;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		System.out.println("Number One: "+n1+"\n"+"Number Two: "+n2+"\n");
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping, "+"\n"+"Number One: "+n1+"\n"+"Number Two: "+n2+"\n");
	}
}
