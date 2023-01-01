package assignment1;

import java.util.Scanner;

public class ques9 {
	 public static void main(String[] args) {
		 //Write a Java Program to find the surface area of a sphere
  System.out.println("enter radius to find the area");
  Scanner m=new Scanner(System.in);
  int radius=m.nextInt();
  double pi=3.14;
  double area=4*pi*radius*radius;
  System.out.println("The surface are of sphere is"+area);
  }
}