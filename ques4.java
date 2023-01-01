package assignment1;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		//Write a Java Program to swap two numbers//
      System.out.println("enter two numbers");
      Scanner r=new Scanner(System.in);
      System.out.println("enter num1: ");
   int num1 =r.nextInt();
   System.out.println("enter num: ");
     int num2=r.nextInt();
     int p= num1;
     num1=num2;
     num2=p;
     
      System.out.println("after swaping the numbers are "+num1+ " and " +num2);
   
      }

}
