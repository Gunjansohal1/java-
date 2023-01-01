package assignment1;

import java.util.Scanner;

public class ques7 {

	public static void main(String[] args) {
//Write a Java Program to add two complex numbers//
		System.out.println("Enter real part of first number");
		Scanner w=new Scanner(System.in);
		int a=w.nextInt();
		System.out.println("Enter imaginary part of first number");
		int b=w.nextInt();
		System.out.println("Enter real part of second number");
		int c=w.nextInt();
		System.out.println("Enter imaginary part of second number");
		int d=w.nextInt();
		System.out.println("the sum f complex numbers is "+(a+d)+"+i"+(c+d));
		}

}
