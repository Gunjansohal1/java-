package assignment1;

import java.util.Scanner;

public class ques10 {

	public static void main(String[] args) {
	//Write a Java Program Calculate the compound Interest 
System.out.println("Enter principal amount(P),annual interst rate(r),number of times interest rate is compounded per year(n) and time(t)");
Scanner o=new Scanner(System.in);
System.out.println("Enter principle amount(P)");
double P=o.nextInt();
System.out.println("Enter annual interst rate(r)");
double r=o.nextInt();
System.out.println("Enter number of times interest rate is compounded per year(n) ");
double n=o.nextInt();
System.out.println("Enter time period elapsed(t)");
double t=o.nextInt();
double Q=1+(r/n);
double CI =P*(Math.pow(Q, n*t));
System.out.println("The compound interest is "+CI);
	}

}
