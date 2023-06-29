package edu.global.prj.shape;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
	
		try {
			System.out.print("a/b...a?");
			
			int n1 = kb.nextInt();
			
			System.out.print("a/b...b?");
			int n2 =kb.nextInt();
			
			System.out.println(n1/n2);
			
		} catch (ArithmeticException | InputMisMatchException e) {
			System.out.println(e.getMessage());
				
		}
		
		
		
		System.out.println("Good bye~~")
	}
}
