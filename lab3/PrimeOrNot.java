package com.example.ooplab002;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to check if prime: ");
		int num = obj.nextInt();
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0) {
				count++;
			break;}
		}
		if(count!=0)
			System.out.println("It is not a prime number");
		else
			System.out.println("It is a prime number");
	}
}
