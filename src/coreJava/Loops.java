package coreJava;

import java.util.Iterator;
import java.util.Scanner;


import java.lang.Object;

public class Loops {
	 
	public static void main(String[] args) {
		forLoop();
		forLoopWithSteps();
		whileLoop();
		doWhileLoop();
	}
	
	private static void forLoop() {
		// for loop
		for(int i=0; i <= 10; i++) {
			System.out.println("iteration : "+i);
		}
	}
	
	private static void forLoopWithSteps() {
		// for loop with steps
		for(int i=0; i <= 10; i+=2) {
			System.out.println("iteration : "+i);
		}
	}
	
	private static void whileLoop() {
		Scanner scanner = new Scanner(System.in);
		// while loop
		String response = "yes";
		while (response.equals("yes")) {
			System.out.println("do you want to continue (yes or not) ?");
			response =  scanner.nextLine();
		} 
		
		System.out.println("Bye");
	}
	
	private static void doWhileLoop() {
		// do while
		int i = 10;
		do {
			System.out.println(i+" row(s) remaining");
			--i;
		} while (i>0);
	}

}
