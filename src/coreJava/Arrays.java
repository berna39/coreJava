package coreJava;

import java.util.Iterator;

public class Arrays {
	 public static void main(String[] args) {
		 // basicArray();
		 multidimensionalArray();
	}
	 
	private static void basicArray() {
		int[] numbers = {1,3,4,5,6,7,8,9,0};
		
		System.out.println("Array Length :"+numbers.length);
		System.out.println("First element :"+numbers[0]);
		System.out.println("last element :"+numbers[numbers.length - 1]);
	}
	
	private static void multidimensionalArray() {
		int[][] array = {{1,2,3,4,5},{6,7,8,9,0}};
		System.out.println("Array Length :"+array.length);
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				System.out.println("array row "+(i+1)+", column "+(j+1)+" : "+array[i][j]);
			}
		}
	}
}
