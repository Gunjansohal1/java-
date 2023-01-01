package assignment1;

import java.util.Scanner;

public class ques5 {
	public static void main(String[] args) {
		//Write a Java Program to find the roots of a quadratic equation.//
		System.out.println("Enter the value of a,b,c from the equation of formax^2+bx+c=0");
		Scanner in=new Scanner(System.in);
int a =in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		double d=Math.pow(b, 2)-(4*a*c);
		double  D= Math.sqrt(d);
		if (D>0) {
			double root1= (-b+D)/(2*a);
			double root2= (-b-D)/(2*a);
			System.out.println("THe roots of given quadratic equation are real and distinct.such that their value is "+root1+" and "+root2 );
			
		}
		else if (D==0) {
			float root1=(-b)/(2*a);
			float root2=root1;
			System.out.println("The roots are real and uniques.therefore roots are "+root1+" and "+root2);
				
		}
		else {System.out.println("The roots are complex and imaginery");
}
}}