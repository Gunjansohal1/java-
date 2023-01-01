package assignment1;

import java.util.Scanner;

public class ques3 {
	 public static void main(String[] args) {
		 //Write a Java Program to find the quotient and remainder of two numbers //
   Scanner p=new Scanner(System.in);
   System.out.println("enter two numbers");
   int num1=p.nextInt();
   int num2=p.nextInt();
   int quotient ;
   quotient= num1/num2;
   int remainder;
   remainder=num1%num2;
   System.out.println("the quotient and reaminder of givn numbers is "+quotient+" and "+remainder+" respectively");
	 }
}
