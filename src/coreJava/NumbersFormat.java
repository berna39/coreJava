package coreJava;

public class NumbersFormat {
	 public static void main(String[] args) {
		double oneMillion = 1000000d;
		
		// may be also written like this :
		oneMillion = 1_000_000d;
		System.out.print("result1 : "+oneMillion);
		
		// may be also written like this :
		oneMillion = 1____000___000d;
		System.out.print("result2 : "+oneMillion);
	}
}
