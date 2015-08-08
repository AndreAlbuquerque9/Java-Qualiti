package br.com.qualiti;

public class FibonacciSemRecursao {

	public static void main(String[] args) {
		
		int primeiro = 0;
		int segundo = 1;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 0; i < 10; i++ ){
			
			segundo = segundo + primeiro;
			
			System.out.println(segundo);
			
			primeiro = segundo - primeiro;
			}

	}

}
