package com.glLab3.main;
import com.glLab3.solution.BalancedBrackets;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		
		System.out.println("Enter the expression : ");
		String expression = sc.nextLine();
		
		if(balancedBrackets.checkExpression(expression)==true) {
			System.out.println("The entered string : CONTAINS BALANCED BRACKETS. \nTherefore, the expression is VALID");
		}
		
		else {
			System.out.println("The entered string DOES NOT CONTAIN BALANCED BRACKETS. \nTherefore, the expression is INVALID");
		}
		
		sc.close();
		
	}

}
