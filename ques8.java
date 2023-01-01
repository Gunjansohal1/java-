package assignment1;

import java.util.Scanner;

public class ques8 {
//Write a Java Program to find the perimeter of a rectangle
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter length and breadth");
     Scanner t=new Scanner(System.in);
     int length=t.nextInt();
     int breadth=t.nextInt();
     int perimeter=2*(length+breadth);
     System.out.println("the perimeter of given numbers is "+perimeter);
	}

}
